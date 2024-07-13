package org.example;

import javax.swing.*;

public class CalculateDiscounts {
    public static void main(String[] args) {
        double totalAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter shopping total"));

        double discount = 0.0;
        if(totalAmount >= 1000){
            discount = 0.25;
        } else if (totalAmount >= 500) {
            discount = 0.20;
        } else if (totalAmount >= 200) {
            discount = 0.10;
        }else {
            discount = 0.0;
        }

        double discountAmount = totalAmount * discount;
        double finalAmount = totalAmount - discountAmount;

        JOptionPane.showMessageDialog(null,"Total Amount: $"+totalAmount+"\n" +
                "Discount: "+(int)(discount * 100) + "%\n" +
                "Amount discount: $"+discountAmount+"\n"+
                "Final amount: $"+finalAmount);
    }
}
