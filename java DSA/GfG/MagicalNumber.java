package GfG;
class MagicalNumber {

    public static int findMagicalNumber(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int ans=-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == mid) {
                ans=mid;
                right=mid-1;
            } else if (arr[mid] < mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {-1,1,2,3,5,7};
        int result1 = findMagicalNumber(arr1);
        System.out.println("Output for arr1: " + result1); // Output: 2

        int[] arr2 = {0, 2, 4, 6, 8};
        int result2 = findMagicalNumber(arr2);
        System.out.println("Output for arr2: " + result2); // Output: 0
    }
}
