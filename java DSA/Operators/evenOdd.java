package Operators;
public class evenOdd {
    public static void main(String[] args) {
        int num=67;
        if(isOdd(num)){
            System.out.println(num + " is odd");
        }else{
            System.out.println(num+ " is Even");
        }
    }
    static boolean isOdd(int num){
        return (num&1)==1;
    }
}
