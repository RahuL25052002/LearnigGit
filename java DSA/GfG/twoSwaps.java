/*

Two Swaps
Difficulty: EasyAccuracy: 56.03%Submissions: 4K+Points: 2
Given a permutation of some of the first natural numbers in an array arr[], determine if the array can be sorted in exactly two swaps. A swap can involve the same pair of indices twice.

Return true if it is possible to sort the array with exactly two swaps, otherwise return false.

Examples:

Input: arr = [4, 3, 2, 1]
Output: true
Explanation: First, swap arr[0] and arr[3]. The array becomes [1, 3, 2, 4]. Then, swap arr[1] and arr[2]. The array becomes [1, 2, 3, 4], which is sorted.
Input: arr = [4, 3, 1, 2]
Output: false
Explanation: It is not possible to sort the array with exactly two swaps.
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ arr.size()*/
import java.util.*;

class Solution {

    public static boolean checkSorted(List<Integer> arr) {
        // code here


        int sc=0;
        for(int i=0;i<arr.size();i++){
            if(i+1!=arr.get(i)){
                int temp=arr.get(i);
                arr.set(i,arr.get(arr.get(i)-1));
                arr.set(temp-1,temp);
                sc++;
            }
            if(i+1!=arr.get(i))
            i--;
            if(sc>2)
            return false;
        }
        return true;
    }
    public static void main(String[]args){
   	List<Integer> Arr=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
		int value=sc.nextInt();
		Arr.add(value);
	}

	boolean ans=checkSorted(Arr);
	System.out.println(ans);
    }

}
