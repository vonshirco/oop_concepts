
package inheritance_built_in;

import java.util.Stack;

public class Inheritance_built_in {

    public static void main(String[] args) {
        //Creating and object 
        Stack<Character> charStack = new Stack<>();

        //Pushing (add) Elements in the Stack
        charStack.push('c');
        charStack.push('a');
        charStack.push('t');
        
        //Poping (removing) Elements in the Stack
        System.out.println(charStack);
        System.out.println(charStack.pop());
        System.out.println(charStack);
        System.out.println(charStack.pop());
        System.out.println(charStack);
        System.out.println(charStack.pop());
        System.out.println(charStack);
    }
    
}
