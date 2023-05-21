
package inheritance_arraylist;

public class Inheritance_ArrayList {

    public static void main(String[] args) {
        //Instance
        ModArrayList listy = new ModArrayList();
        listy.add(0);
        listy.add(10);
        listy.add(20);
        listy.add(30);
        
        System.out.println(listy.getUsingMod(1));
        System.out.println(listy.getUsingMod(-2));
        System.out.println(listy.getUsingMod(40));
    }
    
}
