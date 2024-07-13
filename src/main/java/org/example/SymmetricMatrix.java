package org.example;

import javax.swing.*;

public class SymmetricMatrix {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter size of the matrix [n x n]"));

        int[][] matrix = new int[number][number];
        for(int i = 0; i < number; i++){
            for (int j = 0; j < number; j++){
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of the position [" +i+"]["+j+"]"));
            }
        }

        boolean isSymmetric = true;
        for (int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                if(matrix[i][j] != matrix[j][i]){
                    isSymmetric = false;
                    break;
                }
            }
            if(!isSymmetric) break;
        }

        if(isSymmetric){
            JOptionPane.showMessageDialog(null,"The matrix is symmetric");
        }else {
            JOptionPane.showMessageDialog(null,"The matrix isn't symmetric");
        }
    }
}
