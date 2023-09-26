package RecursionJava;

public class passingNumber {
    public static void main(String[] args) {
        int num=5;
        passNumber(num);
        
    }
    static void passNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        passNumber(--n);
        //passNumber(n--); post Increment thats why it goes on infintie then stackoverflowerror
    }
}
