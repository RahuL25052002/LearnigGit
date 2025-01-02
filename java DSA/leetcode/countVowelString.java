/*2559. Count Vowel Strings in Ranges
Solved
Medium
Topics
Companies
Hint
You are given a 0-indexed array of strings words and a 2D array of integers queries.

Each query queries[i] = [li, ri] asks us to find the number of strings present in the range li to ri (both inclusive) of words that start and end with a vowel.

Return an array ans of size queries.length, where ans[i] is the answer to the ith query.

Note that the vowel letters are 'a', 'e', 'i', 'o', and 'u'.

 

Example 1:

Input: words = ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]]
Output: [2,3,0]
Explanation: The strings starting and ending with a vowel are "aba", "ece", "aa" and "e".
The answer to the query [0,2] is 2 (strings "aba" and "ece").
to query [1,4] is 3 (strings "ece", "aa", "e").
to query [1,1] is 0.
We return [2,3,0].
Example 2:

Input: words = ["a","e","i"], queries = [[0,2],[0,1],[2,2]]
Output: [3,2,1]
Explanation: Every string satisfies the conditions, so we return [3,2,1].
 

Constraints:

1 <= words.length <= 105
1 <= words[i].length <= 40
words[i] consists only of lowercase English letters.
sum(words[i].length) <= 3 * 105
1 <= queries.length <= 105
0 <= li <= ri < words.length*/

import java.util.*;
class countVowelString {
    public  static int[] vowelStrings(String[] words, int[][] queries) {

        // String []temp=new String[words.length];
        // int count=0;
        // for(int i=0;i<words.length;i++){
        //     String s=words[i];
        //     int l=words[i].length();
        //     if((s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u')&& (s.charAt(l-1)=='a'||s.charAt(l-1)=='e'||s.charAt(l-1)=='i'||s.charAt(l-1)=='o'||s.charAt(l-1)=='u')){
        //         count++;
        //         temp[i]=words[i];
        //     }else{
        //         temp[i]="0";
        //     }
        // }

        // int ans[]=new int[queries.length];
        // int k=0;
        // for(int i=0;i<queries.length;i++){
        //     int cnt=0;
        //     int l=queries[i][0];
        //     int r=queries[i][1];
        //     while(l<=r){
        //         if(temp[l]!="0"){
        //             cnt++;
        //         }
        //         l++;
        //     }
        //     ans[k]=cnt;
        //     k++;
        // }

        // return ans;

        int n = words.length;
        int[] Prefix = new int[n + 1];
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < n; i++) {
            Prefix[i + 1] = Prefix[i];
            if (vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length() - 1))) {
                Prefix[i + 1]++;
            }
        }

        int[] ANS = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ANS[i] = Prefix[queries[i][1] + 1] - Prefix[queries[i][0]];
        }
        return ANS;
    }

    public static void main(String[] args){
	String[] words={"aba","bcb","ece","aa","e"};
	int [][]queries={{0,2},{1,4},{1,1}};
	int []ans=new int[queries.length];
	ans=vowelStrings(words,queries);
	countVowelString obj=new countVowelString();
	System.out.println(Arrays.toString(ans));
    }
}
