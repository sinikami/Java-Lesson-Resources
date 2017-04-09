package study.SendMessage;

import study.abstractClasses.Sender;

/**
 * Created by ikocos on 04/02/2017.
 */
public class SMSSender extends Sender {
    String PhoneNumber;
    String message;
   public SMSSender(String title , String sender , String PhoneNumber, String message){
        super(title,sender);
        this.PhoneNumber=PhoneNumber;
        this.message=message;

    }
    public void sendMessage(String recipient){
        System.out.println("===============");
        System.out.println("제목 :" + this.title);
        System.out.println("보내는 사람:" + this.sender);
        System.out.println("받는 사람:" + recipient);
        System.out.println("회신 번호:" + this.PhoneNumber);
        System.out.println("내용 :" + this.message);
    }
}
