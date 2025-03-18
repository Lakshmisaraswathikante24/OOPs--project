package com.oops;

public class CurrentAccount extends BankAccount {
	private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Overdraft Withdrawn: ₹" + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}



