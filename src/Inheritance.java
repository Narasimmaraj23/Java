import java.util.Stack;

public class Inheritance {

    public static void main(String[] args){

        Stack<Character> charStack = new Stack<>();

        charStack.push('c');
        charStack.push('a');
        charStack.push('t');

        System.out.println(charStack.pop());
        System.out.println(charStack.pop());
        System.out.println(charStack.pop());
    }
}
