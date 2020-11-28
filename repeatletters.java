
import static java.lang.System.in;
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
public class repeatletters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        while (true)
        {    
        System.out.printf("Enter some text, q to quit: ");
        String text = in.next();
        if (text.equals("q"))
            {
            System.out.printf("Exiting....\n");
            System.exit(0);
            }
        int times = userInteger("Enter number of times(must  be >0): "); //function called 
        repeatLetters(text, times); //it return nothing and the function is called here
        System.out.printf("\n");
        }
    
    }
    public static void repeatLetters(String text, int times)
    {
        for ( int i =0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            //int counter;
            for ( int j =0; j < times ; j++)
            {
                System.out.printf("%c", c);
            }
        }
    }
    public static int userInteger(String message)
    {
         Scanner in = new Scanner (System.in);
         int result = 0;
         while (true)
         {
             //int result;
             System.out.printf(message);
             String msg  = in.next();
             if (msg.equals("q"))
             {
                 System.out.printf("Exiting.....\n");
                 System.exit(0);
             }
             try
             {
             result = Integer.parseInt(msg);
             }
             catch (Exception e)
             {
                 System.out.printf("It is not a valid input.\n");
                 continue;
             }
             if (result <=0)
             {
                 System.out.printf("It is not a valid input.\n");
                 continue;
             }
             return result;
         }
    }        
}
    
