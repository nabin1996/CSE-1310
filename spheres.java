

import java.util.Scanner;
public class spheres {
    public static double sphereVolume ( double radius) {
        double volume;
        volume = (4.0/3.0) * Math.PI *Math.pow(radius, 3.0);
        return volume; 
    }
    public static double userDouble (String message)
    {
       String sradius; 
       double radius=0;
       Scanner in = new Scanner (System.in);
       
     while (true)
     {
                System.out.printf("%s.\n", message);

         sradius = in.next();
         
         if ( sradius.equals("q"))
         {
             System.out.printf("Exiting....\n");
             System.exit(0);
         }
         try
             
         {
            radius = Double.parseDouble(sradius);
            
         }
         catch(Exception e)
         {
             System.out.printf("%s is not a valid double.\n", sradius);
             return Double.MIN_VALUE;
         }
         if (radius < 0)
         {
             System.out.printf("%f is not positive.\n", radius);
         }
         else 
             return radius;
         
     
                 
         
         }
         
                  
         
     }
    

    public static void main (String[]args)
    {
       double radius= userDouble("Please enter a radius >= 0, or q to quit: ");
//       System.out.println(radius + ":"+ (radius == Double.NaN));
       if(radius != Double.MIN_VALUE) {
        double volume= sphereVolume(radius);
             System.out.printf("Volume = %.2f.\n", volume);
       }
        
     
        
    
    }
}

