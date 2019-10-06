package Others;

import java.util.*;

public class StackPostfixNotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String post = scanner.nextLine();   // Takes input with spaces in between eg. "1 21 +"
        System.out.println(postfixEvaluate(post));
    }

    // Evaluates the given postfix expression string and returns the result.
    public static int postfixEvaluate(String exp) {
        Stack<Integer> s = new Stack<>();
        Scanner tokens = new Scanner(exp);

        while (tokens.hasNext()) {
            if (tokens.hasNextInt()) {
                s.push(tokens.nextInt()); // If int then push to stack
            } else {    // else pop top two values and perform the operation
                int num2 = s.pop();
                int num1 = s.pop();
                String op = tokens.next();

                switch (op) {
                    case "+":
                        s.push(num1 + num2);
                        break;
                    case "-":
                        s.push(num1 - num2);
                        break;
                    case "*":
                        s.push(num1 * num2);
                        break;
                    default:
                        s.push(num1 / num2);
                        break;
                }

                //  "+", "-", "*", "/"
            }
        }
        return s.pop();
    }
}
