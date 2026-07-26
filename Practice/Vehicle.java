package practice;

public Class Vehicle{
  
    public void start() {
        System.out.println("Vehicle Started");
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
package practice;

public class Car extends Vehicle {

    public void showSpeed() {
        System.out.println("Car Speed = 120 km/h");
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
package practice;

public Class VehicleMain{

    public static void main(String[] args) {

        Car c1 = new Car(); 

        c1.start();      
        c1.showSpeed();  
    }
}
