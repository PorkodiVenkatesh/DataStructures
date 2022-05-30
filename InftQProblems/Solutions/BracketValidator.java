package Problems.Solutions;

import java.util.*;

public class BracketValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        int position = 0;
        String input = sc.next();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch == '[') || (ch == '{') || (ch == '(')) {
                stack.push(ch);
            }
            if (ch == ']') {
                if (stack.peek() != '[') {
                    position = i + 1;
                    break;
                } else
                    stack.pop();
            }
            if (ch == '}') {
                if (stack.peek() != '{') {
                    position = i + 1;
                    break;
                } else
                    stack.pop();
            }
            if (ch == ')') {
                if (stack.peek() != '(') {
                    position = i + 1;
                    break;
                } else
                    stack.pop();
            }
        }
        System.out.println(position);

    }
}
