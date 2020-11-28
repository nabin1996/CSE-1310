
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
public class printcoded {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
    Scanner in = new Scanner (System.in);
    String sources = "abcdefghijklmnopqrstuvwxyz";
    String targets = "bcdefghijklmnopqrstuvwxyz";
    while (true)
        {
        System.out.printf("Enter some word, or q to quit: ");
        String word = in.next();
        if (word.equals("q"))
            {
            System.out.printf("Exiting....\n");
            System.exit(0);
            }
        printCoded(word, sources, targets);             //this  function returns nothing
        System.out.printf("\n");
        }
            
    }
    public static void printCoded(String text, String sources, String targets)
    {
        for ( int i = 0; i <text.length(); i++)
        {
            char c = text.toLowerCase().charAt(i);
            int index = sources.indexOf(c);
            char c1 = targets.charAt(index);
            if (index >=0)
            {
                System.out.printf("%c",c1);
               
            }   
            else 
            {
             System.out.printf("%c, c");
            }
                  
        }    
    }        
    
}
