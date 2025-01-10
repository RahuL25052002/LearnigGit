//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.HashMap;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter how many time you want: ");
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
	    System.out.print("Enter  elements:");
            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

	    System.out.print("Enter k value: ");

            int k = Integer.parseInt(br.readLine());

            ArrayList<Integer> ans = new Solution().countDistinct(arr, k);

            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            t--;
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        
        ArrayList<Integer> ans=new  ArrayList<>();
        Set<Integer> occ=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int  count=0;
            for(int j=i;j<k+i;j++){
                if(k+i>arr.length){
                    break;
                }
                occ.add(arr[j]);
            }
            count=occ.size();
            occ.clear();
            if(k+i<=arr.length){
                ans.add(count);
            }
        }
        return ans;
    }
}

