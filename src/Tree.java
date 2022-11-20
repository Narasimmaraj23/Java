import java.awt.Color;

public class Tree {
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;
    static Color Trunk_Color = new Color(102,51,0);
    static Color TRUNK_COLOR = Trunk_Color;

    Tree(double heightFt,
         double trunkDiameterInches,
         TreeType treeType){
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    void grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches +1;
    }

    static void announceTree(){
        System.out.println("Look out for that "+ TRUNK_COLOR  + " tree!");
    }

    void announceTallTree(){
        if(this.heightFt > 100){
            System.out.println("That's a tall "+this.treeType+ " tree!");
        }
    }
}
