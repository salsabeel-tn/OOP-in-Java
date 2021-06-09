import java.util.*; 
  
public class merge { 
    public static void main(String[] args) { 
        Scanner input=new Scanner(System.in); 
        int a,b;//number of arrays in list1 and list2 
        System.out.print("How many numbers do you want to have in both arrays? "); 
        a=input.nextInt();//inputting the first number 
        b=input.nextInt();//inputting the second number 
        int list1[]=new int[a];//putting the size (a) inside list1 
        int list2[]=new int[b];//putting the size (b) inside list2 
        System.out.print("Enter list1: "); 
        int i,j; 
        for(i=0;i<list1.length;i++) { 
            list1[i]=input.nextInt(); 
        } 
        System.out.print("Enter list2: "); 
        for(j=0;j<list2.length;j++) { 
            list2[j]=input.nextInt(); 
        } 
        int value[]=merge(list1,list2);//getting the merged list from the method merge 
        System.out.println(""); 
        int temp=0; 
        for(i=0;i<value.length;i++) { 
            for(j=i+1;j<value.length;j++) { 
                if(value[i]>value[j]) { 
                    temp=value[i];value[i]=value[j];value[j]=temp;//ascending the order of duplicated list 
                } 
            } 
        } 
        System.out.println("List after it is merged: "); 
        for(int k:value) { 
            System.out.print(k+" "); 
        } 
} 
    public static int[] merge(int a[],int b[]) { 
        int c=0,i,j; 
        int merged_list[]=new int[a.length+b.length];//adding the size of the 2 lists to merge them to one list 
        for(i=0;i<a.length;i++) { 
            merged_list[i]=a[i];c++;//incrementing c gives us the ability to add the second list with the first one 
        } 
        for(j=0;j<b.length;j++) { 
            merged_list[c++]=b[j];//keep incrementing c to add more arrays to the new index 
        } 
         
        return merged_list; 
        }}
