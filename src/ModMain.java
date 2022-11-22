import java.util.ArrayList;

public class ModMain {

        public static void main(String[] args) {

            ModArrayList listy = new ModArrayList();
            listy.add(0);
            listy.add('a');
            listy.add(20);
            listy.add(30);

            System.out.println(listy.getUsingMod(-1));
            System.out.println(listy.getUsingMod(3));
            System.out.println(listy.getUsingMod(8));
        }



}
