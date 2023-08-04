package ArraysDSA;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            /*   int [][] TwoDarray={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
                };*/
                int [][] TwoDarray=new int[3][3];
                System.out.println(TwoDarray[2]);//it print that reference address
                System.out.println(Arrays.toString(TwoDarray[2]));//it print that value
                System.out.print("Taking Array element from user : ");
                for(int row=0;row<TwoDarray.length;row++){
                    for(int col=0;col<TwoDarray[row].length;col++){
                       TwoDarray[row][col]=sc.nextInt();
                    }
                }
                System.out.println("BY two for loop: ");
                for(int row=0;row<TwoDarray.length;row++){
                    System.out.print("[");
                    for(int col=0;col<TwoDarray[row].length;col++){
                        System.out.print(TwoDarray[row][col]+" ");
                    }
                    System.out.print("]");
                    System.out.println();
                }
                System.out.println("By the Arrays toString method: ");
                for(int i=0;i<TwoDarray.length;i++){
                    System.out.println(Arrays.toString(TwoDarray[i]));
                }

                System.out.println("By for each loop: ");
                for(int a[]:TwoDarray){
                    System.out.println(Arrays.toString(a));
                }
        }

    }
    
}
