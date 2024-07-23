package org.practiceProblems;
import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter another number: ");
        int b = input.nextInt();
        // Compare the two numbers
        if (a == b){
            System.out.println("Numbers are the same");
        }
        else if (a > b){
            System.out.println("The first number was larger than the second");
        }
        else {
            System.out.println("The second number was larger than the first");
        }
    }
}
