package practice;

public class Addition {

    public void add(int a, int b) {
        System.out.println("Addition of Two Integers = " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Addition of Three Integers = " + (a + b + c));
    }

    public void add(double a, double b) {
        System.out.println("Addition of Two Doubles = " + (a + b));
    }

    public static void main(String[] args) {

        Addition a1 = new Addition();

        a1.add(10, 20);          
        a1.add(10, 20, 30);      
        a1.add(10.5, 20.5);      
    }
}
