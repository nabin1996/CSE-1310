

import java.util.Scanner;

public class CountMultiples {

public static void main(String[] args) {
Scanner in = new Scanner (System.in);
System.out.printf("Enter an integer M: ");
int M_low = in.nextInt();
System.out.printf("Enter an integer N: ");
int N_high = in.nextInt();
int count = 0;
for (int i = M_low;  i <= N_high; i = i + 1)
{
if ( i % 11 == 0)
count ++;
}
System.out.printf("%d numbers between %d and %d are multiples of 11\n", count , M_low, N_high);
 
 
System.out.printf("Exiting...\n");

}
    
}

