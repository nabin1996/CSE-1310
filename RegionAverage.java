/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sopni
 */
public class RegionAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        double[][] a = { {3.2, 2.1, 5.3}, {8.0, 4.9, 5.7},{18.0, 14.9, 15.7},{28.0, 24.9, 25.7},{38.0,34.9,35.7}};
        printDoubleMatrix("a",a);
        double result = regionAverage(a, 0, 3, 1, 2);
        System.out.printf("regionAverage(a, 0, 3, 1, 2) returned %5.2f.\n", result);
        double result1 = regionAverage(a, 2, 4, 0, 2);
        System.out.printf("regionAverage(a, 2, 4, 0, 2) returned %5.2f.\n", result1);

    }
    public static double regionAverage(double[][]a , int top, int bottom, int left, int right)
    {
       if ((top < 0) || (bottom >= a.length))
       {
           return 0;
       }
       if ((left < 0) || (right >= a[0].length))
       {
           return 0;  
       }
       double sum = 0.0;
       double counter = 0.0;
       for (int i = top; i <= bottom; i++)
       {
         for (int j = left; j<= right; j++)
         {
             sum += a[i][j];
             counter += 1.0;
                     
         }   
       }
       double result = sum/counter;

       return result;
    } 
    
    public static void printDoubleMatrix(String name, double[][]a)
    {
         System.out.printf("%s: \n", name);
         //if (a == null)
       
        for (int i = 0; i < a.length; i++)
         {
             for (int j = 0; j < a[i].length; j++)
             {    
             System.out.printf("%5.1f", a[i][j]);
         }
         System.out.printf("\n\n");
         }
    
     }
}
