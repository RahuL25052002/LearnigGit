package SortingAlgorithm;

public class MissingNumber {
    public static void main(String[] args) {
    // Constraints:
    // 1 ≤ N ≤ 106
    // 1 ≤ A[i] ≤ 106
        int N=5;
        int arr[]={1,2,3,4};
        int ans=missingNumber(arr, N);
        System.out.println("Missing Nummber is : "+ans);

        
    }
    public static int missingNumber(int array[], int n) {
        // Your code goes here
        // By using the cyclic Sort 
        int i=0;
        while(i<array.length){
            int correct=array[i]-1;
            if(array[i]<n && array[i]!=array[correct]){
                //swapped(arr, i, correct);
                int temp=array[i];
                array[i]=array[correct];
                array[correct]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<array.length;j++){
            if(array[j]!=j+1){
                return j+1;
            }
        }
        return n;
    }
}


// Given an array of size N-1 such that it only contains
// distinct integers in the range of 1 to N. Find the missing element.

// Example 1:

// Input:
// N = 5
// A[] = {1,2,3,5}
// Output: 4
// Example 2:

// Input:
// N = 10
// A[] = {6,1,2,8,3,4,7,10,5}
// Output: 9

// Your Task :
// You don't need to read input or print anything. Complete the function MissingNumber() that takes array and N as input  parameters and returns the value of the missing number.


// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

