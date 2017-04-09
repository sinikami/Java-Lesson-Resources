package study.Thread;

import study.Account.Account;
import study.tools.print;

/**
 * Created by ikocos on 01/04/2017.
 */
public class SharedArea {
    public double result;
    public Account account1;
    public Account account2;
    public boolean isReady;
    public boolean isDone;

    public synchronized int getTotal() {


        return this.account1.balance + this.account2.balance;


    }

    synchronized void transfer(int amount) {

        try {
            this.account1.withdraw(amount);
            print.r("이몽룡 계좌 출금 10000000");
            this.account2.deposit(amount);
            print.r("성춘향 계좌 입금 10000000");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
