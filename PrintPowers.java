
import java.util.Scanner;


public class PrintPowers {

public static void main(String[] args) {
Scanner in = new Scanner (System.in);
System.out.printf("Enter a positive integer N > 1: ");
int N = in.nextInt();
if (N <= 1)
{
System.out.printf("Exiting...\n");
System.exit(0);
        
}
   
for (int i= 1; i <= 40000 ; i = i *N )
{
System.out.printf("%d\n", i);
        
      
}
    
System.out.printf("Exiting...\n");
}
     
}
