package com.oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();

        SavingsAccount savings = new SavingsAccount("SA123", "Alice", 5000, 5);
        CurrentAccount current = new CurrentAccount("CA456", "Bob", 2000, 1000);

        bank.addAccount(savings);
        bank.addAccount(current);

        savings.deposit(1000);
        savings.applyInterest();
        savings.displayBalance();

        current.withdraw(2500);
        current.displayBalance();

        System.out.println("\nAll Bank Accounts:");
        bank.showAllAccounts();
    }

	}


