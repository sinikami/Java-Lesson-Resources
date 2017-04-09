package study.PrintWriter;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by ikocos on 04/03/2017.
 */
public class PrintWriterExample {

    public static void main(String[] args) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("./src/output.txt");

            printWriter.println("====== 성적표 =========");
            printWriter.printf("%3s : %3d %3d %3d %5.1f %n", "aaa", 22, 11, 22, 2.1f);
            printWriter.printf("%3s : %3d %3d %3d %5.1f %n", "bbb", 33, 22, 22, 2.1f);
            printWriter.printf("%3s : %3d %3d %3d %5.1f %n", "ccc", 44, 33, 22, 2.1f);
            printWriter.printf("작성일짜: %1$td - %1$tm - %1$tY ", new GregorianCalendar());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                printWriter.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("====== 성적표 =========");
        System.out.printf("%3s : %3d %3d %3d %5.1f %n", "aaa", 22, 11, 22, 2.1f);
        System.out.printf("%3s : %3d %3d %3d %5.1f %n", "bbb", 33, 22, 22, 2.1f);
        System.out.printf("%3s : %3d %3d %3d %5.1f %n", "ccc", 44, 33, 22, 2.1f);
        System.out.printf("작성일짜: %1$td - %1$tm - %1$tY ", new GregorianCalendar());
        Scanner scanner = new Scanner(System.in);
        int i = 0;
   /*     while(i<3){
            System.out.println("0 ~ 9 사이의 숫자를 선택하세요.");
            scanner.nextInt();
            i++;
        }*/


        try {
            // Pipe pipe = Pipe.open();
            BufferedReader byteBuffer = new BufferedReader(new FileReader("./src/output.txt"));

            // pipe.sink().write(ByteBuffer.wrap(byteBuffer.readLine().getBytes()));
            //Byte[] bytes = new Byte[];
            // pipe.source().read(bytes);
            //  System.out.println(bytes);

        } catch (IOException e) {
            e.printStackTrace();
        }
        EventTest eventTest = new EventTest();
        Thread t = new Thread(eventTest);
        t.start();

        eventTest.setState(2);
        eventTest.setState(2);
    }


}

class EventTest implements Runnable {
    ArrayList<Integer> state = new ArrayList<Integer>();

    public void setState(int state) {
        this.state.add(state);
    }

    public void run() {
        ChangeEvent evt = new ChangeEvent(state);
        ChangeListener listener = e -> System.out.println(this.state.size());
        listener.stateChanged(evt);
    }
}