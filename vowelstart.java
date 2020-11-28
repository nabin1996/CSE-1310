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
public class vowelstart {

    /**
     * @param args the command line arguments
     */
    public static boolean startsWithVowel(String word)
    {
     char c = word.charAt(0);
     if ("aeiouAEIOU".indexOf(c) != -1)   
     {
      return true;
     }
     else 
     {
      return false;
     } 
     }       
            
    public static void main(String[] args) 
    {
    Scanner in = new Scanner (System.in);
     while(true)
     {    
      System.out.printf("Enter some word, or q to quit: ");
      String word = in.next();
      if (word.equals("q") || word.equals("Q"))
      {
      System.out.printf("Exiting......\n");
      System.exit(0);
      }   
      boolean result = startsWithVowel(word);
      if(result == true)
      {
       System.out.printf("Yes, %s starts with a vowel.\n", word);
      }
      else
      {
       System.out.printf("No, %s does not start with a vowel.\n", word);
      }    
      }    
        // TODO code application logic here
    }
    
}
