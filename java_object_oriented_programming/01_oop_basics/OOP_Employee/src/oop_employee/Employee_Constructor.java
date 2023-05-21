
package oop_employee;

public class Employee_Constructor {
    String name;
    String location;
    int age;
    double salary;
    
    //Constructor
    Employee_Constructor(String name, String location, double salary, int age){
        this.name = name;
        this.location = location;
        this.age = age;
        this.salary = salary;
    }
    
    void raiseSalary(){
        this.salary = this.salary * 1.2;
    }
}
