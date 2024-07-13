package org.example;

import javax.swing.*;

public class InvoiceStore {
    public static void main(String[] args) {
        String[] products = {"Shirt", "Pants", "Shoes", "Bag", "Socks"};
        double[] price = {45.000, 55.000, 70.000, 20.000, 15.000};

        int[] quantity = new int[products.length];

        for(int i = 0; i < products.length; i++){
            int quantityTotal = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity of " + products[i] + ": "));
            quantity[i] = quantityTotal;
        }

        double totalBuy = 0.0;
        for(int i = 0; i < products.length; i++){
            double totalProduct = quantity[i] * price[i];
            totalBuy += totalProduct;

            JOptionPane.showMessageDialog(null,products[i] + ": " + quantity[1] + " units - $" + price[i] + " Total: " + totalProduct);
        }

        JOptionPane.showMessageDialog(null, "Shopping total: $" + totalBuy);
    }
}
