package lec10BinarySearch;

public class Binary {
    public static void main(String[] args) {
        int []arr={-1,0,2,3,5,12,45,67,69,900};
        int target=-1;
        int ans=BinarySearch(arr, target);
        System.out.println(ans);
        
    }
    //return index if element found
    //return -1 if not found
    static int BinarySearch(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        int count=0;
        while(start<=end){
            //find mid 
            count++;
            System.out.println(count);
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
