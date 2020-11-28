/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashre
 */
import java.util.Scanner;
public class ThreeWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
         System.out.printf("Please enter an Integer N: ");
         int N = in.nextInt();
         System.out.printf("Please enter a word with at least %d and at most 20 letters: ",N);
         String a1 = in.next();
         System.out.printf("Please enter a second word with at least %d and at most 20 characters: ", N);
         String a2 = in.next();
     System.out.printf("Please enter a third word with at least %d and at most 20 characters: ",N);
     String a3 = in.next();
     String b1 = a1.substring(0,N);
     String b2 = a2.substring(0,N);
      String b3 = a3.substring(0,N);
     System.out.printf("%20s starts with %s\n",a1,b1);
     System.out.printf("%20s starts with %s\n",a2,b2);
     System.out.printf("%20s starts with %s\n",a3,b3);
     
     
     
     
         
        
    }
    
}
