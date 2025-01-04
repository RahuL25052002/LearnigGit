/*
 *Count all triplets with given sum in sorted array
Difficulty: MediumAccuracy: 34.34%Submissions: 7K+Points: 4
Given a sorted array arr[] and a target value, the task is to count triplets (i, j, k) of valid indices, such that arr[i] + arr[j] + arr[k] = target and i < j < k.

Examples:

Input: arr[] = [-3, -1, -1, 0, 1, 2], target = -2
Output: 4
Explanation: Two triplets that add up to -2 are:
arr[0] + arr[3] + arr[4] = (-3) + 0 + (1) = -2
arr[0] + arr[1] + arr[5] = (-3) + (-1) + (2) = -2
arr[0] + arr[2] + arr[5] = (-3) + (-1) + (2) = -2
arr[1] + arr[2] + arr[3] = (-1) + (-1) + (0) = -2
Input: arr[] = [-2, 0, 1, 1, 5], target = 1
Output: 0
Explanation: There is no triplet whose sum is equal to 1. 
Constraints:
3 ≤ arr.size() ≤ 103
-105 ≤ arr[i], target ≤ 105
 *
 */

class countAllTripletsSum {
    public static int countTriplets(int[] arr, int target) {
        // Code Here
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i+1;j<arr.length;j++){

                for(int k=j+1;k<arr.length;k++){
                    sum=arr[i]+arr[j]+arr[k];
                    if(sum==target){
                        count++;
                    }else{
                        sum-=arr[k];
                    }

                }
            }
        }
        return count;
    }
    public static void main(String[]args){
	int []arr={-3,-1,-1,0,1,2};
	int target=-2;
	int ans=countTriplets(arr,target);
	System.out.println(ans);

    }
}
