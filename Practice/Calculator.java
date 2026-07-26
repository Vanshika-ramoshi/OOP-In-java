package practice;

import java.util.Scanner;

public class Calculator {

    public void calculate(int num1, int num2, char operator) {

        switch (operator) {

        case '+':
            System.out.println("Addition = " + (num1 + num2));
            break;

        case '-':
            System.out.println("Subtraction = " + (num1 - num2));
            break;

        case '*':
            System.out.println("Multiplication = " + (num1 * num2));
            break;

        case '/':
            if (num2 != 0) {
                System.out.println("Division = " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero.");
            }
            break;

        default:
            System.out.println("Invalid Operator");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter Operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        Calculator c1 = new Calculator(); 

        c1.calculate(num1, num2, operator);

        sc.close();
    }
}
