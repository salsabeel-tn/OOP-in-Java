import java.util.*; 
public class max { 
    public static void main(String[] args) { 
        Scanner input=new Scanner(System.in); 
        int row,column; 
        System.out.print("Enter the number of rows and columns: "); 
        row=input.nextInt(); 
        column=input.nextInt(); 
        double array[][]=new double[row][column]; 
        System.out.print("Enter your numbers: \n"); 
        for(int i=0;i<array.length;i++) { 
            for(int j=0;j<array[i].length;j++) { 
                System.out.printf("a[%d][%d]= ",i,j);//display where each element has its number 
                array[i][j]=input.nextDouble(); 
            }} 
            int value[]=Locate_largest(array); 
            System.out.printf("Location of the largest element=(%d,%d)",value[0],value[1]); 
    } 
         
        public static int[] Locate_largest(double[][] x) { 
            int location[]=new int[2];//2 dimesnsional array for locating the element  
            double largest=x[0][0];//2 dimesnsional array for locating largest number 
            for(int i=0;i<x.length;i++) { 
                for(int j=0;j<x[i].length;j++) { 
                    if (largest<x[i][j]) { 
                        largest=x[i][j]; 
                        location[0]=i; 
                        location[1]=j; 
                    }     } 
   } 
            return location; 
        }
    } 
