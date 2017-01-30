package study;

/**
 * Created by ikocos on 21/01/2017.
 */
public class Account {
    String accountNo;
    String ownerNanme;
    int balance;
    Account(String accountNo,String ownerNanme,int balance){
        this.accountNo=accountNo;
        this.ownerNanme= ownerNanme;
        this.balance = balance;
    }

    void deposit(int amount){
        this.balance +=amount;
    }
    int withdraw(int amount) throws Exception{
        if(this.balance<amount)
            throw new Exception("잔액이 부족합니다.");
            //return  0;
        this.balance-=amount;

        return amount;

    }
}
