
package company_inheritance;

public class Employee extends Person{
    //Attributes
    protected double salary;
    
    //Constructor to initializze a class
    public Employee(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }
    
    //Getters
    public double getSalary(){
        return this.salary;
    } 
    
    //Setter
    public void raiseSalary(){
        this.salary = this.salary * 1.2;
    }
}
