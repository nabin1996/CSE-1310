
import static java.awt.PageAttributes.MediaType.A;
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
public class MinimumLength {

    /**
     * @param args the command line arguments
     */
    
    public static int findMinimumLength(ArrayList<String> A)
    {
        if (A.size()==0)
        {
            return -1;
        }
        String min = A.get(0);
        int position = 0;
        for (int i =1; i <A.size(); i++)
        {
         String s = A.get(i);
         if(s.length()<min.length())
         {
             min = s;
             position =i;
             
         }    
        }  
        return position;
    }
    public static void removeMinimumLength( ArrayList<String> A)
    {
        if(A.size() ==0)
        {
         return;
        } 
        int position = findMinimumLength(A);
        A.remove(position);
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
      System.out.printf("Failed to open file %s\n", filename);
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
    ArrayList<String> a = readFile(filename);
    if (a == null)
    {
      System.out.printf("Exiting...\n");
      System.exit(0);
    }
    
    while(true)
    {
      System.out.println(a);
      int position = findMinimumLength(a);
      System.out.printf("minimum position = %d\n\n", position);
      if (a.size() == 0)
      {
        break;
      }
      removeMinimumLength(a);
    }
 }
}
