package study.SendMessage;

import study.abstractClasses.Sender;

/**
 * Created by ikocos on 04/02/2017.
 */
public class EmailSender extends Sender {
    String senderAddress;
    String emailBody;
   public EmailSender (String title ,String sender ,String senderAddress,String emailBody){
        super(title,sender);
        this.senderAddress=senderAddress;
        this.emailBody=emailBody;

    }
   public void sendMessage(String recipient){
        System.out.println("===============");
        System.out.println("제목 :" + this.title);
        System.out.println("보내는 사람:" + this.senderAddress);
        System.out.println("받는 사람:" + recipient);
        System.out.println("내용 :" + this.emailBody);
    }
}
