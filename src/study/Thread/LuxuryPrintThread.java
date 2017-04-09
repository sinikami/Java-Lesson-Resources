package study.Thread;

import study.tools.print;

/**
 * Created by ikocos on 01/04/2017.
 */
public class LuxuryPrintThread extends Thread {
    public SharedArea sharedArea;

    public LuxuryPrintThread(SharedArea sharedArea) {
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
        print.f("*** 파이 = %s *** %n",sharedArea.result );


    }
}

