package practice;

public class Employee {

    String name;
    double salary;

    public void employeeDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------
package practice;

public class Manager extends Employee {

    double bonus;

    public void calculateSalary(double bonus) {
        this.bonus = bonus;

        double totalSalary = salary + bonus;

        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : " + salary);
        System.out.println("Bonus         : " + bonus);
        System.out.println("Total Salary  : " + totalSalary);
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
package practice;

public class EmployeeMain {
  
    public static void main(String[] args) {

        Manager m1 = new Manager(); 

        m1.employeeDetails("Vanshika", 50000);

        m1.calculateSalary(10000);
    }
}
