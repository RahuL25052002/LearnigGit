package GfG;

import java.util.ArrayList;

public class MaximumSubArraysOfK {
    public static void main(String[] args) {
        //to find out maximum subarrays  element in that array 
        int arr[]={1,2,3,4,5,6,7,8,3};
        ArrayList <Integer> res = new ArrayList<Integer>();
        res=max_of_subarrays(arr,arr.length,3);
        for (int i = 0; i < res.size(); i++)
            System.out.print (res.get (i) + " ");
        System.out.println();
        System.out.println(res.toString());
    
    }
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n-k+1;i++){
            int max=0;
            int j=i;
            while(j<i+k){
                if(arr[j]>max)
                    max=arr[j];
                j++;
            }
            list.add(max);
        }
        return list;
    }
}
