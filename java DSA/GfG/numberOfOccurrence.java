/*
 *Number of occurrence
Difficulty: EasyAccuracy: 59.34%Submissions: 265K+Points: 2
Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[]. 

Examples :

Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
Output: 4
Explanation: target = 2 occurs 4 times in the given array so the output is 4.
Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
Output: 0
Explanation: target = 4 is not present in the given array so the output is 0.
Input: arr[] = [8, 9, 10, 12, 12, 12], target = 12
Output: 3
Explanation: target = 12 occurs 3 times in the given array so the output is 3.
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 106
1 ≤ target ≤ 106
 *
 */

class numberOfOccurrence {
    static int countFreq(int[] arr, int target) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
            if(arr[i]>target)
                break;
        }
        return count;
    }

    public static void main(String[]args){
	int []arr={1,2,3,3,3,3,4,4,5,5,9};
	int target=3;

	int ans=countFreq(arr,target);

	System.out.println(ans);
    }
}