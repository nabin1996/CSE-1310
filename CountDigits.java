/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countdigits;

/**
 *
 * @author ashre
 */import java.util.Scanner;
public class CountDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter an integer: ");
        int abc = in.nextInt();
        if (abc<0)
        {
            System.out.printf("%d is negative.\n",abc);
        }
        else if (abc<10)
        {
            System.out.printf("%d has one digit.\n", abc);
        }
        else if (abc<100)
        {
            System.out.printf("%d has two digits.\n", abc);
        }
        else if (abc<1000)
        {
            System.out.printf("%d has three digits.\n", abc);
        }
        else if (abc<10000)
        {System.out.printf("%d has four digits.\n",abc);
        }
        else if (abc<100000)
        {System.out.printf("%d has five digits.\n",abc);
        }
        else if (abc<1000000)
        {System.out.printf("%d has six digits.\n",abc);
        }
        else
        {System.out.printf("%d has more than six digits.\n",abc);
        }
        }
        {
        }
    }
    
