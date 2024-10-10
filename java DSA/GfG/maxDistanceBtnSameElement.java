/*Max distance between same elements
Difficulty: EasyAccuracy: 46.67%Submissions: 48K+Points: 2
Given an array arr[] with repeated elements, the task is to find the maximum distance between two occurrences of an element.

Note: You may assume that every input array has repetitions.

Examples:

Input: arr = [1, 1, 2, 2, 2, 1]
Output: 5
Explanation: distance for 1 is: 5-0 = 5, distance for 2 is : 4-2 = 2, So max distance is 5.
Input: arr = [3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2]
Output: 10
Explanation: maximum distance for 2 is 11-1 = 10, maximum distance for 1 is 4-2 = 2 ,maximum distance for 4 is 10-5 = 5, So max distance is 10.
Expected Time Complexity :  O(n)
Expected Auxilliary Space : O(n)

Constraints:
1 <= arr.size() <= 106
1 <= arr[i] <= 109

*/
import java.util.*;

class Solution {
    public static int maxDistance(int[] arr) {
        // Code here

        // int maxDistance=0;

        // int size=arr.length-1;
        // int right=arr.length-1;
        // int distance=0;


        // for(int i=0;i<arr.length;i++){

        //     for(int j=0;j<arr.length;j++){
        //         if(arr[i]==arr[right]){
        //             distance=right-i;
        //             break;
        //         }
        //         right--;
        //     }
        //     if(maxDistance<distance){
        //         maxDistance=distance;

        //     }

        //     right=size;

        // }

        // return maxDistance;


        int maxDist = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }else {
                int currDist = i - map.get(arr[i]);
                maxDist = Math.max(maxDist,currDist);
            }
        }
        return maxDist;
    }

    public static void main(String[]args){
	    int arr[]={3,2,1,2,1,4,5,8,6,7,4,2};

	    int ans=maxDistance(arr);


	    System.out.println(ans);

    }
}
