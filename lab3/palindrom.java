import java.util.Scanner;

/**
 * palindrom
 */
public class palindrom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number:");
        int number = input.nextInt();
        if(isPaliondrome(number,reverse(number))) System.out.println("The number is palindrome");
        else System.out.println("The number is not a palindrom");
    

}
public static int reverse(int n) {
    String numS = new String();
    while (n!=0) {
        numS+=(n%10);
        n=n/10;
    }
    return Integer.parseInt(numS);
}
public static boolean isPaliondrome(int k, int krev) {
    if (k == krev) return true;
    else return false;
}
}