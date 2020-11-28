/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sopni
 */
public class ArrayMerge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String[] a= {"Chicago","New York", "Dallas"};
        String[] b= {"Berlin", "London", "Paris", "Rome"};
        String[] result = arrayMerge(a,b);
        printStringArray("a",a);
        printStringArray("b",b);
        printStringArray("result", result);
    }
    public static String[] arrayMerge(String[] a, String[] b)
    {
        String[] result = new String[a.length + b.length];
        for (int i = 0; i < a.length; i++)
        {
            result[i] = a[i];
        }   
        for (int j = 0; j<a.length; j++)
        {
            result[j + a.length] = b[j];
        }
        return result;
    }
    public static void printStringArray(String name, String[] a)
    {
         System.out.printf("%15s: ", name);
         if (a == null)
         {
             System.out.printf("Null array\n\n");
             return;
         }
         for (int i = 0; i < a.length; i++)
         {
             System.out.printf("%10s", a[i]);
         }
         System.out.printf("\n");
         }
}
