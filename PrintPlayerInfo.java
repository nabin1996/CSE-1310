
import java.io.File;
import java.io.FileNotFoundException;
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
public class PrintPlayerInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner in = new Scanner(System.in);
    while (true)
    {
      System.out.printf("\nEnter the name of a file to read: ");
      String filename = in.next();
      String[][] data = readSpreadsheet(filename);
      System.out.printf("\nEnter part of a player's name (or q to quit): ");
      String player = in.next();
      if (player.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      printPlayerInfo(data, player);
    }
    }   
    
    public static void printPlayerInfo( String[][]data, String player)
    {
       for(int i =1; i <data.length; i++)
       {
        int k = 0;
        for(int j =0; j< data[i].length;j++)
        {
         String s = data[i][0];
         if (s.toLowerCase().indexOf(player.toLowerCase()) != -1)
            {
             if (k==0)
            {
                System.out.println("\n");
            }
          System.out.printf("%21s: %s\n", data[0][j], data[i][j]);
          k++;
            }  
        }    
       }
    }
    public static String[][] readSpreadsheet(String filename) 
    {
      ArrayList<String> file = readFile(filename);
      if(file==null)
      {
          return null;
      }
      String [][] result = new String[file.size()][];
      for (int i=0;i<file.size();i++)
      {
          String s = file.get(i);
          result[i]=s.split(",");
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
