package org.practiceProblems;
import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = in.nextLine().toLowerCase();
        System.out.println("Enter another word: ");
        String otherWord = in.nextLine().toLowerCase();
        if (word.equals(otherWord)) {
            System.out.println("Words are the same");
        }
        else{
            System.out.println("Words are not the same");
        }
    }
}
