public class maximumSubArrayWithSum{
	
	public static void main(String[] args){
		int []arr={2,5,1,7,10};
		int k=7;
		int maxLen=subArraysMaxLen(arr,k);
		System.out.println(maxLen);
	}
	public static int subArraysMaxLen(int[]arr,int k){
		int maxLen=0;
		int l=0;
		int r=0;
		int sum=0;
		while(r<arr.length){
			sum=sum+arr[r];

			if(sum>k){
				sum=sum-arr[l];
				l++;
			}		
			if(sum<=k){
				maxLen=Math.max(maxLen,r-l+1);
				r++;
			}
		}
		return maxLen;
	}
	
}
