package org.example.solutions;

import java.util.ArrayList;

public class ReplaceSecondElementInList {

    public static void replaceSecondElement(ArrayList<String> elements, String newElement) {
        if (elements.size() < 2) {
            // Wow these intellisense guesses are clever indeed. Goddamn it.
            throw new IndexOutOfBoundsException("There are no second element in the list");
        }
        elements.set(1, newElement);
    }
}
