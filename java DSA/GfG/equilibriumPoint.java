/*
 *
 *Equilibrium Point
Difficulty: EasyAccuracy: 28.13%Submissions: 603K+Points: 2
Given an array arr[] of non-negative numbers. The task is to find the first equilibrium point in the array.

The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists. 

Examples:

Input: arr[] = [1, 2, 0, 3]
Output: 2 
Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 0 + 3 = 3.
Input: arr[] = [1, 1, 1, 1]
Output: -1
Explanation: There is no equilibrium index in the array.
Input: arr[] = [-7, 1, 5, 2, -4, 3, 0]
Output: 3
Explanation: The sum of left of index 3 is -7 + 1 + 5 = -1 and sum on right of index 3 is -4 + 3 + 0 = -1.
Constraints:
3 <= arr.size() <= 106
0 <= arr[i] <= 109
 */

//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(
                    token)); // Use Integer.parseInt to parse int values
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            Solution obj = new Solution();

            // calling equilibriumPoint() function
            System.out.println(obj.findEquilibrium(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<arr.length;i++){
            rightsum+=arr[i];
        }

        for(int i=0;i<arr.length;i++){
            rightsum-=arr[i];

            if(leftsum==rightsum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
}

