/*
 *31. Next Permutation
Solved
Medium
Topics
Companies
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

 

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 100
 * */



public class nextPermutation {

     public static void reverseArray(int[] array,int start,int end) {
        int left = start;
        int right = end;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
     }
    public static void nextPermutation(int[] nums) {
        int ind=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
           reverseArray(nums,0,nums.length-1);
        }
        if(ind!=-1){
            for(int i=n-1;i>=ind;i--){
                if(nums[i]>nums[ind]){
                    int temp=nums[i];
                    nums[i]=nums[ind];
                    nums[ind]=temp;
                    break;
                }
            }
            reverseArray(nums ,ind+1,nums.length-1);
        }

    }
    public static void printArray(int nums[]){
	for(int i=0;i<nums.length;i++){
		System.out.print(nums[i]+" ");
	}
    }
    public static void main(String[] args){

	    int arr[]={2,1,5,4,3,0,0};
	    nextPermutation(arr);
	    printArray(arr);
    }

}
