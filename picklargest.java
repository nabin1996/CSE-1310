/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sopni
 */
public class picklargest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      double[] a = {3.2, 2.1, 5.3, 8.0, 4.9, 5.7};
      double[] b = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
      double[] result = picklargest(a,b);
      printDoubleArray("a", a);
      printDoubleArray("b",b);
      printDoubleArray("result", result);
    }
    
    public static double[] picklargest(double[] a, double[] b)
    {
        if(a.length!=b.length)
        {
            return null;
        }
        double[] result = new double[a.length];
            for(int i=0;i<a.length;i++)
            {
                if(a[i] > b[i]);
                {
                    result[i] = a[i];
                }    
                 
                {
                    result[i] = b[i];
                }
            }
                return result;
                
    }            
        public static void printDoubleArray(String name, double[] a)
        {
         System.out.printf("%6s: ", name);
         if (a == null)
         {
             System.out.printf("Null array\n\n");
             return;
         }
         for (int i = 0; i < a.length; i++)
         {
             System.out.printf("%6.1f", a[i]);
         }
         System.out.printf("\n");
         }
        
    }
    

