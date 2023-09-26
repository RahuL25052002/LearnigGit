package RecursionJava;

public class fibNumber {
    public static void main(String[] args) {
        int num=4;
        System.out.println(fib(num));
    }
    static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
