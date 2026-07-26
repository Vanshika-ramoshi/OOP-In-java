package practice;

public class Area {

    // Circle
    public void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }

    // Rectangle
    public void area(int length, int breadth) {
        int result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }

    // Triangle
    public void area(int base, int height, int x) {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }

    public static void main(String[] args) {

        Area a1 = new Area();

        a1.area(5.0);        
        a1.area(10, 20);     
        a1.area(10, 8, 1);   
    }
}
