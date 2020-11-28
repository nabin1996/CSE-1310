
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
public class dayofweek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner in = new Scanner (System.in);
 while (true)
 {
     int year = userInteger("Enter a year(must be >=1000): "); //calling function
     if (year< 1000)
     {
         System.out.printf("Invalid input, try again.\n");
         continue;
     }
     int month = userInteger("Enter a month (must be between 1 and 12): ");
    if (month > 12 || month < 1)
    {
        System.out.printf("Invalid input. Try again.\n");
        continue;
    }
    int day = userInteger("Enter a day: ");
    int result = daysPassed(year, month, day);  //calling function
     System.out.printf("%d days have passsed from 12/31/999 to %d/%d/%d.\n", result, month, day, year);
     String dayname = dayOfWeek(year, month,day); //calling function
     System.out.printf("%d/%d/%d is a %s.\n", month, day, year, dayname);
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
    public static int daysPassed(int year, int month, int day)
    {
        int result=0;
        for (int i = 1000; i < year ; i++)
        {
           result = result + yearDays(i); 
        }
        for (int j = 1; j<month; j++)
        {
            result = result + monthDays(year,j);
        }
        result = result + day; //total number of days
        return result;
    }
    public static String dayOfWeek(int year, int month, int day)
    {
        int result = daysPassed(year, month, day);
        int remainder = result % 7 ;
        if ( remainder == 0)
        {
            return "Tuesday";
        }
        if ( remainder == 1)
        {
            return "Wednesday";
        }
        if (remainder == 2)
        {
            return "Thursday";    
        }
        if (remainder ==3)
        {
            return "Friday";
        }
        if (remainder == 4)
        {
            return "Saturday";
        }
        if (remainder ==5)
        {
            return "Sunday";
        }
        else
        {
            return "Monday";
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

