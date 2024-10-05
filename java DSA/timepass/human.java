package timepass;
public class human extends Person{
    public static void main(String [] args){
        Person p1=new human();
        // p1.name="Rahul";
        // p1.age=13;
        // System.out.println(p1.name);
        p1.setName("Rahul");
        // p1.setAge(15);
        System.out.println(p1.getAge());
        p1.setAge(13);
        System.out.println(p1.getAge());

    }
}

