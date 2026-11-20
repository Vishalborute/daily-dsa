// Problem: 20. Valid Parentheses
// Link: https://leetcode.com/problems/valid-parentheses/
// Time Complexity: O(n) | Space Complexity: O(n)

import java.util.ArrayDeque;
import java.util.Deque;

class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> openings = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                openings.push(current);
            } else {
                if (current != ')' && current != ']' && current != '}') {
                    return false;
                }
                if (openings.isEmpty()) {
                    return false;
                }

                char opening = openings.pop();
                if ((current == ')' && opening != '(')
                        || (current == ']' && opening != '[')
                        || (current == '}' && opening != '{')) {
                    return false;
                }
            }
        }

        return openings.isEmpty();
    }
}
