package org.example;

import javax.swing.*;

public class InverseArray {
    public static void main(String[] args) {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter array size"));

        int[] matrix = new int[size];
        for(int i = 0; i < size; i++){
            matrix[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of the position"));
        }

        StringBuilder originalMatrix = new StringBuilder("Original array: ");
        for(int i = 0; i < size; i++){
            originalMatrix.append(matrix[i]).append(" ");
        }
        JOptionPane.showMessageDialog(null,originalMatrix.toString());

        for(int i = 0; i < size; i++){
            int temp = matrix[i];
            matrix[i] = matrix[size -1 - i];
            matrix[size - 1 - i] = temp;
        }

        StringBuilder inverseMatrix = new StringBuilder("Inverse array: ");
        for(int i = 0; i < size; i++){
            inverseMatrix.append(matrix[i]).append(" ");
        }
        JOptionPane.showMessageDialog(null, inverseMatrix.toString());
    }
}
