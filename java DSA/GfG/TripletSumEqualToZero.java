package GfG;

import java.util.Arrays;

public class TripletSumEqualToZero {
    public static void main(String[] args) {
        int arr[]={0,-3,-1,2,1,2,3,4,59};
        int len=arr.length;
        boolean ans=findTriplets(arr,len);
        if(ans){
            System.out.println("There are Triplets whose Sum is equal to Zero");
        }else{
            System.out.println("There is no Triplets  whose sum equal to Zero");
        }
    }
    	public static boolean findTriplets(int arr[] , int n){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int left=i+1;
            int right = (n-1);
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum==0){
                    return true;
                }
                else if(sum>0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return false;
    }
}
