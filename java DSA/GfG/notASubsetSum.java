class Solution {
    public  static long findSmallest(int[] arr) {
        // Your code goes here
        int ans=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                return ans;
            }else{
                ans+=arr[i];
            }
        }
       
        return ans;
    }

    public static void main(String[]args){

	   int arr[]={1,2,3};
	   long ans=findSmallest(arr);
	   System.out.println(ans);
   }
}
