
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
public class ColumnSum 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
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
      double sum = columnSum(filename, column);
      System.out.printf("In file %s, column %d has sum %.2f\n\n",filename, column, sum);
    }
    }
    
    public static double columnSum(String filename, int column)
    {
    ArrayList<String> lines = readFile(filename);
    if (lines == null)
        {
            return 0.0;
        }
    double result = 0.0;
    for (int i = 1; i < lines.size(); i++)
        {    
            String s = lines.get(i);
            String[] columns = s.split(",");
            if ((column < 0) || (columns.length <= column))
             {
                continue;
             }
      String ct = columns[column];
      double value = 0.0;
      try
        {
            value = Double.parseDouble(ct);
        }
      catch (Exception e)
        {
            continue;
        }
      result += value;
        }
    return result;
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
    
    public static ArrayList<String> readFile(String filename)
    {
    File temp = new File(filename);
    Scanner input_file;
    try
        {   
            input_file = new Scanner(temp);
        }
    catch (Exception e)
        {
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

