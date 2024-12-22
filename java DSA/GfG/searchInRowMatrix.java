/*
 *Search in a Row-Column sorted matrix
Difficulty: EasyAccuracy: 41.62%Submissions: 154K+Points: 2
Given a 2D integer matrix mat[][] of size n x m, where every row and column is sorted in increasing order and a number x, the task is to find whether element x is present in the matrix.

Examples:

Input: mat[][] = [[3, 30, 38],[20, 52, 54],[35, 60, 69]], x = 62
Output: false
Explanation: 62 is not present in the matrix, so output is false.
Input: mat[][] = [[18, 21, 27],[38, 55, 67]], x = 55
Output: true
Explanation: 55 is present in the matrix.
Input: mat[][] = [[1, 2, 3],[4, 5, 6],[7, 8, 9]], x = 3
Output: true
Explanation: 3 is present in the matrix.
Constraints:
1 <= n, m <=1000
1 <= mat[i][j] <= 109
1<= x <= 109
 */

class searchInRowMatrix{
	public static boolean matSearch(int mat[][], int x) {
        // your code here
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==x){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[]args){
	int [][]mat={
		{3,30,38},
		{35,60,69},
		{20,52,54}
	};
	int x=512;
	boolean ans=matSearch(mat,x);
	System.out.println("Ans is "+ans);
    }
}
