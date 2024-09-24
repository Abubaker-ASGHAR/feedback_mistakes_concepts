package org.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Main {
    public static void main(String[] args) {

        Set<Person> people = new HashSet<>();


        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));


        /////////// Duplicate based on overridden equals() and hashCode()///////////////////
        people.add(new Person("Alice", 30));


        System.out.println("People in the set:");
        for (Person person : people) {
            System.out.println(person);
        }

        Person searchPerson = new Person("Alice", 30);
        System.out.println("\nDoes the set contain 'Alice, 30'? " + people.contains(searchPerson));
    }
}
