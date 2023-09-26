package RecursionJava;

import java.util.ArrayList;

public class allKeyelement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,6,7,4,9,11};
        int target=4;
        ArrayList<Integer> list=new ArrayList<>();
       System.out.println(findAllSearchElement(arr,target,0,list));

    }
    static ArrayList<Integer> findAllSearchElement(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length)
            return list;
        if(arr[index]==target)
            list.add(index);
        return findAllSearchElement(arr, target, index+1, list);
    }
}
