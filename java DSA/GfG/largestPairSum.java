/*Find the largest pair sum in an array of distinct integers.

Examples :

Input: arr[] = [12, 34, 10, 6, 40]
Output: 74
Explanation: Sum of 34 and 40 is the largest, i.e, 34 + 40 = 74.
Input: arr[] = [10, 20, 30]
Output: 50
Explanation: 20 + 30 = 50.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
2 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 106

*/
/*
 *
 * Today i solved this problem from gfg(POTD) is very basic problem
 * where i only do check maximum number in 1st condition and also check the next 
 * condition in which the element is maximum then secondMaximum element 
 * but it less than max element then this element assign to the second
 * maximum element.
 * and last just return there sum 
 *
 *
 *
 */
class Solution {
    public static int pairsum(int[] arr) {
        // code here
        int max=arr[0];
        int secMax=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            if( arr[i]<max &&  arr[i]>secMax){
                secMax=arr[i];
            }
        }
        return max+secMax;
    }
    public static void main(String[]args){
	    int arr[]={32,43,23,11,22,45};
	    int ans=pairsum(arr);
	    System.out.println(ans);

    }
}
