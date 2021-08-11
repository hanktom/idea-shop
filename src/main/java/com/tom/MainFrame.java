package com.tom;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    JPanel panel = new JPanel();
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");
    public MainFrame() {
        setSize(600, 400);
        setLocation(200, 200);
        panel.add(ok);
        panel.add(cancel);
        add(panel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello?");
            }
        });
        cancel.addActionListener(new ByeActionListener());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
    }
}
