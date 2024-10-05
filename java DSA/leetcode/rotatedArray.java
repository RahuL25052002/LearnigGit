package leetcode;

public class rotatedArray {
    public static void main(String[]args){
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    public static  int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        int mid=start+(end-start)/2;
        while(start<end){
            if(nums[mid]==target)
                ans=mid;
            else if(nums[start]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return ans;
    }
}
