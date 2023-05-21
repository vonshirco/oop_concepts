
package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class ConditionArrayList extends ArrayList<Integer> {
    
    private Predicate<Integer> condition;
    
    //Constructor to take series of numbers, and it will become an array to use in the implementations
    public ConditionArrayList(Predicate<Integer> predicate, Integer... nums){
        super(Arrays.stream(nums).filter(ConditionArrayList::isOdd).collect(Collectors.toList()));
        this.condition = predicate;
    }
    
    //To override a method from the Arraylist Class (Parent)
    @Override
    public void add(int index, Integer element){
        if(isOdd(element)){ 
            super.add(index, element);
        }
    }
    
    @Override
    public boolean add(Integer element){
        //if(Math.abs(element) % 2 == 1){ -> same as the one below
        if(isOdd(element)){
            return super.add(element);
        }else{
            return false;    
        }
    }
    
    @Override
    public boolean addAll(Collection<? extends Integer> c){
        return super.addAll(c.stream().filter(this::isOdd).collect(Collectors.toList()));
    }
    
    @Override
    public boolean addAll(int index, Collection<? extends Integer> c){
        return super.addAll(index, c.stream().filter(this::isOdd).collect(Collectors.toList()));
    }
    
    //To insert only valid elements
    @Override
    public Integer set(int index, Integer element){
        if(isOdd(element)){
            return super.set(index, element);
        }else{
            System.out.println(element + " is not odd. ");
            return Integer.MIN_VALUE; //returns minimum value for the integer
        }
    }
    
    //Run the operation and then immediately remove the invalid elements
    @Override
    public void replaceAll(UnaryOperator<Integer> operator){
        super.replaceAll(operator);
        super.removeIf(n -> !isOdd(n));
    }
    
    //Checking for odd elements in the array, Math.abs(N) - to get only positive numbers
    public boolean isOdd(Integer element){ //static method is a method that belongs to a class rather than to an instance of a class. 
//        return Math.abs(element) % 2 == 1;
        return condition.test(element);
    }
    
}
