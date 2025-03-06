package org.example.solutions;

public class StringBuilderSolution {

    public static void demonstrateStringBuilder() {
        String s = "Hello";
        // won't work, because we are trying to do this on a string. Even the IDE can detect this.
        s.concat(" World");
        System.out.println(s);

        StringBuilder testStringBuilder = new StringBuilder("Hello");
        testStringBuilder.append(" World");
        System.out.println(testStringBuilder);
    }

}
