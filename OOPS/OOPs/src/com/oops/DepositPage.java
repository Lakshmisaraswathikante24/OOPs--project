package com.oops;

import javax.swing.*;

public class DepositPage extends JFrame {
    public DepositPage() {
        setTitle("Deposit Money");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Deposit Page");
        label.setBounds(50, 50, 200, 30);
        add(label);
        setLayout(null);
        setVisible(true);
    }
}
