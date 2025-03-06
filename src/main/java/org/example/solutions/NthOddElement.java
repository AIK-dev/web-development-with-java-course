package org.example.solutions;

public class NthOddElement {

    public static int getNthOddElementV1(int[] arr, int n) {

        if (n <= 0 || n > arr.length) {
            throw new IndexOutOfBoundsException("Index out of bounds for odd elements");
        }

        int oddCount = 0;
        int i = 0;
        for (i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                oddCount++;
            }
            if (oddCount == n) {
                return arr[i];
            }
        }

        if (i == arr.length) {
            throw new IndexOutOfBoundsException("Index out of bounds for odd elements");
        }

        // That is not an elegant way to do it at all.
        return 0;
    }


    public static int getNthOddElementV2(int[] arr, int n) {

        if (n <= 0 || n > arr.length) {
            throw new IndexOutOfBoundsException("Index out of bounds for odd elements");
        }

        int oddCount = 0;
        int i = 0;
        for (i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                oddCount++;
            }
            if (oddCount == n) {
                return arr[i];
            }
        }
        throw new IndexOutOfBoundsException("Index out of bounds for odd elements");

//        if (i == arr.length) {
//            throw new IndexOutOfBoundsException("Index out of bounds for odd elements");
//        }
//
//        // That is not an elegant way to do it at all.
//        return 0;
    }


    public static int getNthOddElement(int[] arr, int n) {

        if (n <= 0 || n > arr.length) {
            throw new IndexOutOfBoundsException("Index out of bounds for odd elements");
        }

        int oddCount = 0;
        int i = 0;
        for (i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                oddCount++;
            }
            if (oddCount == n) {
                return arr[i];
            }
        }
        throw new IllegalArgumentException("Index out of bounds for odd elements");

    }

}
