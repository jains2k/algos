package com.sj.learning.problems.easy;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String s ="(){()}[()]";
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char character: chars) {
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
            } else if (character == ')' || character == ']' || character == '}') {
                Character popChar = stack.pop();
                if ((popChar.charValue() == '(' && character == ')') ||
                        (popChar.charValue() == '{' && character == '}') ||
                        (popChar.charValue() == '[' && character == ']')) {
                    continue;
                } else {
                    System.out.println("Invalid input: " + s);
                    break;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Valid input: " + s);
        } else {
            System.out.println("Invalid input: " + s);
        }

    }
}
