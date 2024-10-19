/*
Nearest multiple of 10
Difficulty: EasyAccuracy: 19.32%Submissions: 47K+Points: 2
A string str is given to represent a positive number. The task is to round str to the nearest multiple of 10.  If you have two multiples equally apart from str, choose the smallest element among them.

Examples:

Input: str = 29 
Output: 30
Explanation: Close multiples are 20 and 30, and 30 is the nearest to 29. 
Input: str = 15
Output: 10
Explanation: 10 and 20 are equally distant multiples from 20. The smallest of the two is 10.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).

Constraints:
1 <= str.size()<= 105
*/


class Solution {

    String roundToNearest(String str) {
        // Complete the function

        StringBuilder ans=new StringBuilder(str);
        int n=str.length();
        int t=(str.charAt(n-1) - '0')%10;
        if(t<=5){
            ans.setCharAt(n-1,'0');
        }
        else{
            ans.setCharAt(n-1,'0');
            for(int i=n-2;i>=0;i--){
            char ch=ans.charAt(i);
            if(ch=='9'){
                ans.setCharAt(i,'0');
            }
            else{
                ans.setCharAt(i,(char)(ch+1));
                break;
            }
        }
        }
        return ans.toString();
    }
}

