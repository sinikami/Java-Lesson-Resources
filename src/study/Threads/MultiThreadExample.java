package study.Threads;

import study.Account.Account;
import study.Thread.*;
import study.tools.print;

/**
 * Created by ikocos on 01/04/2017.
 */
public class MultiThreadExample {
    public static void main(String[] args) {
        SharedArea sharedArea = new SharedArea();

        sharedArea.account1 = new Account("111-111-111", "이몽룡", 200000000);
        sharedArea.account2 = new Account("222-222-222", "성춘향", 100000000);
        TransferThread transferThread = new TransferThread(sharedArea);
        CalcThread calcThread = new CalcThread(sharedArea);

        PrintThread printThread = new PrintThread(sharedArea, new PrintThread.TODO() {
            @Override
            public void printCalc() {
                if (sharedArea.isReady != true) {
                    synchronized (sharedArea) {
                        try {
                            sharedArea.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                print.r(sharedArea.result);
            }


            @Override
            public void printTransfer() {
               /* for (int cnt = 0; cnt < 3; cnt++) {
                    int sum = sharedArea.getTotal();
                    print.r("게좌 잔액 합계" + sum);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }*/
            }
        });
        MonitorThread monitorThread = new MonitorThread(printThread,sharedArea);
        SimplePrintThread simplePrintThread = new SimplePrintThread(sharedArea);
        LuxuryPrintThread luxuryPrintThread = new LuxuryPrintThread(sharedArea);
        //calcThread.sharedArea = sharedArea;


        //transferThread.start();
        printThread.start();
        //simplePrintThread.start();
        //luxuryPrintThread.start();
        calcThread.start();
        monitorThread.start();
        synchronized (sharedArea) {
            if (sharedArea.isDone != true) {
                try {
                    sharedArea.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
