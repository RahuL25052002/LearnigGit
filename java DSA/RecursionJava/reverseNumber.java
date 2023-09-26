package RecursionJava;
public class reverseNumber {
    public static void main(String[] args) {
        int num=1234;
        rev1(num);
    }
    static int sum=0;
    static void rev1(int n){
        if(n==0){
            System.out.println(sum);
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);
    }
    
}
