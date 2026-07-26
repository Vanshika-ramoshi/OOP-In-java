package practice;

public class BankAccount {

    private double balance = 0;
   
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount = " + amount);
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw Amount = " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }


    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.deposit(5000);

        b1.withdraw(2000);

        System.out.println("Current Balance = " + b1.getBalance());
    }
}
