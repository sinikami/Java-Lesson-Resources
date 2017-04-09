package study.Thread;

import study.tools.print;

/**
 * Created by ikocos on 01/04/2017.
 */
public class PrintThread extends Thread {
    public SharedArea sharedArea;
    TODO todo = null;
    public PrintThread(SharedArea sharedArea,TODO todo) {
        this.sharedArea = sharedArea;
        this.todo= todo;
    }
    public interface TODO{
        void printCalc();
        void printTransfer();
    }
    @Override

    public void run() {


        /*if(sharedArea.isReady!=true){
            synchronized (sharedArea){
                try {
                    sharedArea.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        print.r(sharedArea.result);*/

        this.todo.printCalc();
        this.todo.printTransfer();

    }

    public SharedArea getSharedArea() {
        return sharedArea;
    }
}

