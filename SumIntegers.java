
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
public class SumIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
    System.out.printf("Please enter the name of the input file: ");  
    String filename = in.nextLine();
 
    int result = sumIntegers(filename);
    System.out.printf("result = %d.\n", result);
  }
    
    public static int sumIntegers(String filename)
    {
     ArrayList<String> input_list = readFile(filename);
     if (input_list == null)
     {
         return 0;
         
     }
     int result = 0;
     for (int i =0; i<input_list.size();i++)
     {
         String s = input_list.get(i);
         int num=0;
         try
         {
            num = Integer.parseInt(s);
         }
         catch (Exception e)
         {
             continue;
         } 
         result += num;
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
    catch (Exception e)
    {
      System.out.printf("Failed to open file %s\n",
                        filename);
     return null;
    }

    ArrayList<String> result = new ArrayList<String>();
    while(input_file.hasNextLine())
    {
      String line = input_file.nextLine();
      result.add(line);
    }
    
    input_file.close();
    return result;
  } 
}
