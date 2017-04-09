package study.Account;

import study.Account.Account;

/**
 * Created by ikocos on 04/02/2017.
 */
public class CheckingAccount extends Account {

    public String cardNo;

    /*    CheckingAccount(String accountNo,String ownerName){
            this.accountNo = accountNo;
            this.ownerNanme = ownerName;
            this.balance = balance;
        }*/
    public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
        super(accountNo, ownerName, balance);
        /*this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;*/
        this.cardNo = cardNo;
    }

    public int pay(String cardNo, int amount) throws Exception {
        if (!cardNo.equals(this.cardNo) || balance < amount)
            throw new Exception("지불불가.");

        return withdraw(amount);
    }

}
