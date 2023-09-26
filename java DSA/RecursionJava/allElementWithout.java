package RecursionJava;

import java.util.ArrayList;

public class allElementWithout {
     public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,6,7,4,9,11};
        int target=4;
        ArrayList<Integer> list=new ArrayList<>();
        list=findAllSearchElement(arr,target,0);
        System.out.println(list);

    }
    static ArrayList<Integer> findAllSearchElement(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length)
            return list;
        if(arr[index]==target)
            list.add(index);
        ArrayList<Integer> BelowFindElement=new ArrayList<>();
        BelowFindElement= findAllSearchElement(arr, target, index+1);
        list.addAll( BelowFindElement);
        return list;
    }
}
