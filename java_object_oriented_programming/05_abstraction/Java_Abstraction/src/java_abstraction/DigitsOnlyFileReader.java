
package java_abstraction;

public class DigitsOnlyFileReader extends AbstractFileReader {
    
    //Constructor to get AbstracFileReader access to a filepath
    public DigitsOnlyFileReader(String filePath){
        super(filePath);
    }
    
    @Override
    protected String parseLine(String line){
        //replacing all non-numerical characters with an empty string
        return line.replaceAll("[^0-9]", "");
    }
}
