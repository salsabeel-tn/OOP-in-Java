/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        for (int i = 0; i < 24; i++) {
            n3 = n1 +n2;
            n1 = n2;
            n2=n3;
        }
        System.out.println("At the end of 24 months there will be "+ n2 + " rabbit pairs");
    }
}