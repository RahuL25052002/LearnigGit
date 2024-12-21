/*
 *Rotate by 90 degree
Difficulty: EasyAccuracy: 56.88%Submissions: 88K+Points: 2
Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space. 

Examples:

Input: mat[][] = [[1, 2, 3],
                [4, 5, 6]
                [7, 8, 9]]
Output: Rotated Matrix:
[3, 6, 9]
[2, 5, 8]
[1, 4, 7]
Input: mat[][] = [[1, 2],
                [3, 4]]
Output: Rotated Matrix:
[2, 4]
[1, 3]
Constraints:
1 ≤ n ≤ 102
0 <= mat[i][j] <= 103
 */

class rotateBy90Degrees{
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        // code here
        int p=mat.length;
        int q=mat[0].length;
        int[][] newmat=new int[p][q];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                newmat[i][j]=mat[i][j];
            }
        }
        int m=0;
        for(int i=mat.length-1;i>=0;i--){
            int n=0;
            for(int j=0;j<mat[i].length;j++){
                mat[m][n]=newmat[j][i];
                n++;
            }
            m++;
        }
    }
    public static void main(String[]args){
	int mat[][]={
		{1,2,3},
		{4,5,6},
		{7,8,9}
	};
	rotateby90(mat);

	for(int i=0;i<mat.length;i++){
		System.out.print("{ ");
		for(int j=0;j<mat[i].length;j++){
			System.out.print(mat[i][j]+" ");
		}
		System.out.print("}");
		System.out.println();
	}

    }
}
