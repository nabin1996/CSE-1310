
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
public class Countvowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        countVowels("cvin1.txt");
    }
    public static void countVowels(String in_file)
    {
    ArrayList<String> lines = readFile(in_file);
    String letter = "aeiou";
    int[] counters = new int[letter.length()];
    for (int i = 0; i < lines.size();i++)
    {
        String line = lines.get(i).toLowerCase();
        for (int j =0; j < line.length(); j++)
        {
         char c = line.charAt(j);
         int index = letter.indexOf(c);
         if (index >-1)
         {
             counters[index]++;
         }    
        }    
    }
    for (int i = 0; i<letter.length(); i++)
    {
        char c = letter.charAt(i);
        int counter = counters[i];
        System.out.printf("%c: %d times\n", c,counter);
    }    
    }
    public static ArrayList<String> readFile(String filename)
    {        
    File temp = new File(filename);
    Scanner in_file;
    try 
    {
        in_file = new Scanner(temp);    
    }
    catch (Exception e)
    {
        System.out.printf("Error in opening file for reading.\n");
        return null;
    }
    ArrayList<String> result = new ArrayList<String>();
    while (in_file.hasNextLine())
    {
     String line = in_file.nextLine();
     result.add(line);
    }
    in_file.close();
    return result;
    
    
    }  
}
