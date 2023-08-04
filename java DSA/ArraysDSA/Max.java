package ArraysDSA;

import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Take array size: ");
            int size=sc.nextInt();
            int []arr=new int[size];

            System.out.println("Take Positve array element from user");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));

            System.out.println("Find the Maximum elemenet in an array: ");
            int maxele=max(arr);
            if(maxele==-1){
                System.out.println("Array is empty");
            }else{
                System.out.println("Maximum element: "+maxele);
            }
        }
    }
    static int max(int []arr){
        int size=arr.length;
        if(size==0){
            return -1;
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
