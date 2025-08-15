package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        try {
            var scanner = new Scanner(System.in);

            System.out.print("first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Operator (+, - , *, / , ^ ): ");
            char operator = scanner.next().charAt(0);

            System.out.print("second number: ");
            double num2 = scanner.nextDouble();
            scanner.close();
            double result = calculate(num1,operator,num2);
            System.out.println(result);
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Your input is not right");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


        

    }

    public  static double calculate(double num1, char operator, double num2) throws  Exception {

        double result = 0;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new Exception("Cannot divide by zero");
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                throw new Exception("Undefined Operator");
            }


        }

        return  result;
    }
}