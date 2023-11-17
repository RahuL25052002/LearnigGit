package LinkedListInJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class first {
    public static void main(String[] args) {
        // LinkedList ll=new LinkedList();
        // ll.add(10);
        // ll.add(20);
        // ll.add(30);
        // ll.add(1,40);// add node at a given position 1
        // System.out.println(ll);
         LinkedList<String> list = new LinkedList<String>(); 
  
        // Use add() method to add elements in the list 
        list.add("Geeks"); 
        list.add("for"); 
        list.add("Geeks"); 
        list.add("10"); 
        list.add("20"); 
            
        // A collection is created 
        Collection<String> collect = new ArrayList<String>(); 
        // collect.add("A"); 
        // collect.add("Computer"); 
        // collect.add("Portal"); 
        // collect.add("for"); 
        // collect.add("Geeks"); 
    
        // Displaying the list 
        System.out.println("The LinkedList is: " + list); 
                
        // Appending the collection to the list 
        boolean value=list.addAll(collect); 
    
        // Clearing the list using clear() and displaying 
        System.out.println("The new linked list is: " + list); 
        System.out.println(value);//it gives false beacuse of the no append opeartion is performed in that 
    }
}
