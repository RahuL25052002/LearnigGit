package RecursionJava;

public class sumOfDigit {
    public static void main(String[] args) {
        int num=12345;
        System.out.println(sumDigit(num));

    }
    static int sumDigit(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumDigit(n/10);
    }
}
