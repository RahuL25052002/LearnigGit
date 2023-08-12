package ExampleBinary;

import java.util.Arrays;

public class firstAndLast {
    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,3,3,3,4,4,4,5,6,7,7};
        int target=5;
        int []ans=searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int arr[],int target){
        int ans[]={-1,-1};
        boolean findStartIndex=true;
        int start=search(arr,target,findStartIndex);
        findStartIndex=false;
        int end=search(arr, target,findStartIndex);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    /**
     * @param arr
     * @param target
     * @param findStartIndex
     * @return
     */
    static int search(int arr[],int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target)
                start=mid+1;
            else{
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
