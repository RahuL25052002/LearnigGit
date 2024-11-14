/*
Nearly sorted
Difficulty: MediumAccuracy: 75.25%Submissions: 51K+Points: 4
Given an array arr[], where each element is at most k away from its target position, you need to sort the array optimally.

Note: 

You need to change the given array arr[] in place.
Examples:

Input: arr[] = [6, 5, 3, 2, 8, 10, 9], k = 3
Output: [2, 3, 5, 6, 8, 9, 10]
Explanation: The sorted array will be 2 3 5 6 8 9 10
Input: arr[]= [1, 4, 5, 2, 3, 6, 7, 8, 9, 10], k = 2
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Explanation: The sorted array will be 1 2 3 4 5 6 7 8 9 10
DO NOT use the direct library sort() function for this question.

Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ k < arr.size()
1 ≤ arri ≤ 106

*/

class Solution {
    // Non-static method, so you need to call it on an instance of the class
    public void nearlySorted(int[] arr, int k) {
        // code
        // for(int i=0;i<arr.length;i++){
        //     int position=-1;
        //     for(int j=i;j<arr.length;j++){
        //       if(arr[i]>arr[j]){
        //           position=j;
        //       }
        //     }
        //     if(position!=-1){
        //         int temp=arr[position];
        //         arr[position]=arr[i];
        //         arr[i]=temp;
        //         k--;
        //     }
        //     if(k==0){
        //         break;
        //     }
        // }
        k=k+1;
	    PriorityQueue<Integer> pq=new PriorityQueue<>();
	    int n=arr.length;
	    int ans[]=new int[n];
	    int ind=0;
	    for(int i=0;i<n;i++){
	        if(pq.size()<k){
	            pq.add(arr[i]);
	        }
	        if(pq.size()==k){
	            ans[ind]=pq.remove();
	            ind++;
	        }
	    }

	    while(ind<n){
    	    ans[ind]=pq.remove();
    	    ind++;
	    }
	    for(int i=0;i<n;i++){
	        arr[i]=ans[i];
	    }
    }
}

