/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author sopni
 */
public class Numerion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer N: ");
        int N = in.nextInt();
        boolean b = false; 
        int i = 1;
        while (i<N) 
        {
            int j = i*i+i;
            if (j == N)
            {
                b = true;
              
            }
            i += 1;
        }
        if (b)
        {
            System.out.printf("%d is a holy number in Numerion.\n", N);
        }
        else 
        {
            System.out.printf("%d is not a holy number in Numerion.\n", N);  
        }
        {
           
        System.out.printf("Exiting...\n");
    
        }


    
        }
    
         }
