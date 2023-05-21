
package java_abstraction3;

public class AccountTransferEvent extends AbstractEvent {
    
    public AccountTransferEvent(String id){ super(id);}
    
    @Override
    public void process(){
        System.out.println("Customer " + id + " needs to transfer " + 
                "their services. Reaching out to CTE to remove " + 
                "services form old device and add service to " +
                "new device");
    }
}
