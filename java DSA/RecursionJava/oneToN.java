package RecursionJava;
public class oneToN {
    public static void main(String[]args){
        int n=9;
        printOneToN(n);
    }
    static void printOneToN(int num){
        if(num==0)
            return;
        System.out.println(num);
        printOneToN(num-1);
    }
    
}
