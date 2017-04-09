package study.Thread;

import study.tools.print;

/**
 * Created by ikocos on 01/04/2017.
 */
public class TransferThread extends Thread {
    public SharedArea sharedArea;

    public TransferThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    @Override
    public void run() {
        for (int cnt = 0; cnt < 12; cnt++) {
            sharedArea.transfer(10000000);
        }

    }
}
