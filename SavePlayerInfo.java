
import java.io.File;
import java.io.PrintWriter;
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
public class SavePlayerInfo 
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
      System.out.printf("\nEnter the name of a file to read: ");
      String input_name = in.next();
      System.out.printf("\nEnter the name of the output file: ");
      String output_name = in.next();
      String[][] data = readSpreadsheet(input_name);
      System.out.printf("\nEnter part of a player's name (or q to quit): ");
      String player = in.next();
      if (player.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      savePlayerInfo(data, player, output_name);
    }
    }
    
    public static String[][] readSpreadsheet(String filename)
    {
    ArrayList<String> lines = readFile(filename);
    if (lines == null)
        {
            return null;
        }
    int rows = lines.size();
    String[][] result = new String[rows][];        
    for (int i = 0; i < lines.size(); i++)
        {
            String s = lines.get(i);
            String [] values = s.split(",");
            result[i] = values;
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
            System.out.printf("Failed to open file %s\n",filename);
            return null;
        }
    ArrayList<String> result = new ArrayList<String>();
    while(input_file.hasNextLine())
        {
            String lines = input_file.nextLine();
            result.add(lines);
        }
    input_file.close();
    return result;
    }
    
    public static void savePlayerInfo(String[][] data, String player, String output_name)
    {
    PrintWriter out = null;
    try
        {
             out = new PrintWriter(output_name);
        }
    catch (Exception e)
        {
            System.out.printf("Failed to open file %s.\n", output_name);
            return;
        }
      if (data == null)
        {
            out.printf("No data has been loaded.\n");
            out.close();
            return;
        }     
    player = player.toLowerCase();
    for (int i = 1; i < data.length; i++)
    {
      String s = data[i][0].toLowerCase();
      if (s.indexOf(player) >= 0)
      {
        for (int j = 0; j < data[i].length; j++)
        {
          if (j >= data[0].length)
          {
            break;
          }
          out.printf("%21s: %s\n", data[0][j], data[i][j]);
        }
        out.printf("\n");
      }
    }
    out.close();
  }  
}
