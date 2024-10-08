package InBuildExamples;
public class DynamicStack extends customStack{
    public DynamicStack(){
        super();//it wiil call the customStack
    }
    public DynamicStack(int size){
        super(size);

    }
    @Override
    public boolean push(int item){
        if(this.isFull()){
            int[] temp=new int[data.length*2];
            //copy all the previous items in new data
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(item);
    }
}
