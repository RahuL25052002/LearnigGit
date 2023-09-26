package RecursionJava;

public class numberOfStep {
    public static void main(String[] args) {
        int num=100;
        System.out.println(Steps(num));
    }
    static int Steps(int num){
        return helper(num,0);
    }
    private static int helper(int n,int step){
        if(n==0){
            return step;
        }
        if(n%2==0){
            return helper(n/2, step+1);
        }
        return helper(n-1, step+1);
    }
}
