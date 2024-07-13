package org.example;

import javax.swing.*;
import java.util.Locale;

public class SearchWord {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Enter a text");

        String word = JOptionPane.showInputDialog("Enter the word to search");

        String textMin = text.toLowerCase();
        String wordMin = word.toLowerCase();

        StringBuilder result = new StringBuilder();
        int index = textMin.indexOf(wordMin);
        while (index >= 0){
            result.append("Word found in the range of position: ")
                    .append(index)
                    .append(" - ")
                    .append(index + wordMin.length() - 1)
                    .append("\n");
            index = textMin.indexOf(wordMin, index + 1);
        }

        if(result.length() > 0){
            JOptionPane.showMessageDialog(null,result.toString());
        }else {
            JOptionPane.showMessageDialog(null,"Word was not found in the text");
        }
    }
}
