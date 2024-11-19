import java.util.*;
public class leftRotateArray{
	public static void main(String[]args){
		int []arr={3,4,8,7,1,2};
		leftRotate(arr);
		leftRotateArray obj=new leftRotateArray();
		System.out.println(Arrays.toString(arr));
	}
	private static void leftRotate(int []arr){
		int temp=arr[0];

		for(int i=1;i<arr.length;i++){
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
	}

}
