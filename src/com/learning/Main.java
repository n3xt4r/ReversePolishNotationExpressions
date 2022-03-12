package com.learning;

public class Main {

    public static void main(String[] args) {
        // String Input
        String[] s = {"2", "1", "+", "3", "*"};
        ReversePolishNotationExpression str = new ReversePolishNotationExpression();
        int result = str.myStack(s);
        System.out.println(result);

    }
}