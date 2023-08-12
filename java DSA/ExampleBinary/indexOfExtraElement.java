package ExampleBinary;

public class indexOfExtraElement {
    public static void main(String[] args) {
        // int []a={4 ,8 ,28 ,40 ,52, 66 ,91, 92,93,99,123,150,200};
        // int []b={4,8 ,28,40 ,52 ,66 ,91 ,92,93,99,123,200};
        int []a={4 ,8 ,28 ,40 ,52, 66};
        int []b={4,8 ,28 ,52,66 };
        int n=a.length;
        int ans=findExtra(a,b,n);
        System.out.println(ans);
    }
    public static int findExtra(int a[], int b[], int n) {
        // add code here.
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;//calculate mid first 
            if(a[start]+a[end]==b[start]+b[end-1]){//here check first element and last element are same or not
                if(a[mid]==b[mid]){//if yes then chek middle element are same 
                    //start=start+1;
                    start=mid+1;//if we know yes then first then missing element will be 
                                // in the next half thats why i start =mid+1
                }else{
                   // end=end-1;
                   end=mid;/* they are not same means the missing element lie in this half
                   and thats why i check in the here end=mid beacause mid value will be missing
                   value in b[] thats why here end=mid
                    */
                }
            }else{
                //if we start or end will be not same then we just chek and return 
                if(a[start]!=b[start]){
                    return start;
                }else{
                    return end;
                }
            }
            System.out.println("Hello");
        }
        return 0;
    }
}
// 8
// 4 8 28 40 52 66 91 92
// 4 8 40 52 66 91 92

