package study.Thread;

/**
 * Created by ikocos on 01/04/2017.
 */
public class CalcThread extends Thread {
    public SharedArea sharedArea;

    public CalcThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    @Override
    public void run() {
        //super.run();
        double total = 0.0;
        for (int cnt = 1; cnt < 1000000000; cnt += 2) {
            if (cnt / 2 % 2 == 0) {
                total += 1.0 / cnt;
            } else {
                total -= 1.0 / cnt;
            }
        }
        sharedArea.result = total * 4;
        sharedArea.isReady=true;
        synchronized (sharedArea){
            sharedArea.notifyAll();
        }
    }
}
