
package oop_employee;


public class OOP_Employee {

    public static void main(String[] args) {
        //Instance or Objects
        Employee theEmployee1 = new Employee();
        Employee theEmployee2 = new Employee();
        
        //For First Instance
        theEmployee1.name = "Von";
        theEmployee1.age = 18;
        theEmployee1.salary = 1500;
        theEmployee1.location = "Mikocheni";
        
        String name1 = theEmployee1.name;
        int age1 = theEmployee1.age;
        double salary1 = theEmployee1.salary;
        String location1 = theEmployee1.location;
        
        System.out.println("The First Employee is " + name1 + " with the age of " +age1+ 
                " and he is paid a salary of " +salary1+ ", and stays at " +location1+
                " and his salary is now raised to " + theEmployee1.raiseSalary());
        
        //For Second instance
        theEmployee2.name = "Kamulika";
        theEmployee2.age = 21;
        theEmployee2.salary = 2000;
        theEmployee2.location = "Kijitonyama";
        
        String name2 = theEmployee2.name;
        int age2 = theEmployee2.age;
        double salary2 = theEmployee2.salary;
        String location2 = theEmployee2.location;
        
        System.out.println("The Second Employee is " + name2 + " with the age of " +age2+ 
                " and he is paid a salary of " +salary2+ ", and stays at " +location2);
        
        
        //Implementations with a constructor.
        
        //Instances
        Employee_Constructor employeeOne = new Employee_Constructor("Sally Roberts", 
                "New York", 70000, 34);
        Employee_Constructor employeeTwo = new Employee_Constructor("Matt Johnson", 
                "Los Angeles", 65000, 30);
        
        //Giving a raise
        employeeTwo.raiseSalary();
        
        //Outputs
        System.out.println("The First Employee: " + employeeOne.name + " = " + employeeOne.salary);
        System.out.println("The Second Employee: " + employeeTwo.name + " = " + employeeTwo.salary);
         
    }
    
}
