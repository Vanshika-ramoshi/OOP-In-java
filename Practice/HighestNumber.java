package practice;

import java.util.Scanner;

public class HighestNumber {

    public void findHighest(int a, int b, int c, int d) {

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    System.out.println("Highest Number = " + a);
                } else {
                    System.out.println("Highest Number = " + d);
                }
            } else {
                if (c > d) {
                    System.out.println("Highest Number = " + c);
                } else {
                    System.out.println("Highest Number = " + d);
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    System.out.println("Highest Number = " + b);
                } else {
                    System.out.println("Highest Number = " + d);
                }
            } else {
                if (c > d) {
                    System.out.println("Highest Number = " + c);
                } else {
                    System.out.println("Highest Number = " + d);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int c = sc.nextInt();

        System.out.print("Enter Fourth Number: ");
        int d = sc.nextInt();

        HighestNumber h1 = new HighestNumber(); 

        h1.findHighest(a, b, c, d);

        sc.close();
    }
}
