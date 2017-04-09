package study.Threads;

import study.tools.print;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.ArrayList;


/**
 * Created by ikocos on 25/03/2017.
 */
public class ThreadExample {

    public static Thread event;

    public static void main(String[] args) {
        Thread thread1 = new DigitThread();
        Thread thread2 = new DigitThread();
        Thread thread3 = new AlphabetThread();
        EventTest eventTest = new EventTest();
        event = new Thread(eventTest);
        thread1.start();
        thread2.start();
        thread3.start();
        event.start();
        eventTest.setState(1);
        eventTest.setState(2);
        eventTest.setState(3);
        eventTest.setState(4);

    }

}

class AlphabetThread extends Thread {
    public void run() {
        for (char ch = 'A'; ch < 'Z'; ch++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            print.f("%s%n", this.getClass().getName() + " " + ch);
        }
    }
}

class DigitThread extends Thread {
    public void run() {
        for (int cnt = 0; cnt < 26; cnt++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            print.f("%s%n", this.getClass().getName() + " " + cnt);

        }
    }

}

class EventTest implements Runnable, ChangeListener {
    ArrayList<Integer> state = new ArrayList<Integer>();

    public void setState(int state) {
        this.state.add(state);
    }

    public void run() {
        ChangeEvent evt = new ChangeEvent(state);
        this.stateChanged(evt);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        for (int i : state) {
            print.r(i);
        }
    }
}