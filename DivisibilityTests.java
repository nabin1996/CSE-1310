/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashre
 */import java.util.Scanner;
public class DivisibilityTests{ 

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter an integer:");
        int input = in.nextInt();

        if (input < 0) {
            System.out.print("The number is negative.");
        } else if ((input % 2 == 0) && (input % 3 == 0)) {
            System.out.println("The number is even and divisible by 3.");
        } else if ((input % 2 == 0) && (input % 3 != 0)) {
            System.out.println("The number is even and not divisible by 3.");
        } else if ((input % 2 != 0) && (input % 3 == 0)) {
            System.out.println("The number is odd and divisible by 3");
        } else {
            System.out.println("The number is odd and not divisible by 3");
        }
    }
}

 
