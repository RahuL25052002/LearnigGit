package ArraysDSA;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Take array size: ");
            int size=sc.nextInt();
            if(size<0){
                System.out.println("ArraysSize CanNot be Negative ");
                System.exit(0);
            }
            int []arr=new int[size];


            System.out.println("Take array element from user");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            ReversArray(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void ReversArray(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            Swapjava.swap(arr,start,end);
            start++;
            end--;
        }
        
    }
}
