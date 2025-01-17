/*
 *Product array puzzle
Difficulty: EasyAccuracy: 33.46%Submissions: 255K+Points: 2
Given an array, arr[] construct a product array, res[] where each element in res[i] is the product of all elements in arr[] except arr[i]. Return this resultant array, res[].
Note: Each element is res[] lies inside the 32-bit integer range.

Examples:

Input: arr[] = [10, 3, 5, 6, 2]
Output: [180, 600, 360, 300, 900]
Explanation: For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.
Input: arr[] = [12, 0]
Output: [0, 12]
Explanation: For i = 0, res[i] is 0.
For i = 1, res[i] is 12.
Constraints:
2 <= arr.size() <= 105
-100 <= arr[i] <= 100
 *
 */
import java.util.*;
class productArrayPuzzle {
    public static int[] productExceptSelf(int arr[]) {
        // code here

        int []productSum=new int[arr.length];
        int product=1;
        int index=-1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
                index=i;
            }else{
                product=product*arr[i];
            }
        }
        if(count>1){
            return productSum;
        }
        if(index==-1){
            for(int i=0;i<arr.length;i++){
                productSum[i]=product/arr[i];
            }
        }else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    productSum[i]=product;
                }else{
                    productSum[i]=0;
                }
            }
        }
        return productSum;
    }
    public static void main(String[]args){
	int[]arr={10,3,5,6,2};
	arr=productExceptSelf(arr);
	System.out.println(Arrays.toString(arr));
    }
}
