package StringBuffer;

import java.util.Random;

import RecursionJava.sumOfNnumber;

/**
 * stringExample
 */
public class stringExample {

    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer();

        buffer.append("CodewithRahul");
        String  str=buffer.toString();
        System.out.println(str);  
        StringBuffer sb=new StringBuffer(30);
        
        sb=new StringBuffer("rahul");
        System.out.println(
            sb.capacity()
        );
        System.out.println(
            sb 
        );
        Random temp=new Random();
        System.out.println(temp.nextFloat());
    }
}        



