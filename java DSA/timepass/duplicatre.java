package timepass;

import java.util.HashSet;

public class duplicatre {
    public static void main(String[] args) {

        // find DuplicTe s  i  stirng 
    //     String name="Maheshbabu";
    //     int len =name.length();
    //     char [] arr=name.toCharArray();
    //     // for(int i=0;i<len;i++){
    //     //     for(int j=i+1;j<len;j++){
    //     //         if(arr[i]==arr[j]){
    //     //             System.out.println("Duplicates character are: " + arr[j]);
    //     //         }
    //     //     }
    //     // }

    //     HashSet<Character> Dup=new HashSet<>();
    //     for(int i=0;i<len;i++){
            
    //         if(Dup.contains(arr[i])){
    //             System.out.println("Duplicates: "+arr[i]);
    //         }else{
    //             Dup.add(arr[i]);  
    //         }
            
    //     }
    


    // find duplicates in array


        int []arr={2,3,1,2,3,3,3,3,3,3,3};
        HashSet<Integer> s=new HashSet<>();
        // for(int i=0;i<arr.length;i++){
        //     if(s.contains(arr[i])){
        //         System.out.println(arr[i]);
        //     }
        //     s.add(arr[i]);
        // }

        for(int i=0;i<arr.length;i++){
            if(!s.contains(arr[i])){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    s.add(arr[i]);
                    break;
                }
            }
        }

        }
    }
}
