package com.tom;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ByeActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Bye!");
    }
}
