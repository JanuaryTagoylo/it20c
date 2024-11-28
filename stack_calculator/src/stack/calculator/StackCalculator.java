package stack.calculator;

import java.util.Scanner;

public class StackCalculator {

    public static void main(String[] args) {
        try {
            UI uiCal = new UI();
            uiCal.init();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class UI {

    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator! Enter 'exit' to quit.");

        while (true) {
            System.out.print("Enter expression (e.g., '3 + 4'): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                double result = evaluate(input);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Thank you for using the calculator!");
    }

    private double evaluate(String expression) {
        String[] tokens = expression.split(" ");
        if (tokens.length != 3) {
            throw new IllegalArgumentException("Invalid expression. Format: <number1> <operator> <number2>");
        }

        double num1 = Double.parseDouble(tokens[0]);
        String operator = tokens[1];
        double num2 = Double.parseDouble(tokens[2]);

        return calculate(num1, num2, operator);
    }

    private double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
            case "x":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}


    
    

