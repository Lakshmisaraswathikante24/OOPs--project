package com.oops;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashBoard {
    JFrame frame;

    public DashBoard() {
        frame = new JFrame("Bank Dashboard");
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel welcomeLabel = new JLabel("Welcome to Bank Management System");
        welcomeLabel.setBounds(100, 50, 300, 30);
        frame.add(welcomeLabel);

        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(50, 100, 120, 40);
        frame.add(depositButton);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(200, 100, 120, 40);
        frame.add(withdrawButton);

        JButton balanceButton = new JButton("Check Balance");
        balanceButton.setBounds(350, 100, 120, 40);
        frame.add(balanceButton);

        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(200, 200, 120, 40);
        frame.add(logoutButton);

        // ✅ Add ActionListeners for the buttons

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the dashboard
                new DepositPage(); // Open Deposit window
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new WithdrawPage(); // Open Withdraw window
            }
        });

        balanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new BalancePage(); // Open Check Balance window
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new LoginForm();
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new DashBoard();
    }
}

