
package encapsulation;

import java.awt.Color;

public class TreeEnc {
    
    //Attributes
    protected static Color TRUNK_COLOR = new Color(102, 51, 0); 
    
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;
    
    
    //Constructor
    public TreeEnc(double heightFt, double trunkDiameterInches, TreeType treeType){
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }
    
    //Public Methods to access private attributes (Getters)
    public double getHeightFt(){
        return heightFt;
    }
    
    public double getTrunkDiameterInches(){
        return trunkDiameterInches;
    }
    
    public TreeType getTreeType(){
        return treeType;
    }
    
    //Public Method to allows other classes to set a value to a private attribute (Setters)
    public void setTrunkDiameterInches(double trunkDiameterInches){
        this.trunkDiameterInches = trunkDiameterInches;
    }
    
    
    //Behaviours
    public void grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }
    
    //Static method
    static void announceTree(){
        System.out.println("Look out for that " + TRUNK_COLOR + " tree!");
    }
    
    public void announceTallTree(){
       if(this.heightFt > 100){
           System.out.println("That's a tall " +this.treeType+ " tree");
       }
    }
    
}
