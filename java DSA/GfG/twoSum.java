/*
 *
 */


class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         sum=arr[i]+arr[j];
        //         if(target==sum){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        HashSet<Integer> s=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            int temp=target-arr[i];
            if(s.contains(temp))
                return true;
            s.add(arr[i]);
        }
        return false;
    }
}
