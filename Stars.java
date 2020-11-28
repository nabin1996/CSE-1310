
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sopni
 */
public class Stars {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
Scanner in = new Scanner (System.in);
System.out.printf("Enter a positive integer N >0: ");
int N = in.nextInt();
if ( N <= 0)
{
System.out.printf("Exiting...\n");
System.exit(0);
  
}
String s = "*";
for ( int i = 1; i <=N ; i++)
{
System.out.printf("%s\n", s);
s = s + "*";
}
 

}
    
}
