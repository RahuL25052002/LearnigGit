package lp3code;

import java.util.Arrays;
import java.util.Comparator;

public class knapsack {
    public static void main(String[] args) {
        int W = 50; // Weight of knapsack

        Item arr[] = {new Item(60, 10), new Item(100, 20), new Item(120, 30)};

        int n = arr.length; // Get the length of the array using arr.length
        double maxvalue=solve.fractionalKnapsack(W,arr,n);
        System.out.println(maxvalue);
    }

}
class Item{
    int value,weight;
    Item(int x,int y){
        this.value=x;
        this.weight=y;
    }
}
class itemComparator implements Comparator<Item>
{
    @Override
    public int compare(Item a, Item b) 
    {
        double r1 = (double)(a.value) / (double)(a.weight); 
        double r2 = (double)(b.value) / (double)(b.weight); 
        if(r1 < r2) return 1; 
        else if(r1 > r2) return -1; 
        else return 0; 
    }
}
class solve{
    static double fractionalKnapsack(int W, Item arr[], int n) {
        Arrays.sort(arr, new itemComparator()); 
        
        int curWeight = 0; 
        double finalvalue = 0.0; 
        
        for (int i = 0; i < n; i++) {
       
            if (curWeight + arr[i].weight <= W) {
                curWeight += arr[i].weight;
                finalvalue += arr[i].value;
            }
     
            else {
                int remain = W - curWeight;
                finalvalue += ((double)arr[i].value / (double)arr[i].weight) * (double)remain;
                break;
            }
        }
     
        return finalvalue;
        
    }
}
