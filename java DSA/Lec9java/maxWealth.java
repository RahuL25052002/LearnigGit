package Lec9java;

public class maxWealth {
    public static void main(String[] args) {

        int arr[][]={
            {1,2,3},
            {4,3,7},
            {8,3,2}
        };
        int ans=maximumWealth(arr);
        System.out.println(ans);
        
    }
    public static int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
