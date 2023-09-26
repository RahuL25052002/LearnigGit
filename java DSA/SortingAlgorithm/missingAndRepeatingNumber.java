package SortingAlgorithm;

import java.util.Arrays;

public class missingAndRepeatingNumber{
    public static void main(String[] args) {
        int n=3;
        int arr[]={1,3,3};
        int ans[]=new int[2];
        ans=findTwoElement(arr,n);
        System.out.println(Arrays.toString(ans));

        
    }
    static int[] findTwoElement(int arr[], int n) {
    // code here
    int i=0;
    while(i<arr.length){
        int right=arr[i]-1;
        if(arr[i]!=arr[right]){
            int temp=arr[i];
            arr[i]=arr[right];
            arr[right]=temp;
        }else{
            i++;
        }
    }
    int ans[]=new int [2];
    for(int j=0;j<arr.length;j++){
        if(arr[j]!=j+1){
            ans[0]=arr[j];//if index!=value-1 means that here repeating number is present
            //thats why we insert in the array that element 
            ans[1]=j+1;// and missing number will be j+1 
        }
    }
    return ans;
    }
}

// Find Missing And Repeating

// Given an unsorted array Arr of size N of positive integers.
// One number 'A' from set {1, 2,....,N} is missing and one
// number 'B' occurs twice in array. Find these two numbers.

// Example 1:
// Input:
// N = 2
// Arr[] = {2, 2}
// Output: 2 1
// Explanation: Repeating number is 2 and 
// smallest positive missing number is 1.

// Example 2:
// Input:
// N = 3
// Arr[] = {1, 3, 3}
// Output: 3 2
// Explanation: Repeating number is 3 and 
// smallest positive missing number is 2.

// Your Task:
//You don't need to read input or print anything. 
//Your task is to complete the function findTwoElement() 
//which takes the array of integers arr and n as
//parameters and returns an array of integers of
//size 2 denoting the answer 
//( The first index contains B and second index contains A.)
// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Constraints:
// 2 ≤ N ≤ 105
// 1 ≤ Arr[i] ≤ N