/**
 * task2
 */
import java.util.Scanner;
public class task2 {
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double x1,x2,x3,y1,y2,y3,s,side1,side2,side3,area;
        System.out.print("enter the your point pairs in order:");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();


        side1 = Math.pow((x2-x1),2) + Math.pow((y2-y1), 2);
        side1 = Math.pow(side1, 0.5);
        side2 = Math.pow((x3-x1),2) + Math.pow((y3-y1), 2);
        side2 = Math.pow(side2, 0.5);
        side3 = Math.pow((x3-x2),2) + Math.pow((y3-y2), 2);
        side3 = Math.pow(side3, 0.5);
        s = (side1+side2+side3)/2;
        area = Math.pow((s*(s-side1)*(s-side2)*(s-side3)), 0.5);

        System.out.printf("the area is %.2f" ,area);
}
}