
package java_abstraction;

import java.io.IOException;

public class Java_Abstraction {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("message.txt");
        
        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println(digitsOnlyFileReader.getPath());
    }
    
}
