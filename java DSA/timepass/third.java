package timepass;
public class third {
    public static void main(String[] args) {
        int []arr={3,2,1,4,16,16,16};
        int last=arr[0];
        int sec=last;
        int third=sec;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>last){
                third=sec;
                sec=last;
                last=arr[i];
            }
        }
        System.out.println(third);

    }
}
