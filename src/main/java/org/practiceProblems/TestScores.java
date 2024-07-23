package org.practiceProblems;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Name a number between 0 and 100: ");
        int n = in.nextInt();
        char grade; // Letter grade to return
        switch (n / 10) {
            case 10:
            case 9:  grade = 'A'; break;
            case 8:  grade = 'B'; break;
            case 7:  grade = 'C'; break;
            case 6:  grade = 'D'; break;
            default: grade = 'F'; break; // Anything below is failing
        }
        System.out.println("Your grade is an " + grade);
    }
}
