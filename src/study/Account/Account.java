package study.Account;

/**
 * Created by ikocos on 21/01/2017.
 */
public class Account {
    public String accountNo;
    public String ownerNanme;
    public int balance;

   public Account(String accountNo, String ownerName, int balance) {
        this.accountNo = accountNo;
        this.ownerNanme = ownerName;
        this.balance = balance;
    }



   public void deposit(int amount) {
        this.balance += amount;
    }

   public int withdraw(int amount) throws Exception {
        if (this.balance < amount)
            throw new Exception("잔액이 부족합니다.");
        //return  0;
        this.balance -= amount;

        return amount;

    }
}
