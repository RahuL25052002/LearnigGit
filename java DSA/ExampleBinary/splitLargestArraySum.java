package ExampleBinary;
public class splitLargestArraySum{
    public static void main(String[] args) {
        int arr[]={7,2,5,10,8};
        int m=2;
        System.out.println(splitLargestArray(arr, m));
        
    }
    public static int splitLargestArray(int []arr,int m){
        int start=0;
        int end=0;
        //WE HAVE FIND START AND END BY THE MAXIMUM OF IN THE ARRAY;
        for(int i=0;i<arr.length;i++){
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int piece=1;
            for(int num:arr){
                if(sum+num>mid){
                    sum=num;
                    piece++;
                }else{
                    sum+=num;
                }
            }
            if(piece>m){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end;
    }
}