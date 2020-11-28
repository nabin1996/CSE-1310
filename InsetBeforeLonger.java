
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
public class InsetBeforeLonger {

    /**
     * @param args the command line arguments
     */
    
    public static void insertBeforeLonger(ArrayList<String> A,String x) 
    {
        for(int i =0; i <A.size(); i++)
        {
            String s = A.get(i);
            if(x.length() < s.length())
            {
                A.add(i,x);
                return;
            }    
                }
        A.add(x);
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

  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.printf("Please enter the name of the input file: ");
    String filename = in.nextLine();
    ArrayList<String> input_list = readFile(filename);
    if (input_list == null)
    {
      System.out.printf("Exiting...\n");
      System.exit(0);
    }
    
    ArrayList<String> output_list = new ArrayList<String>();
    for (int i = 0; i < input_list.size(); i++)
    {
      String item = input_list.get(i);
      insertBeforeLonger(output_list, item);
      System.out.println(output_list);
    }  
  }
}
