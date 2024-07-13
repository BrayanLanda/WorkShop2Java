package org.example;

import javax.swing.*;

public class TransposedMatrix {
    public static void main(String[] args) {
        int rows = Integer.parseInt(JOptionPane.showInputDialog("Enter number of rows in the matrix"));
        int colunms = Integer.parseInt(JOptionPane.showInputDialog("Enter number of columns in the matrix"));

        int[][] matrix = new int[rows][colunms];
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < colunms; j++){
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter value of the item [" +i+"]["+j+"]:"));
            }
        }

        int[][] transpose = new int[colunms][rows];
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < colunms; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        StringBuilder result = new StringBuilder();
        result.append("Transpose Matrix:\n");
        for (int i = 0; i < colunms; i++){
            for(int j = 0; j < rows; j++){
                result.append(transpose[i][j]).append(" ");
            }
            result.append("\n");
        }
        JOptionPane.showMessageDialog(null,result.toString());
    }
}
