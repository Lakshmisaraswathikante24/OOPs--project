package com.oops;

import java.util.ArrayList;

public class Bank {
	private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void showAllAccounts() {
        for (BankAccount account : accounts) {
            account.displayBalance();
        }
    }
}
