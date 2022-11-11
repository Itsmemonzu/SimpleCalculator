package com.itsmemonzu;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // A simple calculator for Subtraction, Division, Multiplication & Addition.

        Scanner input1 = new Scanner(System.in);
        System.out.println("The number that you want to do operations to.");
        String answer1 = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("The number that you want to do operations with.");
        String answer2 = input2.next();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Choose an Operator: Subtraction, Division, Multiplication & Addition.");
        String operator = input3.next();

        int math1 = Integer.parseInt(answer1);
        int math2 = Integer.parseInt(answer2);

        if (operator.equals("Subtraction") || operator.equals("subtraction")) {
            int math = math1 - math2;
            System.out.println("Your answer is:");
            System.out.println(math);

        }
        if (operator.equals("Division") || operator.equals("division")) {
            int math = math1 / math2;
            System.out.println("Your answer is:");
            System.out.println(math);

        }
        if (operator.equals("Addition") || operator.equals("addition")) {
            int math = math1 + math2;
            System.out.println("Your answer is");
            System.out.println(math);
        }
        if (operator.equals("Multiplication") || operator.equals("multiplication")) {
            int math = math1 * math2;
            System.out.println("Your answer is:");
            System.out.println(math);
        }
    }
}
