package study.Thread;

import study.tools.print;

/**
 * Created by ikocos on 01/04/2017.
 */
public class MonitorThread extends Thread {
    public Thread thread;
    SharedArea sharedArea;
    public MonitorThread(Thread thread,SharedArea sharedArea) {
        this.thread = thread;
        this.sharedArea = sharedArea;
    }

    @Override

    public void run() {


        while (true) {
            Thread.State state = this.thread.getState();
            print.r("Thread state: " + state);
            if (state == Thread.State.TERMINATED){
                sharedArea.isDone=true;
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}

