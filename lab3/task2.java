/**
 * task2
 */
public class task2 {

    public static void main(String[] args) {
        System.out.println(reverse(7854));
    }
    public static int reverse(int n) {
        String numS = new String();
        while (n!=0) {
            numS+=(n%10);
            n=n/10;
        }
        return Integer.parseInt(numS);
    }
}
