import java.util.Scanner;


public class Pi {
        public static void main(String[] args) {
            double pie = 0,a=1,b=3;
            for (int i = 0; i < 15; i++) {
                pie+=((4/a)-(4/b));
                a+=4;
                b+=4;    
            }
            System.out.println("the approx of pie is "+ pie);   
        }
    
}


