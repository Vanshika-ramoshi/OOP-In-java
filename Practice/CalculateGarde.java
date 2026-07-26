package practice;

import java.util.Scanner;

public class Student {

    public void calculateGrade(String name, int m1, int m2, int m3) {

        double average = (m1 + m2 + m3) / 3.0;

        System.out.println("Student Name: " + name);
        System.out.println("Average: " + average);

        if (average > 75) {
            System.out.println("Grade: A");
        } else if (average >= 60) {
            System.out.println("Grade: B");
        } else if (average >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        int m3 = sc.nextInt();

        Student s1 = new Student(); 

        s1.calculateGrade(name, m1, m2, m3);

        sc.close();
    }
}
