/*
 *3133. Minimum Array End
Solved
Medium
Topics
Companies
Hint
You are given two integers n and x. You have to construct an array of positive integers nums of size n where for every 0 <= i < n - 1, nums[i + 1] is greater than nums[i], and the result of the bitwise AND operation between all elements of nums is x.

Return the minimum possible value of nums[n - 1].

 

Example 1:

Input: n = 3, x = 4

Output: 6

Explanation:

nums can be [4,5,6] and its last element is 6.

Example 2:

Input: n = 2, x = 7

Output: 15

Explanation:

nums can be [7,15] and its last element is 15.

 

Constraints:

1 <= n, x <= 108
 **/






class Solution {
public:
    long long minEnd(int n, int x) {
        n--;
        vector<int> xBit(64,0);
        vector<int> nBit(64,0);

        for(int i=0;i<32;i++){
            xBit[i]=(x>>i)&1;
            nBit[i]=(n>>i)&1;
        }

        int i=0,j=0;
        while(i<64){
            if(xBit[i]==1){
                i++;
                continue;
            }
            xBit[i++]=nBit[j++];
        }

        long long ans=0;
        for(int i=0;i<64;i++){
            ans+=xBit[i]*(1ll<<i);
        }
        return ans;
    }

};
