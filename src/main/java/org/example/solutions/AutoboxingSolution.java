package org.example.solutions;

public class AutoboxingSolution {

    public static void demonstrateAutoboxing() {
        int sampleNum = 10;
        Integer sampleWrappedNum = sampleNum;

        Integer wrappedNum = 20;
        int primitiveNum = wrappedNum;
        System.out.println(primitiveNum);
    }
}
