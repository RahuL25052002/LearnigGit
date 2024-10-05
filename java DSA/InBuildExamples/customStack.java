package InBuildExamples;

public class customStack {
    protected int []data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;

    public customStack(){
        this(DEFAULT_SIZE);
    }
    public customStack(int size){
        this.data=new int[size];

    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty Stack");
        }
        int remain=data[ptr];
        ptr--;
        return remain;
    }
    public int peek(){
        if(isEmpty()){
          //  throw new Exception("Cannot peek from an empty Stack");
        }
        return data[ptr];
    }
    public int size(){
        return ptr+1;
    }
    public boolean isFull() {
        return ptr==data.length-1;
    }
    public boolean isEmpty() {
        return ptr==-1;
    }


}
