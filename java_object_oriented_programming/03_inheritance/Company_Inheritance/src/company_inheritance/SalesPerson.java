
package company_inheritance;

public class SalesPerson extends Employee {
    
    //Attribute
    private double commissionPercentage;
    
    //Constructor to initiliaze the class
    public SalesPerson(String name, int age, double salary, double commissionPercentage) {
        super(name, age, salary); //take from the super class constructor
        this.commissionPercentage = commissionPercentage;
    }
    
    //Getter
    public double getCommissionPercentage(){
        return this.commissionPercentage;
    }
    
    //Setter
    public void raiseCommission(){
        if(this.commissionPercentage < .30){
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }
}
