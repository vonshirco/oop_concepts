
package contacts_polymorphism;

public class Contacts_Polymorphism {

    public static void main(String[] args) {
        //Overloading in the main class
        Contact contactOne = new Contact("Sally", new PhoneNumber("2637263737"));
        Contact contactTwo = new Contact("Maggie", new PhoneNumber(41, "1234567891"));
        Contact contactThree = new Contact("Roger", new PhoneNumber("098765432112"));
        Contact contactFour = new Contact("David", "david@gmail.com");
        Contact contactFive = new Contact("Sarah", new PhoneNumber("2354769802"), "sr@gmail.com");
        
        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactThree);
        System.out.println(contactFour);
        System.out.println(contactFive);
    }
    
}
