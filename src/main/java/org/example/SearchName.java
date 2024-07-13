package org.example;

import javax.swing.*;

public class SearchName {
    public static void main(String[] args) {
        String[] names = {"brayan", "juan", "carolina", "ezequiel", "andrea", "ela"};

        String searchName = JOptionPane.showInputDialog("Seach the name");
        int position = -1;
        for(int i = 0; i < names.length; i++){
            if(names[i].equalsIgnoreCase(searchName)){
                position = i;
                break;
            }
        }

        if(position >= 0){
            JOptionPane.showMessageDialog(null, "Name " + searchName + " is in the position: " + position);
        }else {
            JOptionPane.showMessageDialog(null, "Name " + searchName + " isn't in the array");
        }
    }
}
