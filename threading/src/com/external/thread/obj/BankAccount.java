package com.external.thread.obj;

/**
 * A shared bank account which has initially balance 100.
 *
 * Multi-threading on shared object creates race condition.
 */
public class BankAccount {

    // stores balance in the bank account.
    private int balance = 100;

    // return current available balance.
    public int getBalance() {
        return balance;
    }

    // withdrawal of money from account.
    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
