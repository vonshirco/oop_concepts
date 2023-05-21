
package bank_enc;


public class Bank_Enc {

    
    public static void main(String[] args) {
        // creating a Bank Account Instance
        BankAccount myBank = new BankAccount("Von", 9000);
        
        System.out.println("The bank account owner is " + myBank.getOwner() + 
                " and his balance is " + myBank.getBalance());
        
        //Withdrawing some amount
        myBank.withDraw(5000);
        
        System.out.println("The new balance after withdraw is " + myBank.getBalance());
       
        //Depositing some amount
        myBank.deposit(10000);
        
        System.out.println("The amount after deposit is " + myBank.getBalance());
        
        //Adding a new owner
        myBank.addOwner("Kamulika");
        
        System.out.println("The new owner now is "+ myBank.getOwner());
    }
    
}
