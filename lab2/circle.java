import java.util.Scanner;

/**
 * circle
 */
public class circle {

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your point:");
       double x = input.nextDouble();
       double y = input.nextDouble();
       double dist = Math.pow((Math.pow((x - 0), 2) + Math.pow((y - 0), 2)),0.5);
       if(dist <=10)
         System.out.printf("the point (%.1f, %.1f) is in the circle",x,y);
       else 
         System.out.printf("the point (%.1f, %.1f) is not in the circle",x,y);

   }
}