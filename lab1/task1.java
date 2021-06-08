import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1,x2,y1,y2,dist,a;
        System.out.print("enter the your point pairs in order:");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        a = Math.pow((x2-x1),2) + Math.pow((y2-y1), 2);
        dist = Math.pow(a, 0.5);
        System.out.println("the distance is " + dist);

    }
}