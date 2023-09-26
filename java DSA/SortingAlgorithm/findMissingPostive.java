package SortingAlgorithm;

import java.util.Arrays;

class Solution
{
    public static void main(String[] args) {
        //int arr[]={0,-10,1,3,-2,0};
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int ans=missingNumber(arr, n);
        System.out.println(ans);
    }
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1)
                return j+1;
        }
        return arr.length+1;
    }
}