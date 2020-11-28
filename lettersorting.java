/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sopni
 */
import java.util.Scanner;
public class lettersorting {

    /**
     * @param args the command line arguments
     */
    public static String sortLetters(String text)
    {
    text = text.toLowerCase();
    String result = "";
    String az = "abcdefghijklmnopqrstuvwxyz";
    for (int i = 0; i < az.length(); i++)
    {    
     for (int j = 0; j < text.length(); j++)
     {         
      if (text.charAt(j) == az.charAt(i))
      { 
       result = result+text.charAt(j);
          
      }
     }
    } 
     return result;
    }
    
    public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    
    while (true)
    {
      System.out.printf("Enter some text, or q to quit: ");
      String text = in.nextLine();
      if (text.toLowerCase().equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      
      String result = sortLetters(text);
      System.out.printf("Result: %s.\n\n", result);
    }
  }
}  
    

