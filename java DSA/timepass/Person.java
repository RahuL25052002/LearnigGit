package timepass;


public class Person {
    private String name="Ram";
    private int age=20;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        }
    }
    public static void main(String[] args){
        Person p1=new Person();
        p1.name="Rohit";
        p1.age=15;

    }
    
}
