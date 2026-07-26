package practice;

import java.util.Scanner;

public class MenuProgram {

    public void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    public void prime(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }

    public void reverse(int num) {
        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.println("Reverse Number = " + rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MenuProgram m1 = new MenuProgram();

        System.out.println("1. Check Even/Odd");
        System.out.println("2. Check Prime");
        System.out.println("3. Reverse Number");

        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        switch (choice) {

        case 1:
            m1.evenOdd(num);
            break;

        case 2:
            m1.prime(num);
            break;

        case 3:
            m1.reverse(num);
            break;

        default:
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
