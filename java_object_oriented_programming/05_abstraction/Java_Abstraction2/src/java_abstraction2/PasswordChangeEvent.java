
package java_abstraction2;

import java.sql.Timestamp;

public class PasswordChangeEvent implements Event {
    private Long createdTimeStamp;
    private String id;
    
    public PasswordChangeEvent(String id){
        this.createdTimeStamp = new Timestamp(System.currentTimeMillis()).getTime();
        this.id = id;
    }
    
    @Override
    public Long getTimeStamp(){
        return this.createdTimeStamp;
    }
    
    @Override
    public void process(){
        System.out.println("Customer " + id + " changed their password. " + 
                "Sending a confirmation email to the customer.");
    }
}
