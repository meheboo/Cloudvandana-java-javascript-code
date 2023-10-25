package com.pratice;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] myArray = {1, 2, 3, 4, 5, 6, 7};

        List<Integer> list = Arrays.asList(myArray);
        Collections.shuffle(list);

        System.out.println("Shuffled array: " + Arrays.toString(list.toArray()));
    }
}