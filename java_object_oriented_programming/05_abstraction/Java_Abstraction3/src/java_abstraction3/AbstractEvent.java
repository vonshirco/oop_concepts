
package java_abstraction3;

import java.sql.Timestamp;

public abstract class AbstractEvent implements Event {
    protected Long createdTimeStamp;
    protected String id;
    
    public AbstractEvent(String id){
        this.createdTimeStamp = new Timestamp(System.currentTimeMillis()).getTime();
        this.id = id;
    }
    
    @Override
    public Long getTimeStamp(){
        return this.createdTimeStamp;
    }
    
    public abstract void process();
}
