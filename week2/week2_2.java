package week2;

import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            stack1.push(s.charAt(i));
        }
        while (!stack1.isEmpty()) {
            char top = stack1.pop();
            if (top != '*') {
                stack2.push(top);
            } else if (!stack2.isEmpty()) {
                stack2.pop();
            }
        }
        
        int length = stack2.size();
        char[] answer = new char[length];
          
        for (int j = length - 1; j >= 0; j--) { 
            answer[j] = stack2.pop();
        }

        return new String(answer); 
    }
}
