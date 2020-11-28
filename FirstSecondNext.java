/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashre
 */import java.util.Scanner;
public class FirstSecondNext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
   System.out.printf("Please enter a string, at least 5 letters long: ");
        String s = in.nextLine();
        char first = s.charAt(0);
        char second = s.charAt(1);
        String next = s.substring(2,5);
   System.out.printf("The first letter of s is %s.\n",first);
   System.out.printf("The second letter of s is %s.\n",second);
   System.out.printf("The third, fourth and fifth letters are %s.\n",next);
   
    }
    
}
