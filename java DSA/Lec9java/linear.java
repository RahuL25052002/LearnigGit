package Lec9java;

import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Take a array size: ");
        int size=sc.nextInt();
        int [] arr=new int [size];
        System.out.print("Take array element from user: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Target element check in Array: ");
        int target=sc.nextInt();
        int ans=linearSearch(arr, target);
        if(ans==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Index number of Target element is "+ans);
        }
        
    }
    public static int linearSearch(int arr[],int target){
        if(arr.length==0){//if array length is 0
            System.out.println("Array is empty");
            System.exit(0);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;//if element is not found
    }
}
