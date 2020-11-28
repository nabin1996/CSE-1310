/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sopni
 */
public class MatrixSmallest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     double[][]a = {{3.2, 2.1, 5.3}, {8.0, 4.9, 5.7}};
     double[][]b = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}};
     double[][] result = matrixSmallest(a,b);
     printDoubleMatrix("a",a);
     printDoubleMatrix("b",b);
     printDoubleMatrix("result",result);
     }
    
    public static double[][] matrixSmallest(double[][]a , double[][]b)
    {
     int rows = a.length;
     int column = a[0].length;
     if (rows != b.length || column != b[0].length)
     {
         return null;
     }
     double[][] result = new double [rows] [column];
     for (int i = 0; i < a.length; i++)
     {
       for(int j = 0; j< a[i].length; j++)
       {
           if ( a[i][i] < b[i][j])
           {
               result [i][j] = a[i][j];
           }
           else 
           {    
               result[i][j] = b[i][j];
           }   
       }     
     }
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


