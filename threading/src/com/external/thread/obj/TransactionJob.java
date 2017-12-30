package com.external.thread.obj;

public class TransactionJob implements Runnable {

    // Account shared b/w the couples.
    private BankAccount account = new BankAccount();


    @Override
    public void run() {
        for (int x = 0; x < 10; x++) {
            makeWithdrawal(10);

            // After the withdrawal, check the balance, overdrawn is a race condition.
            if (account.getBalance() < 0) {
                System.out.println("Overdrawn!");
            }
        }
    }

    // Helper method of run method.
    // One complete transaction.
    // To remove the race condition, we need to make a lock in this method. (Make method atomic)
    // Lock is done using 'synchronized' keyword. (Only one thread can access once)
    private synchronized void makeWithdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is about to withdraw.");
            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep.");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " woke up.");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
        } else {
            System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
        }
    }
}
