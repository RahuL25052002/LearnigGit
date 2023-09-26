package RecursionJava;

public class BinaryRecusrion {
    public static void main(String[] args) {
        int []arr={1,2,3,4,7,9,11};
        int target=4;
        int start=0;
        int end=arr.length-1;
        System.out.println(BinarySearch(arr,target,start,end));
    }
    static int BinarySearch(int []arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
            return mid;
        if(target<arr[mid])
            return BinarySearch(arr, target, start, mid-1);

        return BinarySearch(arr, target, mid+1, end);
    }
}
