package org.example;

import org.example.callFrame.callFrame;

import javax.swing.*;

public class Main2_0 {public static void main(String[] args) {
    callFrame c =new callFrame();
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            c.createGUIBP();
        }
    });
}



}
