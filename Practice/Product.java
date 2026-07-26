package practice;

import java.util.Scanner;

public class Product {

    public void calculateBill(String productName, int quantity, double price) {

        double bill = quantity * price;
        double finalAmount;

        if (bill > 5000) {
            finalAmount = bill - (bill * 10 / 100);
            System.out.println("10% Discount Applied");
        } else {
            finalAmount = bill;
            System.out.println("No Discount");
        }

        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total Bill: " + bill);
        System.out.println("Final Amount: " + finalAmount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Product p1 = new Product(); 

        p1.calculateBill(productName, quantity, price);

        sc.close();
    }
}
