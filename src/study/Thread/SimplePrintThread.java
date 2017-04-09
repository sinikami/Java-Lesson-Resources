package study.Thread;

import study.tools.print;

/**
 * Created by ikocos on 01/04/2017.
 */
public class SimplePrintThread extends Thread {
    public SharedArea sharedArea;

    public SimplePrintThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    @Override

    public void run() {


        if(sharedArea.isReady!=true){
            synchronized (sharedArea){
                try {
                    sharedArea.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        print.f("%.2f %n",sharedArea.result);


    }
}

