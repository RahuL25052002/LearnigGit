package ExampleBinary;

public class ceilingNumber {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=0;
        int ans=ceilingOfNumber(arr, target);//return index of ceiling number
        System.out.println(ans);
        
    }
    // public static int ceilingOfNumber(int arr[],int target){
    //     int start=0;
    //     int end=arr.length-1;
    //     int ceil=-1;
    //     while(start<=end){
    //         int mid=start+(end-start)/2;
    //         if(arr[mid]>=target){
    //             ceil=arr[mid];
    //             end=mid-1;
    //         }else if(arr[mid]<target){
    //             start=mid+1;
    //         }
    //     }
        
    //     return ceil;
    public static int ceilingOfNumber(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        if(target>arr[end])
            return -1;
        if(target<start)
            return start;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return arr[mid];
            if(arr[mid]>target)
                end=mid-1;
            if(arr[mid]<target)
                start=mid+1;
        }
        return start;
    }
    
}
