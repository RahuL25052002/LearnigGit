package InBuildExamples;

import java.util.*;

public class firstExamles {
     public static void main(String[] args) {
          Stack<Integer> stack =new Stack<>();
          stack.push(38);
          stack.push(45);
          stack.push(67);
          stack.push(75);
     
          System.out.println(stack.pop());
          System.out.println(stack.size());  

          Queue<Integer> queue=new LinkedList<>();
          queue.add(3);
          queue.add(3);
          queue.add(3);
          queue.add(3);
          queue.add(3);
          System.out.println(queue);


     }
     

}
