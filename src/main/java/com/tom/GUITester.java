package com.tom;

import javax.swing.*;
import java.awt.*;

public class GUITester {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setSize(600, 400);
        frame.setLocation(200,200);
        JButton button = new JButton("OK lalalalala");
        JButton cancel = new JButton("Cancel");
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(cancel);
        frame.add(panel);
        frame.setVisible(true);
    }
}
