package org.practiceProblems;
import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number greater than 212: ");
        int temp = in.nextInt();
        if(temp >= 212){
            System.out.println("Water is boiling!\n");
        }
        else{
            System.out.println("Water is not boiling!\n");
        }
    }
}
