/*
 *Kth Missing Positive Number in a Sorted Array
Difficulty: MediumAccuracy: 53.02%Submissions: 18K+Points: 4
Given a sorted array of distinct positive integers arr[], we need to find the kth positive number that is missing from arr[].  

Examples :

Input: arr[] = [2, 3, 4, 7, 11], k = 5
Output: 9
Explanation: Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.
Input: arr[] = [1, 2, 3], k = 2
Output: 5
Explanation: Missing are 4, 5, 6… and 2nd missing number is 5.
Input: arr[] = [3, 5, 9, 10, 11, 12], k = 2
Output: 2
Explanation: Missing are 1, 2, 4, 6… and 2nd missing number is 2.
Constraints:
1 <= arr.size() <= 105
1 <= k <= 105
1 <= arr[i]<= 106
 */

import java.util.*;
class kThMissingPositiveInteger {
    public static int kthMissing(int[] arr, int k) {
        // code here

        // int []check =new int[k+1];
        // int count=0;
        // int num=1;

        // ArrayList<Integer> presentItem=new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     presentItem.add(arr[i]);
        // }
        // int i=1;
        // while(count<k){
        //     if(!presentItem.contains(i)){
        //         check[count]=num;
        //         count++;
        //     }
        //     num++;
        //     i++;
        // }
        // return check[k-1];

        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
            set.add(arr[i]);

        for(int i=1;i<1000000;i++){
            if(!set.contains(i)){
                k--;
                if(k==0) return i;
            }
        }

        return -1;

    }
    public static void main(String[]args){
	int []arr={3,5,9,10,11,12}; 
	int k=2;
	int ans=kthMissing(arr,k);
	System.out.println(ans);
    }
}
