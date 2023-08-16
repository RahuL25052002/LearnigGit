package ExampleBinary;

public class findPivot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,-3,-1,0};
        int target=-1;
        //System.out.println(binarySearch(arr, target, 0,arr.length-1));
        System.out.println(search(arr,target));        
    }
    static int search(int arr[],int target){
        int pivot=findPivotElement(arr);

        if(pivot==-1){
            return binarySearch(arr, target,0, arr.length-1);
        }
        if(arr[pivot]== target){
            return pivot;
        }
        if(arr[0]<=target){
            return binarySearch(arr, target,0, pivot-1);
        }
        return binarySearch(arr, target, pivot+1, arr.length-1);

    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
    /**
     * @param arr
     * @return
     */
    public static int findPivotElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
