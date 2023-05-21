
package encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
        //Creating an Object Instance
        TreeEnc myFavTree = new TreeEnc(90, 30, TreeType.MAPLE);
        
        System.out.println(myFavTree.getTreeType());
        System.out.println(myFavTree.getHeightFt());
        System.out.println(myFavTree.getTrunkDiameterInches());
        
        myFavTree.grow();
        
        String name = "Kamulika";
        
        System.out.println(name.length());
        
    }
    
}
