package GfG;

import java.util.Scanner;


/*Given a number N. The task is to find the Nth catalan number.
The first few Catalan numbers for N = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …
Catalan Number for N is equal to the number of expressions containing N pairs of paranthesis that 
are correct matched, i.e., for each of the N '(' there exist N ')' on there right and vice versa.

Since answer can be huge return answer modulo 1e9+7.*/

public class CatalanNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number to find out that Catalan Number: ");
        int Number=sc.nextInt();
        int CatalanNumber=findCatalan(Number);
        System.out.println("Catalana Number of "+Number+" is : "+CatalanNumber);
        
    }
    public static int findCatalan(int n) {
        // code here
        long  arr[]=new long[n+1];
        int MOD=(int)1e9+7;
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                //formula Cn=C0*Cn+C1*Cn-1+C2*Cn-2+.....+Cn*C0;
                arr[i]=(arr[i]+arr[j]*arr[i-j-1])%MOD;
            }
        }
        return (int)arr[n];

    }
}
