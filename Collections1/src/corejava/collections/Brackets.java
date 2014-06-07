package corejava.collections;

import java.util.Stack;

public class Brackets {
    public boolean verifyBrackets(String s) {
        Stack leftBrackets = new Stack();
        Stack rightBrackets = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftBrackets.add('(');
            } else if (s.charAt(i) == ')') {
                rightBrackets.add(')');
            }
            if (rightBrackets.size() > leftBrackets.size()) {
                return false;
            }
        }
        if (leftBrackets.size() != rightBrackets.size()) {
            return false;
        }
        return true;
    }
}
