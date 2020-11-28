
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
public class GetMonth 
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
      printMonths(filename);
      System.out.printf("\n");
    }
    }
    
    public static int getMonth(String date)
    {
      String[] s = date.split("[/]");
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
    
    public static void printMonths(String filename)
    {
    ArrayList<String> lines = readFile(filename);
    if (lines == null)
    {
      return;
    }
    for (int i = 1; i < lines.size(); i++)
    {    
      String s = lines.get(i);
      String[] col = s.split(",");   
      String date = col[0];
      int lm = getMonth(col[0]);
      System.out.printf("row %d, month = %d\n", i, lm);
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
      System.out.printf("Failed to open file %s.\n", filename);
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
