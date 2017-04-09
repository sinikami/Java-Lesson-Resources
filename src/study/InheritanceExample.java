package study;

import study.Account.*;
import study.CDInfo.*;
import study.SendMessage.*;
import study.abstractClasses.*;

/**
 * Created by ikocos on 04/02/2017.
 */
public class InheritanceExample {

    public static void main(String[] args) {
       /* CheckingAccount obj = new CheckingAccount("111111","qweqweqwe",0,"43545345345");
        obj.deposit(1000);
        try{
            int paidAccount = obj.pay("43545345345",200);
            System.out.println(paidAccount);
            System.out.println(obj.balance);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/
  /*      CreditLineAccount creditLineAccount = new CreditLineAccount("11111111","qweqwe",10000,200000);
        try{
            creditLineAccount.deposit(10000);
            int amount = creditLineAccount.withdraw(20000);

            System.out.println("withdraw: "+amount);
            System.out.println("creditLine: "+creditLineAccount.getCreditLine());
            System.out.println("balance: "+creditLineAccount.balance);

            System.out.println("bonusPoint: "+creditLineAccount.getBonusPoint());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/
       /* EmailSender emailSender =new EmailSender("생일축하","엘제이","google@gmail.com","wwwwwww" );
        SMSSender smsSender =new SMSSender("생일축하" ,"엘제이","010-4138-3210","우하하핳");
        emailSender.sendMessage("sb@gmail.com");
        smsSender.sendMessage("010-3816-3210");*/
        Account account = new Account("3232323", "dfgdfgdfg", 5000);
        CheckingAccount checkingAccount = new CheckingAccount("111111", "qweqweqwe", 0, "43545345345");
        CreditLineAccount creditLineAccount = new CreditLineAccount("22222", "asdasdasdasd", 10000, 200000);

        print(account);
        print(checkingAccount);
        print(creditLineAccount);

        EmailSender emailSender = new EmailSender("생일축하", "엘제이", "google@gmail.com", "wwwwwww");
        SMSSender smsSender = new SMSSender("생일축하", "엘제이", "010-4138-3210", "우하하핳");

        send(emailSender, "sb@gmail.com");
        send(smsSender, "010-3861-3210");


        Lendable arr[] = new Lendable[3];


        SeparateVolume separateVolume = new SeparateVolume("222202220222", "hahaha", "sinikami");
        AppCDInfo appCDInfo = new AppCDInfo("111100111100", "kkkkkkk");


        //separateVolume.checkOut("zkal","2017-01-10");

        //separateVolume.checkOut("zkal","2017-01-12");
        //separateVolume.checkIn();


        //appCDInfo.checkOut("zkal","2017-08-21");

        separateVolume.checkIn();
        arr[0] = separateVolume;//참조값을 넣는다.
        arr[1] = appCDInfo;

        printState(separateVolume);
        printInfo(arr, "SiniKami", "2017-02-04");

    }

    static void print(Account obj) {
        System.out.println("==================");
        System.out.println("계좌번호: " + obj.accountNo);
        System.out.println("예금주 : " + obj.ownerNanme);
        System.out.println("잔액 : " + obj.balance);
    }

    static void send(Sender obj, String recipient) {
        obj.sendMessage(recipient);
    }

    static void printInfo(Lendable lendble[], String borrower, String date) {
        for (Lendable lend : lendble) {
            if (lend == null) continue;
            try{

                lend.checkOut(borrower, date);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    static void printState(SeparateVolume obj) {
        System.out.println("==================");
        if (obj.state == Lendable.STATE_BORROWED) {
            System.out.println("대출상태 : 대출중");
        } else if (obj.state == Lendable.STATE_NOMAL) {
            System.out.println("대출상태 :가능 ");
        }

    }

}
