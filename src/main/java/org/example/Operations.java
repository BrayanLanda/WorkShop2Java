package org.example;

import javax.swing.*;

public class Operations {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
            int option = JOptionPane.showOptionDialog(null,
                    "What operation do you wish to perform?",
                    "Operations Menu",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Sum", "Subtract", "Multiply", "Divide"}, "Sum");
            if(option != JOptionPane.CANCEL_OPTION){
                double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
                double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number"));

                double result = OperationsMath(num1, num2, option);

                JOptionPane.showMessageDialog(null,"The result of the operation is: " + result);

                int answerContinue = JOptionPane.showConfirmDialog(null, "Do you want to perform another operations ?");
                if(answerContinue != JOptionPane.YES_OPTION){
                    flag = false;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Thank you for you visit");
    }

    public static double OperationsMath(Double num1, Double num2, int option){
        switch (option){
            case 0:
                return num1 + num2;
            case 1:
                return num1 - num2;
            case 2:
                return  num1 * num2;
            case 3:
                if(num2 == 0){
                    JOptionPane.showMessageDialog(null, "Error: you cannot divide by 0");
                    return 0;
                }else {
                    return num1 / num2;
                }
            default:
                return 0;
        }
    }
}

