package lp5;

// public class bubble {
//     public static void main(String[] args) {
//         int arr[]={64,34,25,12,22,11,90};
//         System.out.println("Original Array: ");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");

//         }
//         BubbleSort(arr);
//         System.out.println("Sorted Array: ");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");

//         }

//     }

//     public static void BubbleSort(int arr[]){
//         boolean swapped=true;
//         while(swapped){
//             swapped=false;
//             #pragma omp parrallel for
//             for(int i=0;i<arr.length-1;i++){
//                 if(arr[i]>arr[i+1]){
//                     swap(arr[i],arr[i+1]);
//                     swapped=true;
//                 }
//                 // swapped=true;
//             }
//         }
//     }

//     private static void swap(int i, int j) {
//        int temp=i;
//        i=j;
//        j=temp;
//     }

// }


import java.util.Arrays;

public class bubble {
    public static void bubbleSort(int[] arr, int n) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            // Parallel processing using threads
            #pragma omp parallel for
            for (int i = 0; i < n - 1; ++i) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        System.out.print("Original array: ");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

        bubbleSort(arr, n);

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}





// void bubbleSort(int arr[], int n) {
//     bool swapped = true;
//     while (swapped) {
//         swapped = false;
//         #pragma omp parallel for
//         for (int i = 0; i < n - 1; ++i) {
//             if (arr[i] > arr[i + 1]) {
//                 swap(arr[i], arr[i + 1]);
//                 swapped = true;
//             }
//         }
//     }
// }

// int main() {
//     int arr[] = {64, 34, 25, 12, 22, 11, 90};
//     int n = sizeof(arr) / sizeof(arr[0]);

//     cout << "Original array: ";
//     for (int i = 0; i < n; ++i)
//         cout << arr[i] << " ";
//     cout << endl;

//     bubbleSort(arr, n);

//     cout << "Sorted array: ";
//     for (int i = 0; i < n; ++i)
//         cout << arr[i] << " ";
//     cout << endl;

//     return 0;
// // }