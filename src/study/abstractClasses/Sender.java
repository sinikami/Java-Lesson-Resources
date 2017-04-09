package study.abstractClasses;

/**
 * Created by ikocos on 04/02/2017.
 */
abstract public class Sender {

    public String sender;
    public String title;

    public Sender(String title, String sender) {

        this.sender=sender;
        this.title=title;
    }

    public   abstract   void sendMessage(String recipient);
}
