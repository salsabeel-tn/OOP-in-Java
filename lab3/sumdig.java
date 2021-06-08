import java.util.Scanner;

/**
 * sumdig
 */
public class sumdig {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter an integer number: ");
        int number = input.nextInt();
        System.out.println("the sum is " + sumDigit(number)); 
    }
    public static int sumDigit(long num) {
        int sum = 0;
        while(num!=0) {
            sum +=(num%10);
            num = num/10;
        }
        return sum;
    }
}