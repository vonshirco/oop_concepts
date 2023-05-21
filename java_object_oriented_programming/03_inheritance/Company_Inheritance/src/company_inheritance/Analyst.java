
package company_inheritance;

public class Analyst extends Employee {
    
    //Constructor
    public Analyst(String name, int age, double salary){
        super(name, age, salary);
    }
    
    //Setter
    public double getAnnualBonus(){
        return super.salary * .05;
    }
    
}


