package SortingAlgorithm;

import java.util.Arrays;

public class cyclicSort{
    public static void main(String[] args) {
        int arr[]={3,2,4,1,5};
        Sort(arr);
        System.out.println(Arrays.toString(arr));        
    }
    public static void Sort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                selectionSort.swapped(arr, i, correct);
            }else{
                i++;
            }
        }
    }
}