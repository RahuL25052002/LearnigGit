package GfG;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class TripletsSumEqualToGivenValue {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of array: ");
        int size=Integer.parseInt(br.readLine());
        int arr[]=new int[size];
        System.out.print("Take element from User: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.print("Take Number from user whose triplets sum you have to check: ");
        int FindNumber=Integer.parseInt(br.readLine());
        if(find3Numbers(arr, arr.length, FindNumber)){
            System.out.println(" This Triplets whose sum is equal to "+FindNumber);
        }else{
            System.out.println("There is no triplets whose sum equal to "+FindNumber);
        }
    }
    public static boolean find3Numbers(int A[], int n, int X) { 
       Arrays.sort(A);
       ArrayList list=new ArrayList<>();
       for(int i=0;i<n;i++){
           int left=i+1;
           int right=n-1;
           while(left<right){
               int sum=A[i]+A[left]+A[right];
               if(sum==X){
                list.add(A[i]);
                list.add(A[right]);
                list.add(A[left]);
                System.out.print(list.toString());
                return true;
               }else if(sum>X){
                right--;
               }else{
                left++;
               }
           }
       }
       return false;
    }
}
