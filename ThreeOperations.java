/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashre
 */import java.util.Scanner;
public class ThreeOperations 
{
Scanner in = new Scanner(System.in);
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.printf("Please enter a real number N1: ");
   double N1 = in.nextDouble();
      System.out.printf("Please enter a real number N2: ");
   double N2 = in.nextDouble();
      System.out.printf("%f*%f = %2f\n", N1,N2,N1*N2);
      System.out.printf("%f/%f = %2f\n", N1,N2,N1/N2);
      System.out.printf("%f raised to the power of %f= %2f\n",N1,N2,Math.pow(N1,N2));
             
    }
    
}
