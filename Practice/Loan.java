package practice;

import java.util.Scanner;

public class Loan {

    public void checkLoanEligibility(int salary, int age) {

        if (salary > 25000 && age >= 21 && age <= 60) {
            System.out.println("Eligible for Loan");
        } else {
            System.out.println("Not Eligible for Loan");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        Loan l1 = new Loan(); 

        l1.checkLoanEligibility(salary, age);

        sc.close();
    }
}
