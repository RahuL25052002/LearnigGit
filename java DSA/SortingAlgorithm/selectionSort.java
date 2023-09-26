package SortingAlgorithm;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int Arr[]={5,4,3,2,1,0};
        selection(Arr);
        System.out.println(Arrays.toString(Arr));
    }
    public static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxindex=maxIndexOf(arr,0,last);
            swapped(arr,maxindex,last);
        }
    }
    public static void swapped(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static int maxIndexOf(int arr[],int start,int last){
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
