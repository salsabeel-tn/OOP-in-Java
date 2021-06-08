import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

/**
 * sum
 */
public class sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the integer number");
        int num = input.nextInt();
        int lastDig = num%10;
        int firstDig=0;
        while(num!=0){
            firstDig = num%10;
            num = num/10;
        }
        int summ;
        if (firstDig>=0)
         summ = firstDig + lastDig;
        else
         summ = firstDig - lastDig;
        System.out.println(summ);
    }
}