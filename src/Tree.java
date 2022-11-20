import java.awt.Color;

public class Tree {
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;
    protected static Color Trunk_Color = new Color(102,51,0);
    protected static Color TRUNK_COLOR = Trunk_Color;

    public Tree(double heightFt,
         double trunkDiameterInches,
         TreeType treeType){
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    public double getHeightFt(){
        return this.heightFt;
    }

    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches){
       this.trunkDiameterInches = trunkDiameterInches;
    }
    public TreeType getTreeType() {
        return treeType;
    }

    public void grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches +1;
    }

    public static void announceTree(){
        System.out.println("Look out for that "+ TRUNK_COLOR  + " tree!"
        );
    }

    public void announceTallTree(){
        if(this.heightFt > 100){
            System.out.println("That's a tall "+this.treeType+ " tree!");
        }
    }
}
