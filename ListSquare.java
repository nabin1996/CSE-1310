
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sopni
 */
public class ListSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Double> a = new ArrayList<Double>();
        a.add(3.2);
        a.add(2.1);
        a.add(5.3);
        a.add(8.0);
        a.add(4.9);
        a.add(5.7);
        
        ArrayList<Double> b = new ArrayList<Double>();
        b.add(1.1);
        b.add(2.2);
        b.add(3.3);
        b.add(4.4);
        b.add(5.5);
        b.add(6.6);
        
        ArrayList<Double> result = listSquare(a);
        printDoubleList("a", a);
        printDoubleList("listSquare(a)", result);
        ArrayList<Double> result1 = listSquare(b);
        printDoubleList("b", b);
        printDoubleList("listSquare(b)", result1);
    }
    public static ArrayList<Double> listSquare(ArrayList<Double>a)
    {
       ArrayList<Double> result = new ArrayList<Double>();
       for (int i = 0; i < a.size(); i++)
       {
           double sqaure = a.get(i);
          result.add(sqaure*sqaure);
       }
       return result;
    }        
    
    public static void printDoubleList(String name, ArrayList<Double> a)
        {
         System.out.printf("%15s: ", name);
         if (a == null)
         {
             System.out.printf("Null array\n\n");
             return;
         }
         for (int i = 0; i < a.size(); i++)
         {
             System.out.printf("%6.2f", a.get(i));
         }
         System.out.printf("\n");
         }
}
