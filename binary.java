
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
public class binary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        while (true)
        {
            System.out.printf("Please enter you input, or q to quit: ");
            String input = in.nextLine();
            if (input.equals("q"))
            {
                System.out.printf("Exiting.....\n");
                System.exit(0);
            }
            if (checkValid(input)==false) //calling function
            {
                System.out.printf("Error: invalid input,please try again.\n");
                continue;
            }
            char symbol = findOperatorSymbol(input); //calling functions
            int position = findOperatorPosition(input);
            String first = getFirstNumber(input);
            String second = getSecondNumber(input);
            String result = computeBinaryOperation(input);
            System.out.printf("operator position = %d\n", position);
            System.out.printf("operation = %c\n", symbol);
            System.out.printf("the first number is %s\n", first);
            System.out.printf("the second number is %s\n", second);
            System.out.printf("result = %s\n", result);
        }
            
  }

    public static boolean checkValid(String input)
    {
            if (input.length()==0)
            {
                return false;
            }
            int counter = 0;
            for (int i =0; i < input.length(); i++)
                {
                char c = input.charAt(i);
            
            if ("01+-".indexOf(c) < 0)
                    {
                return false;
                    }
                if ("+-".indexOf(c) >=0)
                       {
                    counter++;
                        }
                }
            if (counter !=1)
            {
                return false;
            }
            char start = input.charAt(0);
            char end = input.charAt(input.length()-1);  
            if ("01".indexOf(start) < 0)
            {
                return false;
            }
                if ("01".indexOf(end) < 0)
                {
                return false;
                }
              
                return true;
            
   }
    public static char findOperatorSymbol(String input)
    {   
        char symbol = ' ';
        if (input.indexOf('+')>0)
            symbol = '+';
        if (input.indexOf('-')>0)
            symbol = '-';
        return symbol;
    }
    public static int findOperatorPosition(String input)
    {
     char symbol;
     int position;
     symbol = findOperatorSymbol(input); //function call
     position= input.indexOf(symbol);
     return position;
    }
    public static String getFirstNumber(String input)
    {
        int position;
        position = findOperatorPosition(input); //function call
        return input.substring(0,position);
        }
    public static String getSecondNumber(String input)
    {
        int position;
        position = findOperatorPosition(input); //function call
        return input.substring(position+1);
    }
    public static String computeBinaryOperation(String input)
    {
        int firstNum;
        int secondNum;
        firstNum = binaryToDecimal(getFirstNumber(input)); //function call
        secondNum= binaryToDecimal(getSecondNumber(input));
        int result=0;
        char symbol = findOperatorSymbol(input);
        if (symbol == '+')
        {
            result = firstNum + secondNum;
        }
        else if (symbol =='-')
        {
            result = firstNum - secondNum;
        } 
        return decimalToBinary(result); //function call
       
    }
    public static String decimalToBinary(int num)
    {
        String start = "";
        if (num < 0)
        {
            start = "-";
            num = -num;        
        }
        String result = "";
        while (true)
            {
            int remainder = num %2;
            String digit = Integer.toBinaryString(remainder);
            result = result + digit;
            num = num /2;
            if (num ==0)
                {
                break;
                }    
            } 
        return start+result;
    }
    public static int binaryToDecimal(String input)
    {
        int num = 1;
        if (input.charAt(0) =='-')
        {
            num = -1;
            input = input.substring(1);
            
        }
        int result = 0;
        String digits = "01";
        for ( int i = 0; i <input.length(); i++)
        {
            String s = input.substring(i, i+1);
            int digit = digits.indexOf(s);
            if (digit == -1)
            {
                System.out.printf("Error: invalid input");
                System.exit(0);
            }    
            int power = (int) (Math.pow(2, input.length()-i-1));
            result = result + (digit * power);
            
        }
        return num*result;
    } 
}