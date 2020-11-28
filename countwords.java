
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
public class countwords {

    /**
     * @param args the command line arguments
     */
    
        public static int countWords(String text)
        {
        int counter = 0;
        char previous = ' ';
        for( int i = 0; i<text.length(); i++)
            {
            char c = text.charAt(i);
            if ((c != ' ') &&(previous == ' '))
                {
                counter ++;
                }
            
                 
                previous = c;
                  
            
            }
           return counter; 
        }
    

public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        while (true)
        {
            System.out.printf("Enter some text, or q to quit: ");
            String text = in.nextLine();
            if (text.equals("q"))
            {
                System.out.printf("Exiting.....");
                System.exit(0);
            }
            int times = countWords(text); //this function is called
            System.out.printf("Counted %d words.\n", times);
        }
    }
}
