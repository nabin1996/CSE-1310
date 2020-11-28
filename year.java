
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
public class year 
{

    /**
     * @param args the command line arguments
     */
    public static boolean isLeapYear (int year)
    {
        if (year %100 == 0)
        {
           if (year % 400==0)
           {
               return true;
           }    
           else 
           { return false;
           }
           }
        else 
        {
            if(year %4==0)
            {
                return true;
            } 
            else
            {
                return false;
            }    
            }    
    }
    

    public static int userInteger(String message)
    {
        Scanner in = new Scanner (System.in);
        int result; 
        while(true)
        {
            System.out.printf(message);
            String word = in.next();
            if (word.equals("q") || word.equals("Q"))
            {
             System.out.printf("Exiting.....\n");
             System.exit(0);
            }
            try
            {
             result = Integer.parseInt(word);
            }
            catch (Exception e)
            {
            System.out.printf("%s is not a valid integer.\n",word);
             continue;
            }
            //int result
            if (result <=0)
            {
             System.out.printf("%d is not >=1.\n", result);
            }
            else 
            {    
             //System.out.println(result);
            return result;
            }
                
            
        }
    }
    public static void main (String[] args)
    {
      Scanner in = new Scanner (System.in);
      while(true)
      {
       int year = userInteger("Please enter a year >=1, or q to quit: ");
       boolean result = isLeapYear(year);
       if (result == true)
       {
        System.out.printf("Yes, %d is a leap year.\n", year);
       }
       else
       {
        System.out.printf("No, it is not a leap year.\n", year);
       }
          
      }    
    }        
    
}
        
