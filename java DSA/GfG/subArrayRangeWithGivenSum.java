import java.util.*;


class subArrayRangeWithGivenSum {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        // add your code here
        int n = arr.length;
        int currSum = 0;
        int count = 0;
        HashMap<Integer, Integer> sum_freq = new HashMap<>();

        sum_freq.put(0, 1);

        for (int i = 0; i < n; i++) {
            currSum += arr[i];

            if (sum_freq.containsKey(currSum - tar)) {
                count += sum_freq.get(currSum - tar);
            }

            sum_freq.put(currSum, sum_freq.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[]args){
	int []arr={10,2,-2,-20,10};

	int target=-10;

	int ans=subArraySum(arr,target);

	System.out.println(ans);
    }
}
