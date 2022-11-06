public class Main1 {
    public static void main(String[] args) {
        Traingle traingleA = new Traingle(12.5,10.5,8,9,10);
        Traingle traingleB = new Traingle(7.5,8.5,9,12,12);

        double triangleAArea = traingleA.findArea();
        System.out.println(triangleAArea);
        double triangleBArea = traingleB.findArea();
        System.out.println(triangleBArea);

        System.out.println(Traingle.numOfSides);

    }
}
