package RecursionJava;

public class countZeros {
    public static void main(String[] args) {
        int num=303030000;
        System.out.println(howManyZero(num));
    }
    static int howManyZero(int num){
        return helper(num,0);
    }
    private static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
