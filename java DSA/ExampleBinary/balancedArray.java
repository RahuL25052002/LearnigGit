package ExampleBinary;

public class balancedArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,8,9};
        int x=4;
        String ans=isBalanced(arr, x);
        System.out.println(ans);
        
    }
    public static String isBalanced(int a[],int x){
        int start=0;
        int end=a.length-1;
        if(a[end]<x)
            return "Not Balanced";    
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==x)
                return "Balanced";
            if(a[mid]>x)
                end=mid-1;
            if(a[mid]<x)
                start=mid+1;
        }
        int ceil=a[start];
        int floor=a[end];
        if(x-floor==ceil-x)
            return "Balanced";
        else
            return "Not Balanced";
    }    
}
/*
 * Question :-Balance with respect to an array
 * As a programmer, it is very necessary to maintain balance in the life.
 * Here is task for you to maintain a balance. Your task is to find whether
 * a given number x is balanced with respect to a given array a[ ] which is
 * sorted in non-decreasing order. Given a sorted array a[ ], the ceiling of
 * x is the smallest element in the array greater than or equal to x, and
 * the floor of x is the greatest element smaller than or equal to x. The number
 * 'x' is said to be balanced if the absolute difference between floor of x and
 * x is equal to the absolute difference between ceil of x and x i.e. if
 * absolute(x - floor(x, a[])) = absolute(ceil(x, a[]) - x).
 * If one of floor or ceil does not exist assume 'x' to be balanced.
 */