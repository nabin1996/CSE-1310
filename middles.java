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
public class middles {

    /**
     * @param args the command line arguments
     */
    public static double pickMiddle(double first, double second, double third)
    {
      if ((first <= second) && (second <= third))
      {
       return second;   
      }
      if ((first >= second) && (second >= third))
      {
       return second;
      }    
      if ((first <= second) && (second >= third))
      {
       return third;
      }  
      if ((first >= second) && (third >= second))
      {
       return first;
      }
      if ((first <= second) && (second >= third))
      {
       return first;
      } 
      else 
      {
       return third;
      }    
      
    }
    public static double userDouble (String message)
    {
    Scanner in = new Scanner (System.in);
    double result;
    
    while (true)
    {
     System.out.printf(message);
     String word = in.next();
     if (word.equals("q") || word.equals("Q"))
     {
      System.out.printf("Exiting......\n");
      System.exit(0);
     }
     try
     {
      //result = Integer.parseInt(word);
         result = Double.parseDouble(word);
     }
     catch (Exception e)
     {
     System.out.printf("%s is not a valid doube.\n", word);
     continue;
     }
     return result;
    }    
    }
    public static void main(String[] args)
    {
    Scanner in = new Scanner (System.in);
    while (true)
    {
     double first = userDouble("Please enter the first number, or q to quit: ");
     double second = userDouble("Please enter the second number, or q to quit: ");
     double third = userDouble("Please enter the third number, or q to quit: ");
     double middle = pickMiddle(first, second, third);
     System.out.printf("the middle value is %.1f\n", middle);
    }    

    }
    
}
