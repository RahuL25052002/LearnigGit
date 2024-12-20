/*
 *Spirally traversing a matrix
Difficulty: MediumAccuracy: 35.2%Submissions: 295K+Points: 4
You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form.

Examples:

Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
Explanation: 

Input: mat[][] = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18]]
Output: [1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]
Explanation: Applying same technique as shown above.
Input: mat[][] = [[32, 44, 27, 23], [54, 28, 50, 62]]
Output: [32, 44, 27, 23, 62, 50, 28, 54]
Explanation: Applying same technique as shown above, output will be [32, 44, 27, 23, 62, 50, 28, 54].
Constraints:
1 <= n, m <= 1000
0 <= mat[i][j]<= 100
 * 
 *
 * /
 *
 *
 */

import java.util.*;

class spirallyTraversingMatrix{
    // Function to return a list of integers denoting spiral traversal of matrix.
    public static ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here

        int i = 0;
        int j = 0;
        int row_0 = 0;
        int col_0 = 0;
        int row_1 = mat.length-1;
        int col_1 = mat[0].length-1;
        int left[] = new int[]{0 , -1};
        int right[] = new int[]{0 , 1};
        int up[] = new int[]{-1 , 0};
        int down[] = new int[]{1 , 0};
        int []dir = right;
        int n = (row_1 + 1) * (col_1 + 1);
        ArrayList<Integer> A = new ArrayList<>();

        while(n-- > 0) {
            A.add(mat[i][j]);
            if(dir == right) {
                if(j == col_1) {
                    dir = down;
                    row_0++;
                    i++;
                } else {
                    j++;
                }
            } else if(dir == left) {
                if(j == col_0) {
                    dir = up;
                    row_1--;
                    i--;
                } else {
                    j--;
                }
            } else if(dir == up) {
                if(i == row_0) {
                    dir = right;
                    col_0++;
                    j++;
                } else {
                    i--;
                }
            } else if(dir == down) {
                if(i == row_1) {
                    dir = left;
                    col_1--;
                    j--;
                } else {
                    i++;
                }
            }
        }

        return A;

    }

    public static void main(String[]args){
	int mat[][]={
		{1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
		{13,14,15,16}
	};
	ArrayList<Integer> ans=new ArrayList<>();
	ans=spirallyTraverse(mat);
	System.out.println(ans);
    }
}
