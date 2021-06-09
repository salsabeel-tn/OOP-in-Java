import java.util.*;
public class task1 {
	public static void main(String[] args) {
		int num1, num2;
		boolean cont = true;
		Scanner input = new Scanner(System.in);
		do {
			try {
				System.out.println("please enter two integer:");
				num1 = input.nextInt();
				num2 = input.nextInt();
				System.out.println("result = " + (num1+num2));
				cont = false;
			} catch(InputMismatchException er) {
System.out.println("input mismatch, please try again");
				input.nextLine();
			}
		}while(cont);
input.close();
			}
}
