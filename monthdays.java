
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
public class monthdays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        while(true)
        {
         int year = userInteger("Enter a year(must be >0): "); //calling function
         int month = userInteger("Enter a month (must be between 1 and 12): ");
         if ( month > 12 || month<1)
         {
             System.out.printf("Invalid input, try again.\n");
             continue;
         }
         int resultDY = yearDays(year); //calling function
         int resultDM = monthDays(year, month);
         System.out.printf("Year %d has %d days.\n", year, resultDY);
         System.out.printf("Month %d, %d has %d days.\n", month, year, resultDM);
        }    
    }
    public static int userInteger(String message)
    {
        Scanner in = new Scanner(System.in);
        int result;
        while (true)
        {
            //int result;
            System.out.printf(message);
            String msg = in.next();
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
                System.out.printf("It is invalid input.\n");
                continue;
            }
            return result;
            
        }    
    }        
    public static boolean isLeapYear(int year)
    {
        if (year % 100 == 0)
        {
            if (year % 400 ==0)
            {
                return true;
            }
            else
            {
              return false;
            }    
        }
        else
        {
          if (year %4 ==0)
          {
              return true;
          }
          else 
          {
              return false;
          }
        }
    }
    public static int yearDays(int year)
    {
        if (isLeapYear(year))
        {
            return 366;
        }
        return 365;
       
    }
    public static int monthDays(int year, int month)
    {
    if (isLeapYear(year))
        {
        return 29;
        }
    if (month== 1 || month == 3 || month == 5 || month == 7 ||month == 8 || month ==10 || month ==12)
        {
        return 31;
        }
    if (month == 4 || month== 6 || month == 9 || month == 11)
        {
        return 30;
        }
    return 28;
    }
}
