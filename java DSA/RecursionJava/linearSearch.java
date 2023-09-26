package RecursionJava;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,11};
        int target=2;
        System.out.println(linearSearchRec1(arr,target,0));
        System.out.println(linearSearchRec2(arr, target, 0));

    }
    static boolean linearSearchRec1(int[] arr,int target ,int index){
        if(index==arr.length)
            return false;
        return arr[index]==target || linearSearchRec1(arr, target, index+1);
    }
    static int linearSearchRec2(int[] arr,int target,int index){
        if(index==arr.length)
            return -1;
        if(arr[index]==target)
            return index;
        else
            return linearSearchRec2(arr, target, index+1);
    }
}
