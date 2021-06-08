/**
 * tak2
 */
public class tak2 {

    public static void main(String[] args) {
        int combs = 0;
        for (int i = 1; i < 8 ; i++) {
            for (int j = i + 1 ; j < 8; j++) {
                System.out.println(i +", " + j + " " );
                combs++;
            }
            
        }
        System.out.println("the number of all combinations is " +  combs);
    }
}