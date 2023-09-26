package SortingAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicates {
    public static void main(String[] args){
        int n=5;
        int arr[]={2,0,3,3,1};
        ArrayList<Integer> ls=duplicatesNumber(arr,n);
        System.out.println(ls);
    }
    public static ArrayList<Integer> duplicatesNumber(int arr[], int n) {
        // code here
        int i=0;
        while(i<arr.length){
            int right=arr[i];
            if(arr[i]!=arr[right]){
                int temp=arr[i];
                arr[i]=arr[right];
                arr[right]=temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        Set<Integer> ls = new HashSet<>();
        for(int j=0;j<n;j++){
            int num=arr[j];
            if(arr[j]!=j){
                ls.add(num);
            }
        }
        System.out.println(ls.size());
        ArrayList<Integer> ans=new ArrayList<>(ls);
        
        if(ls.isEmpty()){
            ls.add(-1);
            return ans;
        }else
            return ans;
    }
}
