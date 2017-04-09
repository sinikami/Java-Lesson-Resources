package study;
import study.Account.Account;
import study.Account.CheckingAccount;

/**
 * Created by ikocos on 11/02/2017.
 */
public class RefTypeExample {
    public static void main(String[] args){
        Label label =new Label("Hi",100,30,"yellow","green","굴림체");
        Label label1 =label;
        printRectangle(label);
        printRectangle(label1);
        label.resize(500,500);
        printRectangle(label);
        printRectangle(label1);

        rearrange(label1);

        printRectangle(label);
        printRectangle(label1);

        Label label2 =null;
/*
        if(label2==null){
            System.out.println("label2는 초기화 되지 않았습니다");
            return;
        }
        printRectangle(label2);*/

        /*Account account=new CheckingAccount("1004","bbbbb",2000,"50000");
        CheckingAccount checkingAccount =(CheckingAccount) account;
        try{
           int amount= checkingAccount.pay("50000",300);
           System.out.println("홍길동 : "+ amount);
           System.out.println("카드번호 : "+checkingAccount.cardNo);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        */

        Account account = new Account("1004","tim",5000);
       // CheckingAccount checkingAccount = (CheckingAccount)account;
         if(account instanceof CheckingAccount){
             pay((CheckingAccount) account);
         }else{
             System.out.println("케스트 할 수 없는 타입입니다.");
         }

    }
    static  void pay(CheckingAccount obj){
        try{
            int amount= obj.pay("50000",300);
            System.out.println("홍길동 : "+ amount);
            System.out.println("카드번호 : "+obj.cardNo);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static  void printRectangle(Label obj){
        System.out.printf("%s: 크기 (%d X %d) background: %s , foreground: %s, font: %s %n",obj.text,obj.width,obj.height,obj.background,obj.foreground,obj.font);
    }
    static void rearrange(Label label){
        label.background="red";
        label.resize(1000,20);
    }
}
