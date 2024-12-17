/*
 *Aggressive Cows
Difficulty: MediumAccuracy: 59.57%Submissions: 91K+Points: 4
You are given an array with unique elements of stalls[], which denote the position of a stall. You are also given an integer k which denotes the number of aggressive cows. Your task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.

Examples :

Input: stalls[] = [1, 2, 4, 8, 9], k = 3
Output: 3
Explanation: The first cow can be placed at stalls[0], 
the second cow can be placed at stalls[2] and 
the third cow can be placed at stalls[3]. 
The minimum distance between cows, in this case, is 3, which also is the largest among all possible ways.
Input: stalls[] = [10, 1, 2, 7, 5], k = 3
Output: 4
Explanation: The first cow can be placed at stalls[0],
the second cow can be placed at stalls[1] and
the third cow can be placed at stalls[4].
The minimum distance between cows, in this case, is 4, which also is the largest among all possible ways.
Input: stalls[] = [2, 12, 11, 3, 26, 7], k = 5
Output: 1
Explanation: Each cow can be placed in any of the stalls, as the no. of stalls are exactly equal to the number of cows.
The minimum distance between cows, in this case, is 1, which also is the largest among all possible ways.
Constraints:
2 <= stalls.size() <= 106
0 <= stalls[i] <= 108
1 <= k <= stalls.size()
 */
import java.util.*;


class aggresiveCows {
    static boolean isPossible(int[] stalls,int min_dis, int l,int n){
        int k=1;
        int laststall=stalls[0];
        for(int i=1;i<l;i++){
            if(stalls[i]-laststall>=min_dis){
               k++;
               laststall=stalls[i];
            }
        }
        return k>=n;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        int l=stalls.length;
         Arrays.sort(stalls);
        int str = 1;
        int end=stalls[l-1]-stalls[0];
        int ans=0;
        while(str<=end){
            int mid=str+(end-str)/2;
            if(isPossible(stalls,mid,l,k)){
                ans=mid;
                str=mid+1;
            } else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
	int stalls[]={1,2,4,8,9};
	int k=3;
	int ans=aggressiveCows(stalls,k);
	System.out.println(ans);
    }
}
