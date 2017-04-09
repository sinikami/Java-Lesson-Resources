package study.Account;

import study.Account.Account;

/**
 * Created by ikocos on 04/02/2017.
 */
public class CreditLineAccount extends Account {

    private int creditLine;
    private double bonusPoint;

    public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
        super(accountNo, ownerName, balance);
        this.creditLine = creditLine;

    }

    public int withdraw(int amount) throws Exception {
        if (balance + creditLine < amount) {
            throw new Exception("인출이 불가능합니다.");
        }
        balance -= amount;
        return amount;
    }

    public void deposit(int amount) {
        super.deposit(amount);
        this.bonusPoint += amount * 0.9;
    }

    public double getBonusPoint() {
        return this.bonusPoint;
    }

    public int getCreditLine() {
        return this.creditLine;
    }
}
