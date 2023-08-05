package Lec9java;

public class evenDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,3423,3232,232412,2,323,2,3,2,12,3233,2};
        System.out.println(findNumbers(nums));

        System.out.println(digits(0));
    }
    public static int findNumbers(int arr[]){
        int count=0;
        for(int num:arr){
            if(even(num))
                count++;
        }
        return count;
    }
    public static boolean even(int num){
        int count=digits(num);
        return count%2==0;
    }
    public static int digits(int number){
        /*int count=0;
        while(number>0){
            count++;
            number=number/10;
        }
        return count;*/
        String val=Integer.toString(number);
        int len=val.length();
        return len;
    } 
}
