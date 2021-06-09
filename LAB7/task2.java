import java.util.*;
public class task2 {
	public static void main(String[] args) {
		int[] array = new int[100];
		int num;
		boolean cont = true;
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 100; i++)
			array[i] = rand.nextInt();
		do {
			try {
				System.out.println("please enter an index: ");
				num = input.nextInt();
				System.out.println("your random number is: " + array[num]);
				cont = false;
			} catch(ArrayIndexOutOfBoundsException er) {
				System.out.println("array out of boud, please try again:");
			}
		}while(cont);
		input.close();
	}
}
