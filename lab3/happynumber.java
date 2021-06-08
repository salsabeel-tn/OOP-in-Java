import java.util.Scanner;

/**
 * happynumber
 */
public class happynumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number:");
        int numb = input.nextInt();
        int sum = 0;
        int copyOfNumb = numb;
        int count =0;
        while (sum!=1 && sum!= copyOfNumb && count!=100) {
            sum = 0;
            while (numb!=0) {
                sum += Math.pow((numb%10), 2);
                numb = numb / 10;
            }
            numb = sum;
            count++;
        }
        if (sum == 1) System.out.println("The number is happy");
        else System.out.println("The number is sad");
    }
}