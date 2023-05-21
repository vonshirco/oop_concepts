
package polymorphism;

import java.util.ArrayList;
import java.util.Random;

public class Polymorphism {
    
    public static void addRandomNumber(ArrayList<Integer> list){
        int originalSize = list.size();
        Random random = new Random();
        int n = random.nextInt(1000);
        
        if(list instanceof ConditionArrayList){
            ConditionArrayList conditionList = (ConditionArrayList) list;
                while(!conditionList.isOdd(n)){
                n = random.nextInt(1000);
                list.add(n);
            } 
        }   
        
    }

    public static void main(String[] args) {
        // Initialize OddArrayList with numbers
//        OddArrayList oddListy = new OddArrayList(1,2,3,4,7,9,-13);
          ConditionArrayList oddListy = new ConditionArrayList(n -> Math.abs(n) % 2 == 1);
          oddListy.add(1);
          oddListy.add(2);
       
        addRandomNumber(oddListy);
        System.out.println(oddListy);
        System.out.println(oddListy.size());
        
        ConditionArrayList evenListy = new ConditionArrayList(n -> Math.abs(n) % 2 == 1);
          evenListy.add(1);
          evenListy.add(2);
       
        addRandomNumber(evenListy);
        System.out.println(evenListy);
        System.out.println(evenListy.size());
        
        //Creating a regular array list and adding elements to it
        ArrayList<Integer> listy = new ArrayList<>();
        
        //Adding Elements in the regular Array
        listy.add(1);
        listy.add(2);
//        listy.add(3);
//        listy.add(4);
//        listy.add(7);
//        listy.add(9);
//        listy.add(-13);
       
        addRandomNumber(listy);
        System.out.println(listy);
        System.out.println(listy.size());
    }
    
}
