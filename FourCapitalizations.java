/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashre
 */import java.util.Scanner;
public class FourCapitalizations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {  // TODO code application logic here
    }Scanner in = new Scanner(System.in);
    System.out.printf("Please enter a string: ");
    String s1 = in.nextLine();
    String first = s1.substring(0,1);
    int length = s1.length();
    String second = s1.substring(1, length);
     first = first.toUpperCase();
    second = second.toLowerCase();
    String third = first + second;
    System.out.printf("1st version: %s\n",s1);
    System.out.printf("2nd version: %s\n",s1.toUpperCase());
    System.out.printf("3rd version: %s\n",s1.toLowerCase());
    System.out.printf("4th version: %s\n",third );
    
    
    
    
}
}