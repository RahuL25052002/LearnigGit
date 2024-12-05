/*
 *Sort 0s, 1s and 2s
Difficulty: EasyAccuracy: 50.58%Submissions: 718K+Points: 2
Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
Constraints:
1 <= arr.size() <= 106
0 <= arr[i] <= 2
 */


class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        Arrays.sort(arr);
    }
}

/*
 *
 *User function Template for C

void sort012(int a[], int n)
{
    int countZero=0;
    int countOne=0;
    int countTwo=0;
    
    for(int i=0;i<n;i++){
        if(a[i]==0){
            countZero++;
        }
        if(a[i]==1){
            countOne++;
        }
        if(a[i]==2)
            countTwo++;
    }
    for(int i=0;i<n;i++){
        if(countZero!=0){
            a[i]=0;
            countZero--;
        }else if(countOne!=0){
            a[i]=1;
            countOne--;
        }else if(countTwo!=0){
            a[i]=2;
            countTwo--;
        }
    }
}
*/

