
package java_abstraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractFileReader {
    //Attribute filePath of data type Path (built-in to java)
    private final Path filePath; //Keyword final means once it is set it will not change for the instance by the constructor
    
    //Constructor
    protected AbstractFileReader(String filePath){
        //Converting to a path object
        this.filePath = Paths.get(filePath);
    }
    
    //Getter for a user to retrieve the path
    public String getPath(){
        return filePath.toString();
    }
    
    //Reads the file and return a list of strings
    public List<String> readFile() throws IOException{
        return Files.lines(filePath).map(this::parseLine).collect(Collectors.toList());
    }
    
    protected abstract String parseLine(String line);
        
    
}
