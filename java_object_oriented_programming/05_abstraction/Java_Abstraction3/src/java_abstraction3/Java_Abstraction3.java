
package java_abstraction3;

public class Java_Abstraction3 {

    public static void main(String[] args) {
       //Events
       PasswordChangeEvent eventOne = new PasswordChangeEvent("192837465");
       AccountTransferEvent eventTwo = new AccountTransferEvent("981276345");
       MissedPaymentEvent eventThree = new MissedPaymentEvent("129834876");
        
       //Putting them together in an event array
       Event[] events = {eventOne, eventTwo, eventThree};
       
       //Iterating through the events array
       for (Event e : events){
           System.out.println(e.getTimeStamp());
           e.process();
           System.out.println();
       }
    }
    
}
