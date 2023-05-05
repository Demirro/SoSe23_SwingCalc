/**
 * 
 */
package de.uk.java;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author Théo Bouveyron
 *
 */
public class CalculatorGUI extends JFrame implements ActionListener {

	private String currentInput = "";
    private String currentOperator = "";
    private double firstOperand = 0;
	
	private JTextField display;
    private JPanel buttonPanel;
    
    public CalculatorGUI() {
        setTitle("Swing Calculator");
        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextField(10);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "C", "0", "=", "+"};

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            buttonPanel.add(button);
    }
        add(buttonPanel);
        setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
        String input = source.getText();

        if (input.matches("\\d")) {
            currentInput += input;
            display.setText(currentInput);
        } else if (input.equals("C")) {
            currentInput = "";
            currentOperator = "";
            firstOperand = 0;
            display.setText("");
        } else if (input.equals("=")) {
            double result = CalculatorUtils.performOperation(currentOperator, firstOperand, Double.parseDouble(currentInput));
            display.setText(String.valueOf(result));
            currentInput = "";
            currentOperator = "";
        } else {
            currentOperator = input;
            firstOperand = Double.parseDouble(currentInput);
            currentInput = "";
        }
	}
    
}
