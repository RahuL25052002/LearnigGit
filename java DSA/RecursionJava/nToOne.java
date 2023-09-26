package RecursionJava;

public class nToOne {
    
    public static void main(String[]args){
        int n=9;
        printOneToN(n);
    }
    static void printOneToN(int num){
        if(num==0)
            return;
        printOneToN(num-1);
        System.out.println(num);
    }
}
