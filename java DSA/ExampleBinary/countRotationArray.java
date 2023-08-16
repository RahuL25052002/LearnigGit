package ExampleBinary;
public class countRotationArray{
    public static void main(String[] args) {
       int []arr={1,2,3,4,5,6,-2,-1,0};
       System.out.println(countRotationArrayElement(arr)); 
    }
    static int countRotationArrayElement(int arr[]){
        int pivot=findPivot.findPivotElement(arr);
        return pivot+1;
    }
    
}