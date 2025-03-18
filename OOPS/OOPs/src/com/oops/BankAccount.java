package com.oops;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankAccount {
	
	
	    private String accountNumber;
	    private String accountHolder;
	    protected double balance;

	    public BankAccount(String accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        updateBalanceInDB();
	        System.out.println("Deposited: ₹" + amount);
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            updateBalanceInDB();
	            System.out.println("Withdrawn: ₹" + amount);
	        } else {
	            System.out.println("Insufficient funds!");
	        }
	    }

	    private void updateBalanceInDB() {
	        try (Connection conn = DBHelper.getConnection()) {
	            String query = "UPDATE Accounts SET balance = ? WHERE account_number = ?";
	            PreparedStatement stmt = conn.prepareStatement(query);
	            stmt.setDouble(1, balance);
	            stmt.setString(2, accountNumber);
	            stmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void displayBalance() {
	        System.out.println("Account: " + accountNumber + " | Balance: ₹" + balance);
	    }
	}


