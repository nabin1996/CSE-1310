/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sopni
 */
public class ArraySquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      double[] a = {3.2, 2.1, 5.3, 8.0, 4.9, 5.7};
      double[] b = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
      double[] result = arraySqaure(a);
      printDoubleArray("a", a);
      printDoubleArray("arraySquare(a)", result);
      double[] result1 = arraySqaure(b);
      System.out.printf("\n");
      printDoubleArray("b", b);
      printDoubleArray("arraySquare(b)", result1);
    }
    public static double[] arraySqaure(double[] x)
    {
        double [] result = new double[x.length];
        for (int i = 0; i <x.length; i++)
        {
            result[i] = x[i] * x[i];
           
        }
        return result;
    }
    public static void printDoubleArray(String name, double[] a)
    {
         System.out.printf("%15s: ", name);
         if (a == null)
         {
             System.out.printf("Null array\n\n");
             return;
         }
         for (int i = 0; i < a.length; i++)
         {
             System.out.printf("%6.2f", a[i]);
         }
         System.out.printf("\n");
         }
    }        

