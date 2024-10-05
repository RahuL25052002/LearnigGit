// package GfG;

// import java.util.ArrayList;

// public class postiveornegative {
//     public static void main(String[] args) {
//         int arr[]={-5,-2,5,2,4,7,1,8,0};
//         int n=arr.length;
//         rearrange(arr,n);

//     }
//     static void rearrange(int arr[], int n) {
//         // code here
//         ArrayList list1=new ArrayList();
//         ArrayList list2=new ArrayList();
//         for(int i=0;i<n;i++){
//             if(arr[i]>=0)
//                 list1.add(arr[i]);
//         }
//         for(int i=0;i<n;i++){
//             if(arr[i]<0)
//                 list2.add(arr[i]);
//         }
//         // System.out.println(list1);
//         // System.out.println(list2);
//         int j=0;
//         int k=0;
//         for(int i=0;i<n;i++){
//             if(i%2==0 && j<list1.size()){
//                 arr[i]=(int)list1.get(j);
//                 j++;
//             }else if(k<list2.size()){
//                 arr[i]=(int)list2.get(k);
//                 k++;
//             }else if(j<list1.size()){
//                 arr[i]=(int)list1.get(j);
//                 j++;
//             }
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }
// }
