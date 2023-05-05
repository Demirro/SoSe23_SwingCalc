/**
 * 
 */
package de.uk.java;

/**
 * @author Théo Bouveyron
 *
 */
public class CalculatorUtils {

	static double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new UnsupportedOperationException("Invalid operator: " + operator);
        }
    }
}
