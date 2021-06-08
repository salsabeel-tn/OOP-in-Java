import java.util.Scanner;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number: ");
        int num = input.nextInt();
        System.out.println("the product is " + product(num) );
    }
    public static int product(int n) {
        int prod = 1;
        while(n>0) {
            prod = prod * (n%10);
            n = n/10;
        }
        return prod;
    }
}