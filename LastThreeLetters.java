/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashre
 */import java.util.Scanner;
public class LastThreeLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter a string, at least 3 letters long: ");
        String s = in.nextLine();
        int length = s.length();
        String ending = s.substring(length-3,length);
        System.out.printf("The last three letters are %s.\n",ending);
    }
    
}
