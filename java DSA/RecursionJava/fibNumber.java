package RecursionJava;

public class fibNumber {
    public static void main(String[] args) {
        int num=4;
        System.out.println(fib(num));
        System.out.println(fib2(num));
    }
    static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    static int fib2(int n){
        int num1=0,num2=1;
        int num3=0;
        while(n!=0){
            num1=num2;
            num2=num3;
            num3=num1+num2;
            n--;
        }
        return num3;
    }    
}
