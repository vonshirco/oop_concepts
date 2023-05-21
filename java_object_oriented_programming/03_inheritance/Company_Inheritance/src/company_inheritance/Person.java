
package company_inheritance;

public class Person {
    //Attributes
    private String name;
    private int age;
    
    //Constructor to initializze a class
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    //Getters
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
}
