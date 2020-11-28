
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sopni
 */
public class MonthlyAverage 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner in = new Scanner(System.in);
    while (true)
    {
      System.out.printf("Enter a filename (or q to quit): ");
      String filename = in.next();
      if (filename.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      int column = userInteger("Enter a column: ");
      String name = columnName(filename, column);
      if (name == null)
      {
       System.out.printf("Failed to extract a valid column name for column %d of %s\n",column, filename);
       continue;
      }
      int month = userInteger("Enter a month: ");
      double average = monthlyAverage(filename, column, month);
      if (average == -1.00)
      {
        System.out.printf("In file %s, there is no data for %s for month %d.\n\n",filename, name, month);
      }
      else
      {
        System.out.printf("In file %s, the average %s for month %d is %.2f.\n\n",filename, name, month, average);
      }
    }
    }
    
    public static String columnName(String filename, int column)
    {
    ArrayList<String> lines = readFile(filename);
    if (lines == null)
    {
      return null;
    }
    String s = lines.get(0);
    String[] names = s.split(",");
    if ((column < 0) || (names.length <= column))
    {
      return null;
    }
    return names[column];
    }
    
    public static double monthlyAverage(String filename, int column, int month)
    {
    ArrayList<String> lines = readFile(filename);
    if (lines == null)
    {
      return -1;
    }
    double result = 0.0;
    double count = 0.0;
    for (int i = 1; i < lines.size(); i++)
    {    
      String s = lines.get(i);
      String[] colm = s.split(",");
      String date = colm[0];
      int lm = getMonth(date);
      if (lm != month)
      {
        continue;
      }
      String ct = colm[column];
      double value = Double.parseDouble(ct);
      result = result + value;
      count = count++;
    }
    if (count == 0)
    {
      return -1;
    }
    return result/count;
    }

    public static int userInteger(String message)
    {
    Scanner in = new Scanner(System.in);
    int result;
    while (true)
    {
      System.out.printf(message);
      String s = in.next();
      if (s.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      try
      {
        result = Integer.parseInt(s);
      } 
      catch (Exception e)
      {
        System.out.printf("%s is not a valid number.\n", s);
        continue;
      }
      return result;
    }
    }
    
    public static int getMonth(String date)
    {
    String[] s = date.split("[/ ]");
    if (s.length < 2)
      {
    return 0;
      }
    String ms = s[1];
    int result = 0;
    try
      {
        result = Integer.parseInt(ms);
      }
    catch (Exception e)
      {
        return 0;
      }
      return result;
      
     }
    public static ArrayList<String> readFile(String filename)
    {
    File temp = new File(filename);
     Scanner input_file;
    try
    {
    input_file = new Scanner(temp);
    }
    catch (Exception e) {
      System.out.printf("Failed to open file %s.\n",filename);
      return null;
    }
    ArrayList<String> result = new ArrayList<String>();
    while(input_file.hasNextLine())
    {
      String s = input_file.nextLine();
     result.add(s);
    }
    input_file.close();
    return result;
  } 

}
