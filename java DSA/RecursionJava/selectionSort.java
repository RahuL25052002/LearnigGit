package RecursionJava;

import java.util.Arrays;

public class selectionSort {
      public static void main(String[] args) {
        int[] arr={4,3,2,1};
        selectionsorting(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
        
    }

    static  int count=0;
    static void selectionsorting(int[] arr,int r,int c,int max){
        count++;
        if(r==0)
            return;
        if(c<r){
            if(arr[c]>arr[max]){
                selectionsorting(arr, r, c+1,c);
            }else{
                selectionsorting(arr, r, c+1, max);
            }
        }else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selectionsorting(arr, r-1, 0,0);
        }
    }
}
