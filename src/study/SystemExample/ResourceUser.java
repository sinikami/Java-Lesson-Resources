package study.SystemExample;

/**
 * Created by ikocos on 11/03/2017.
 */
public class ResourceUser {
    ResourceUser() {
        System.out.println("It's ready.");
    }

    void use() {

        System.out.println("It's  used.");
    }

    public void finalize() {
        System.out.println("It's  destroyed");
    }
}
