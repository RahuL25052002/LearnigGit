package SortingAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // Compare based on age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob", 25));
        persons.add(new Person("Charlie", 28));

        System.out.println("Before sorting:");
        for (Person person : persons) {
            System.out.println(person);
        }

        Collections.sort(persons);

        System.out.println("\nAfter sorting by age:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
