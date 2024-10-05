package ArraysDSA;
import java.util.*;
public class ArrayListJava{
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList <Integer> list=new ArrayList<>();
   //     list.add(10);
   //     list.add(67);
   //     list.add(25);
   //     list.add(60);
   //     list.add(485);
   //     System.out.println(list);
   //     if((list.contains(32535))){
   //         System.out.println("Present");
   //     }else{
   //         System.out.println("Absent");
   //     }
   //    System.out.println("Change element: "+list.set(0,214)+" Updated list:  "+ list); 
            System.out.println("how many elemnet you want to take: ");
            int ele=sc.nextInt();
            for(int i=0;i<ele;i++){
                list.add(sc.nextInt());
            }
            for(int i=0;i<5;i++){
                System.out.println(list.get(i));
            }
            System.out.println(list);
        }
        System.out.println("Changes from the git");
    }
}
