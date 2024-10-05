package InBuildExamples;

public class StackaMain {
    public static void main(String[] args)throws Exception {
        customStack stack=new DynamicStack(5);
        stack.push(38);
        stack.push(45);
        stack.push(67);
        stack.push(75);
        stack.push(90);
        stack.push(89);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
    
}
