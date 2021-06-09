import java.util.ArrayList;
import java.util.Scanner;

public class EliminateDuplicates {
    public static int[] eliminateDuplicate(int[] list){
        ArrayList<Integer> result = new ArrayList<>();
        int flag, i;
        for(i = 0;i<list.length;i++){
            flag = 0;
            for(int j = 0;j<result.size();j++){
                if(list[i] == result.get(j)){
                    flag = 1;
                }
            }
            if(flag == 0){
                result.add(list[i]);
            }
        }
        int ans[] = new int[result.size()];
        for(i = 0;i<result.size();i++){
            ans[i] = result.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int arr[] = new int[10];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }

        int res[] = eliminateDuplicate(arr);
        System.out.print("The distinct numbers are: ");
        for(int i = 0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
