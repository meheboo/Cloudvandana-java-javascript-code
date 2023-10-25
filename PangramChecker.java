package com.pratice;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine().toLowerCase();

        boolean isPangram = isPangram(inputSentence);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        Set<Character> alphabet = new HashSet<>();

        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabet.remove(c);
            }
        }

        return alphabet.isEmpty();
    }
}
