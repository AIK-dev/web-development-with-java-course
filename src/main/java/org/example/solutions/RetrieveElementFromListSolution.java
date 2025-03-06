package org.example.solutions;

import java.util.ArrayList;

public class RetrieveElementFromListSolution {
    public String retrieveElement(ArrayList<String> arr, int index) {
        if (index >= arr.size() || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + arr.size());
        }
        return arr.get(index);
    }
}
