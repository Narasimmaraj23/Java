import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat){
            System.out.println("Playing current song");
            System.out.println("Would you like to turn of the repeat?.If so type yes");
            String newInput = input.next();

            if(newInput.equals("yes")){
                isOnRepeat = false;
            }
        }
    System.out.println("Repeat is turned off");
    }
}