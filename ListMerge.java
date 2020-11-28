
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
public class ListMerge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     ArrayList<String> a = new ArrayList<String>();
     a.add("Chicago");
     a.add("New York");
     a.add("Dallas");
     
     ArrayList<String> b = new ArrayList<String>();
     b.add("Berlin");
     b.add("London");
     b.add("Paris");
     b.add("Rome");
     
     ArrayList<String> result = listMerge(a,b);
     printStringList("a",a);
     printStringList("b",b);
     printStringList("result",result);
     
    }
    
    public static ArrayList<String> listMerge(ArrayList<String> a, ArrayList<String> b)
    {       
      ArrayList<String> result = new ArrayList<String>();
      for (int i = 0; i < a.size(); i++)
      {
          result.add(a.get(i));
      }
      for (int j = 0; j < b.size(); j++)
      {
          result.add(b.get(j));
      }
      return result;
    }
    public static void printStringList(String name, ArrayList<String> a)
        {
         System.out.printf("%15s: ", name);
         if (a == null)
         {
             System.out.printf("Null array\n\n");
             return;
         }
         for (int i = 0; i < a.size(); i++)
         {
             System.out.printf("%10s", a.get(i));
         }
         System.out.printf("\n");
         }
}

