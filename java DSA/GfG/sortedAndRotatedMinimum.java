/*
 *Sorted and Rotated Minimum
Difficulty: EasyAccuracy: 40.57%Submissions: 116K+Points: 2
A sorted array of distinct elements arr[] is rotated at some unknown point, the task is to find the minimum element in it. 

Examples:

Input: arr[] = [5, 6, 1, 2, 3, 4]
Output: 1
Explanation: 1 is the minimum element in the array.
Input: arr[] = [3, 2, 1]
Output: 1
Explanation: Here 1 is the minimum element.
Input: arr[] = [4, 2, 2]
Output: 2
Explanation: Here 2 is the only minimum element.
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 109
 *
 */

public class sortedRotatedMinimum {
    public int findMin(int[] arr) {
        // complete the function here
        int mini=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
        }

        return mini;
    }

    public static void main(String[] args){
	int []arr={5,4,1,2,3};
	sortedRotatedMinimum obj=new sortedRotatedMinimum();
	int ans=obj.findMin(arr);

	System.out.println(ans);
    }
}

