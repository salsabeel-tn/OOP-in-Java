import java.util.*;
import java.io.*;
public class task3 {
	public static void main(String[] args)throws IOException {
		int[] array = new int[100];
		int[] narray = new int[100];
		File file = new File("C:\\Users\\salsa\\Google Drive\\spring20-21\\cmse211\\java\\LAB7\\exercise.TXT");
		//System.out.println(file.createNewFile());
		Random rand = new Random();
		
		PrintWriter output = new PrintWriter(file);
		for(int i = 0; i < 100; i++) {
			array[i] = rand.nextInt();
			output.print(array[i] + " ");
		}
		output.close();
		
		Scanner input = new Scanner(file);
		for(int i = 0; i < 100; i++) {
			narray[i] = input.nextInt();
		}
		Arrays.sort(narray);
		System.out.println(Arrays.toString(narray));
		input.close();
	}} 
