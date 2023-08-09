package ExampleBinary;

public class floorNumber {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=13;
        int ans=findFloor(arr, target);//return index of floor number
        if(ans==-1)
            System.out.println("No floor Number present");
        else
            System.out.println("Floor Number: "+arr[ans]);
        
    }
    static int findFloor(int arr[], long x){
        int start=0;
        int end=arr.length-1;
        if(x>arr[end])
            return end;
        if(x<start)
            return -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x)
                return mid;
            if(arr[mid]>x)
                end=mid-1;
            if(arr[mid]<x)
                start=mid+1;
        }
        return end;
    }
}
