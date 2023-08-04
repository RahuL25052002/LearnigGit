package ArraysDSA;
import java.util.Arrays;
import java.util.Scanner;

public class Swapjava {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Take array size: ");
            int size=sc.nextInt();
            int []arr=new int[size];

            System.out.println("Take array element from user");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("Take swapping indexes");
            int ind1=sc.nextInt();
            int ind2=sc.nextInt();
            swap(arr,ind1,ind2);
            System.out.println(Arrays.toString(arr));
        }
    }
        public static void swap(int[]arr,int index1,int index2){
        int size=arr.length;
        int temp=0;
        if(size <(index1) && size<index2){
            System.out.println("Illegal Swapping");
            System.exit(0);
        }
        if(size==1){
            System.out.println(Arrays.toString(arr));
            System.exit(0);
        }
        temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
