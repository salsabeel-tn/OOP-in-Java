import java.util.*;
public class task2 {
	

	public static void reverse(int arr[]){
     int i=0,j=arr.length-1;

	while(i<j){

	int temp=arr[i];

	arr[i]=arr[j];

	arr[j]=temp;

	i++;

	j--; }

	}

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);

	int n=10;

	System.out.println("Enter 10 numbers: ");

	int arr[]=new int[n];

	for(int i=0;i<n;i++){

	arr[i]=sc.nextInt();

	}

	System.out.println("Entered array: ");

	for(int i=0;i<n;i++){

	System.out.print(arr[i]+" ");

	}

	reverse(arr);

	System.out.println("\nAfter reversing the array: ");

	for(int i=0;i<n;i++){

	System.out.print(arr[i]+" ");

	    }

	  }

}
