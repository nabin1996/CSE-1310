
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import static java.lang.System.out;

public class CheckPrimes {
   
    public static void main(String[] args) 
    {
        checkPrimes("in4.txt","out4.txt"); //calling the function checkprimes and passing the argument
        System.out.printf("Exiting......\n");
    }
    public static void checkPrimes(String in_file, String out_file) 
       //infile specifies the name of the input file 
       //outfiles specifies the name of the output file where result will be saved     
    {
        ArrayList<String> lines = readFile(in_file);
         PrintWriter pw = null;
        try
        {
            pw = new PrintWriter(out_file);
        }
        catch (Exception e)
        {
         System.out.printf("Error in opening file for writing");
         return;
        }
         for( int i = 0; i < lines.size(); i++)
         {
             try
             {
                 int x = Integer.parseInt(lines.get(i));
                 for (int j =2; j < x; j++)
                 {
                     if(x % j ==0)
                     {
                         System.out.printf("%d is not prime.\n", x);
                         break;
                     }
                     else
                     { System.out.printf("%d is prime.\n", x);
                     break;
                     }
                 }
             }
        catch (Exception e)
        {
         System.out.printf("Error %s is not a number.\n", lines.get(i));
        }
        }
        pw.close();
    }

    public static ArrayList<String> readFile(String filename) 
    {
    File temp = new File(filename);
    Scanner in_file;
    try
    {
        in_file = new Scanner(temp);
    }
    catch (Exception e)
    {
        System.out.printf("Error in opening file for reading.\n");
        return null;
    }   
    ArrayList<String> result = new ArrayList<String>();
    while (in_file.hasNextLine())
    {
     String line = in_file.nextLine();
     result.add(line);
     
    }
    in_file.close();
    return result;
    }
  }
 

    

