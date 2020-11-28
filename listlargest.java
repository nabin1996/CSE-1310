
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
public class listlargest {

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
        
        ArrayList<Double> result = listlargest(a,b);
        printDoubleList("a", a);
        printDoubleList("b", b);
        printDoubleList("result", result);
        
    }
    public static ArrayList<Double> listlargest(ArrayList<Double>a, ArrayList<Double> b)
    {
        if(a.size() != b.size())
        {
            return null;
        }
        ArrayList<Double> result = new ArrayList<Double>();
            for(int i=0; i<a.size();i++)
            {
                if(a.get(i) > b.get(i))
                {
                    //result[i] = a[i];
                result.add(a.get(i));
                }    
                if(a.get(i) < b.get(i))
                {
                    //result[i] = b[i];
                result.add(b.get(i));
                }
            }
                return result;
                
    }            
        public static void printDoubleList(String name, ArrayList<Double> a)
        {
         System.out.printf("%6s: ", name);
         if (a == null)
         {
             System.out.printf("Null array\n\n");
             return;
         }
         for (int i = 0; i < a.size(); i++)
         {
             System.out.printf("%6.1f", a.get(i));
         }
         System.out.printf("\n");
         }
        
    }

