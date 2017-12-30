package com.external.thread.app;

import com.external.thread.obj.BankAccount;
import com.external.thread.obj.TransactionJob;


/**
 * Here, we will show the problem arised, when a couple
 * Ryan and Monica try to withdraw money concurrently.
 */
public class ConcurrencyIssueDemo{

    public static void main(String[] args) {
        TransactionJob job = new TransactionJob();

        Thread one = new Thread(job);
        Thread two = new Thread(job);

        one.setName("Ryan");
        two.setName("Monica");

        one.start();
        two.start();
    }
}
