package rpncalculator;

import java.util.Scanner;
import pathstack.PathStack;
import pathstack.Stack;

/**
 *
 * @author Peter
 */
public class RPNCalculator {

    private final Stack<Integer> stack = new PathStack<>();

    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println(">");
        while (true) {
            String input = scan.nextLine();

            if (input.equals("quit")) {
                scan.close();
                break;
            } else {
                processInput(input);
                printStack();
            }
        }
    }

    public void processInput(String input) {
        String[] symbols = input.split(" ");

        for (String s : symbols) {
            switch (s) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int subtrahend = stack.pop();
                    stack.push(stack.pop() - subtrahend);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
                    break;

            }
        }

    }

    public void printStack() {
        stack.print();
    }

}
