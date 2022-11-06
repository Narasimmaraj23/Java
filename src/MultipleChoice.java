
import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {

        String question = "What is the capital of India";
        String opt1 = "delhi";
        String opt2 = "chennai";
        String opt3 = "pune";
        Boolean correct = true;

        String correctOpt = opt1;

        while (correct) {
            System.out.println(question);
            System.out.println(opt1 + "\n" + opt2 + "\n" + opt3);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Your Answer:");
            String opt = scanner.next();

            if (correctOpt.equals(opt.toLowerCase())) {
                System.out.println("Correct Answer");
                correct = false;
            } else {
                System.out.println("Wrong Answer");
                System.out.println("Wanna try Again? If so type yes");
                String input = scanner.next();
                if(input.equals("yes")){
                    correct = true;
                }
                else{
                    System.out.println("Sorry You answer is Wrong");
                    System.out.println("The correct answer is " + correctOpt);
                    correct = false;
                }
            }
        }
    }
}
