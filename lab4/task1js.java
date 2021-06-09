import java.util.Scanner;

/**
 * task1js
 */
public class task1js {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double array []= new double[10];
        System.out.print("Enter 10 elemnts: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int index = indexOfLargestlestElement(array);
        System.out.println("the index of the largest element is: " + index);


    }
    public static int indexOfLargestlestElement(double[] array1){
        double largest=0,k=0;
        int i, index=0;
        for(i=0;i<array1.length;i++) {
            if(array1[i]>largest) {
                largest=array1[i];
                index=i;
                
            }
        }
        
        return index;
    }
    }
