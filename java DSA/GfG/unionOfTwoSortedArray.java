/*
 *Union of Two Sorted Arrays with Distinct Elements
Difficulty: EasyAccuracy: 55.4%Submissions: 13K+Points: 2
Given two sorted arrays a[] and b[], where each array contains distinct elements , the task is to return the elements in the union of the two arrays in sorted order.

Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
Examples:

Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: 1 2 3 4 5 6 7
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
Input: a[] = [2, 3, 4, 5], b[] = [1, 2, 3, 4]
Output: 1 2 3 4 5
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
Input: a[] = [1], b[] = [2]
Output: 1 2
Explanation: Distinct elements including both the arrays are: 1 2.
Constraints:
1  <=  a.size(), b.size()  <=  105
-109  <=  a[i] , b[i]  <=  109
 */

import java.util.*;

public class unionOfTwoSortedArray {
    // Function to return a list containing the union of the two arrays.
      public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        int n1=a.length;
        int n2=b.length;
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i < a.length && j < b.length){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }else
            if(a[i]>b[j]){
                ans.add(b[j]);
                j++;
            }else{
                ans.add(a[i]);
                i++;
            }
        }

        while(i<n1){
            ans.add(a[i]);
            i++;
        }
        while(j<n2){
            ans.add(b[j]);
            j++;
        }
        return ans;

    }
    public static void main(String[] args){
	int a[]={1,2,3,4,5};
	int b[]={1,2,3,4,5,6,7,8};

	ArrayList<Integer> ans=new ArrayList<>();

	ans=findUnion(a,b);

	System.out.println(ans);
    }
}

