
package contacts_polymorphism;

public class Contact {
    private String name;
    private PhoneNumber phoneNumber;
    private String emailAddress;
    
    //Compile time polymorphism (Overloading the Constructor method)\
    
    public Contact(String name, PhoneNumber phoneNumber, String emailAddress){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    public Contact(String name, PhoneNumber phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    public Contact(String name, String emailAddress){
        this.name = name;
        this.emailAddress = emailAddress;
    }
    
    //Using Run time Polymorphism to override the default object toString functionality
    //And provide a more specific implementation for the contact class
    @Override
    public String toString(){
        return "Contact{" + "name='" + name + '\'' + ", phoneNumber=" + phoneNumber + ", emailAddress='" + emailAddress + '\'' + '}';
    }
    
}
