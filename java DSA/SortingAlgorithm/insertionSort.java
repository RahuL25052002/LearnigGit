package SortingAlgorithm;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int arr[]={3,4,2,1,5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void insertion(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    selectionSort.swapped(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
}
