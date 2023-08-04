package ArraysDSA;

import java.util.Arrays;
import java.util.Scanner;

class pg1{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String [] arr=new String[4];
            System.out.println("Enter array Elements: ");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.next();
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}