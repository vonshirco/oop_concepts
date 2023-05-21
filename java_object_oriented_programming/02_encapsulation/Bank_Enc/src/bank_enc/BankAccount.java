
package bank_enc;

public class BankAccount {
    //Attributes
    private String owner;
    private double balance;
    
    //Constructor
    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = Math.max(balance, 0); //Forcing the balance not to be negative
    }
    
    //Getters
    public String getOwner(){
        return owner;
    }
    
    public double getBalance(){
        return balance;
    }
    
    //Setters
    public void withDraw(double withDrawAmount){
        this.balance = balance - withDrawAmount;
    }
    
    public void deposit(double depositAmount){
        this.balance = balance + depositAmount;
    }
    
    public void addOwner(String newOwner){
        this.owner = newOwner;
    }
}
