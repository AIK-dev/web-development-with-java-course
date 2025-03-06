package org.example.solutions;

public class Person {

    private final String DEFAULT_NAME = "Default name";

    private final int DEFAULT_AGE = 18;

    private String name;
    private int age;


    public Person() {
        this.name = "Default Name";
        this.age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Single argument constructor
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }


    // Override the toString method and let's see if you can go through it well.


    @Override
    public String toString() {
        if (this.name.equals(DEFAULT_NAME) && this.age == DEFAULT_AGE) {
            return "Hello, my name is " + this.name + this.age;
        } else if (this.age == -1) {
            return "Hello, I am " + this.name;
        } else if (this.name.equals("No name")) {
            return "Hello, I am " + this.age + " years old";
        } else {
            return "Hello, I am " + this.name + ". I am " + this.age + " years old";
        }
    }


}

