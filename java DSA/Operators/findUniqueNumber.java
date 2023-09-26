package Operators;

public class findUniqueNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,2,1,5,4,5,4,54};
        System.out.println(findUnique(arr));
    }
    static int findUnique(int[]arr){
        int single=0;
        //XOR number to get a unique Number a^a=0//
        for(int num:arr){
            single^=num;
        }
        return single;
    }
}
