package com.example.androidprojectcollection;

import java.util.Stack;

public class Calculator {

    public static double evaluateExpression(String expression) {
        boolean temp = false;
        Stack<Double> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == ' ') {
                continue;
            } else if (Character.isDigit(c)) {
                operands.push((double) (c - '0'));
                if(temp){
                    double operand2 = operands.pop();
                    double operand1 = operands.pop();
                    char operator = operators.pop();
                    double result = applyOperator(operator, operand1, operand2);
                    operands.push(result);
                }
                temp = false;
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                operators.push(c);
                temp = true;
            }
        }

        return operands.pop();
    }

    private static double applyOperator(char operator, double operand1, double operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0)
                    throw new ArithmeticException("Cannot divide by zero");
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
    public static double pemdasEvaluateExpression(String expression) {
            Stack<Double> numbers = new Stack<>();
            Stack<Character> operators = new Stack<>();

            for (char c : expression.toCharArray()) {
                if (c == ' ') {
                    continue;
                } else if (Character.isDigit(c)) {
                    StringBuilder num = new StringBuilder();
                    num.append(c);

                    while (Character.isDigit(expression.charAt(expression.indexOf(c) + num.length()))) {
                        num.append(expression.charAt(expression.indexOf(c) + num.length()));
                    }

                    numbers.push(Double.parseDouble(num.toString()));
                } else if (c == '(') {
                    operators.push(c);
                } else if (c == ')') {
                    while (operators.peek() != '(') {
                        double result = applyOperator(operators.pop(), numbers.pop(), numbers.pop());
                        numbers.push(result);
                    }
                    operators.pop(); // Remove '('
                    if (!operators.isEmpty() && (operators.peek() == '*' || operators.peek() == '/')) {
                        double operand2 = numbers.pop();
                        double operand1 = numbers.pop();
                        char operator = operators.pop();
                        double result = applyOperator(operator, operand1, operand2);
                        numbers.push(result);
                    }
                } else if (c == '+' || c == '-') {
                    while (!operators.isEmpty() && operators.peek() != '(') {
                        double result = applyOperator(operators.pop(), numbers.pop(), numbers.pop());
                        numbers.push(result);
                    }
                    operators.push(c);
                } else if (c == '*' || c == '/') {
                    operators.push(c);
                }
            }

            while (!operators.isEmpty()) {
                double result = applyOperator(operators.pop(), numbers.pop(), numbers.pop());
                numbers.push(result);
            }

            return numbers.pop();
        }
}
