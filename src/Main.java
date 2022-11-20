import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(125,5.2,TreeType.OAK);

        myFavoriteOakTree.announceTallTree();

        Tree myFavoriteMapleTree = new Tree(90,30,TreeType.MAPLE);

        myFavoriteMapleTree.announceTallTree();

        System.out.println(Tree.TRUNK_COLOR);
        Tree.announceTree();

        Color myTrunkColor = Tree.TRUNK_COLOR;
        Color myDefaultWhite = Color.WHITE;
        Color myBrighterBlue = Color.BLUE;
        System.out.println(myTrunkColor);
        System.out.println(myDefaultWhite);
        System.out.println(myBrighterBlue);
        System.out.println(myBrighterBlue.brighter());
//        if(myFavoriteOakTree.heightFt > 100){
//            System.out.println("That's a tall "+myFavoriteOakTree.treeType+ " tree!");
//        }
//        if(myFavoriteMapleTree.heightFt > 100){
//            System.out.println("That's a tall "+myFavoriteMapleTree.treeType+" tree!");
//        }

    }
}