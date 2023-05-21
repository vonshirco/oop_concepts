
package inheritance_arraylist;

import java.util.ArrayList;

public class ModArrayList<D> extends ArrayList<D>{
    public D getUsingMod(int index){
        int validIndex = Math.abs(index) % this.size(); //to make index positive -> Math.abs()
        return this.get(validIndex);
    }
}
