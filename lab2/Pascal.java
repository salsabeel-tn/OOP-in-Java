import java.util.Scanner;
public class Pascal {
    // coefficients are calculated using combinations formula
    public static int factorial(int n) {
	int fact;

	for(fact = 1; n > 1; n--){
		fact *= n;
	}
	return fact;
    }
	// this is the combinations formula
    public static int combinations(int n,int r) {
	return factorial(n) / ( factorial(n-r) * factorial(r) );
    }
    public static void main(String args[]){
	int rows=8, i, j;
	for(i = 0; i < rows; i++) {
		for(j = 0; j < rows-i; j++){
			System.out.print(" ");
		}
		for(j = 0; j <= i; j++){
			System.out.print(" "+combinations(i, j));
		}
		System.out.println();
 	}
    }
}