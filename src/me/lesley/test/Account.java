package me.lesley.test;

import java.util.ArrayList;

public class Account {
    public String accountName;
    public int balance = 0;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited, and your balance is now " + this.balance);
        }else {
            System.out.println("Cannot deposit negative deposit");
        }
    }

    public void withdraw(int amount) {
        int withdrawal = -amount;
        if (amount < 0) {
            transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(withdrawal + " withdrawn, and the balance now is " + this.balance);
        }else {
            System.out.println("Can not withdrawn negative sums");
        }
    }

    public void calculateBalance() {
        this.balance = 0;
        for (Integer i: this.transactions) {
            this.balance += i;
        }

        System.out.println("Calculated balance is " + this.balance);
    }
}

