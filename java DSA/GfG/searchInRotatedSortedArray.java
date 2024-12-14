/*
 *Search in Rotated Sorted Array
Difficulty: MediumAccuracy: 37.64%Submissions: 234K+Points: 4
Given a sorted and rotated array arr[] of distinct elements, the task is to find the index of a target key. Return -1 if the key is not found.

Examples :

Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
Output: 8
Explanation: 3 is found at index 8.
Input: arr[] = [3, 5, 1, 2], key = 6
Output: -1
Explanation: There is no element that has value 6.
Input: arr[] = [33, 42, 72, 99], key = 42
Output: 1
Explanation: 42 is found at index 1.
Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 106
1 ≤ key ≤ 106
 *
 */

class searchInRotatedSortedArray {
    static int search(int[] arr, int key) {
        // Complete this function
        int ind=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                ind=i;
                break;
            }
        }
        return ind;
    }

    public static void main(String[]args){
	int []arr={5,6,7,8,1,2,3,4};
	int key=3;
	int ans=search(arr,key);
	System.out.println(ans);
    }
}
