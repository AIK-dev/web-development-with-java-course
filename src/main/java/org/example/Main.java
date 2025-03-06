package org.example;


import org.example.solutions.Person;

import static org.example.solutions.NthOddElement.getNthOddElement;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world!");


        // I don't even know how to declare simple arrays of integers in Java yet.
        int[] exampleNumbersOne = {5, 3, 8, 1, 9};
        int[] exampleNumbersTwo = {5, 3, 8, 1, 9 };
        int[] exampleNumbersThree = {12, 15, 7, 8, 9, 10, 3, 5, 11, 19};



        try {

            System.out.println(getNthOddElement(exampleNumbersOne, 4)); // Output: 9
            System.out.println(getNthOddElement(exampleNumbersThree, 3)); // Output: 9

            System.out.println(getNthOddElement(exampleNumbersThree, 3)); // Output: 9
            System.out.println(getNthOddElement(exampleNumbersThree, 5)); // Output: 11
            System.out.println(getNthOddElement(exampleNumbersThree, 7)); // Throws Exception


            System.out.println(getNthOddElement(exampleNumbersTwo, 5)); // Output: Exception: "Index out of bounds for odd elements"
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }


        // Testing for the Person class
        Person person1 = new Person(); // Default constructor
        Person person2 = new Person("Alice"); // Name only
        Person person3 = new Person("Bob", 25); // Both name and age

        // Print the string representations of the Person objects
        System.out.println(person1); // "I am John Doe"
        System.out.println(person2); // "Hello, I am Alice"
        System.out.println(person3); // "Hello, I am Bob. I am 25 years old"



    }
}