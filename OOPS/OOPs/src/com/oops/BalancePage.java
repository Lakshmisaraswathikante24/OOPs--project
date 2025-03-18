package com.oops;

import javax.swing.*;

public class BalancePage extends JFrame {
    public BalancePage() {
        setTitle("Check Balance");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Balance Page");
        label.setBounds(50, 50, 200, 30);
        add(label);
        setLayout(null);
        setVisible(true);
    }
}
