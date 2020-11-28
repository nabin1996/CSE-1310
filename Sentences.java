/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashre
 */import java.util.Scanner;
public class Sentences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner in = new Scanner(System.in);
        System.out.print("Enter the first noun: ");
   String first_noun = in.next();
        System.out.printf("Enter the second noun: ");
   String second_noun = in.next();
   System.out.printf("Enter a verb: ");
   String verb = in.next();
   System.out.printf("The %s%s over the %s.\n", first_noun, verb, second_noun);
   
        
    }
    
}
