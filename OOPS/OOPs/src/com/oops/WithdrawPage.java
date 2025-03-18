package com.oops;

import javax.swing.*;

public class WithdrawPage extends JFrame {
    public WithdrawPage() {
        setTitle("Withdraw Money");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null); // Explicitly setting layout

        JLabel label = new JLabel("Withdraw Amount:");
        label.setBounds(50, 50, 150, 30);
        add(label);

        JTextField amountField = new JTextField();
        amountField.setBounds(180, 50, 150, 30);
        add(amountField);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(130, 100, 120, 40);
        add(withdrawButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new WithdrawPage();
    }
}
