
package oop;

import java.awt.Color;

public class OOP {
    public static void main(String[] args) {
       
       // Creating Object (Using a Constructor in a main class)
       Tree myFavoriteOakTree = new Tree(125, 15, TreeType.OAK);
       
       //System.out.println(myFavoriteOakTree.treeType);
       
       myFavoriteOakTree.announceTallTree();
       
       Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);
       
       myFavoriteMapleTree.announceTallTree();
       
       System.out.println(Tree.TRUNK_COLOR);
       Tree.announceTree();
       
       Color myTrunkColor = Tree.TRUNK_COLOR;
       Color myDefaultWhite = Color.WHITE;
       Color myDefaultBlue = Color.BLUE;
       
       //To get brighter blue(take the default and use the brighter functionality)
       Color brighterBlue = myDefaultBlue.brighter();
       
       
       
    }
    
}
