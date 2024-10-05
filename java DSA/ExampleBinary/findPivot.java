package ExampleBinary;

public class findPivot {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target=0;
        //System.out.println(binarySearch(nums, target, 0,nums.length-1));
        System.out.println(search(nums,target));        
    }
    static int search(int nums[],int target){
        int pivot=findPivotElement(nums);

        if(pivot==-1){
            return binarySearch(nums, target,0, nums.length-1);
        }
        if(nums[pivot]== target){
            return pivot;
        }
        if(nums[0]<=target){
            return binarySearch(nums, target,0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);

    }
    static int binarySearch(int[] nums, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
    /**
     * @param nums
     * @return
     */
    public static int findPivotElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid-1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
