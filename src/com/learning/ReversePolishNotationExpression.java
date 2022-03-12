package com.learning;

import java.util.*;

public class ReversePolishNotationExpression {
    public int myStack(String[] tokens) {
        // Initialize the stack and the variable
        Stack<String> stack = new Stack<String>();
        int x, y;
        String result = "";
        int get = 0;
        String choice;
        int value = 0;
        String p = "";

        // Iterating through each character
        // in the array of the string

        for (int i = 0; i < tokens.length; i++) {
            // if the character is not special character
            // ('+', '-', '*','/')
            // then push the character to stack
            if (tokens[i] != "+" && tokens[i] != "-"
                    && tokens[i] != "*" && tokens[i] != "/"
            ) {
                stack.push(tokens[i]);
                continue;
            } else {
                // else if the character is special
                // character then use the switch method to
                // perform the action
                choice = tokens[i];
            }
            // Switch-case
            switch (choice) {
                case "+":
                    // Performing the "+" operation by popping
                    // put first two character
                    // and then again store back to the stack
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x + y;
                    result = p + value;
                    stack.push(result);
                    break;

                case "-":
                    // Performing the "-" operation by popping
                    // put the first two character
                    // and then again store back to the stack
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = y - x;
                    result = p + value;
                    stack.push(result);
                    break;

                case "*":
                    // Performing the "*" operation by popping
                    // put the first two character
                    // and then again store back to the stack
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x * y;
                    result = p + value;
                    stack.push(result);
                    break;

                case "/":
                    // Performing the "/" operation by popping
                    // put the first two character
                    // and then again store back to the stack
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = y / x;
                    result = p + value;
                    stack.push(result);
                    break;
                default:
                    continue;
            }
        }
        String finalResultStr=stack.toString().replaceAll("[^\\d.]", "");
        int finalResult = Integer.parseInt(finalResultStr);
        return finalResult;
    }

}