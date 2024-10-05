// package lp3code;  
// import java.util.Arrays;
// import java.util.Comparator;
// public class practiseKnapsack {
//     public static void main(String[] args) {
//         int W=20;
//         Item arr[]={new Item(25, 18),new Item(25, 15),new Item(15, 20)};
//         int n=arr.length;
//         double maxvalue=solve.fractionalKnapsack(W,arr,n);
//         System.out.println(maxvalue);
//     }
// }
// class Item{
//     int value,weight;
//     Item(int x,int y){
//         this.value=x;
//         this.weight=y;
//     }
// }
// class ItemComparator implements Comparator<Item>{
//     public  int compare(Item a,Item b){
//         double r1=(double)(a.value)/(double)(a.weight);
//         double r2=(double)(b.value)/(double)(b.weight);
//         if(r1<r2) return 1;
//         else if(r1>r2) return -1;
//         else return 0;
//     }
// }
// class solve{
//     public static double fractionalKnapsack(int W,Item[]arr,int n){
//         Arrays.sort(arr,new ItemComparator());
//         int currentWeight=0;
//         double finalValue=0.0;
//         for(int i=0;i<n;i++){
//             if(currentWeight+arr[i].weight<=W){
//                 currentWeight+=arr[i].weight;
//                 finalValue+=arr[i].value;
//             }else{
//                 int remain=W-currentWeight;
//                 finalValue+=((double)arr[i].value/(double)arr[i].weight)*(double)remain;
//                 break;
//             }
//         }
//         return finalValue;
//     }
// }
