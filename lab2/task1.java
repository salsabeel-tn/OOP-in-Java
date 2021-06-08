/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        double sum=0,a=1;
        while (a<=97) {
            sum+=(a/(a+2));
            a+=2;
        }
        System.out.printf("The sum is %.4f " ,sum);
    }
}