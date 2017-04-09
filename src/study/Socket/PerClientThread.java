package study.Socket;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by ikocos on 08/04/2017.
 */
public class PerClientThread extends Thread {
    static ArrayList<PrintWriter> list = new ArrayList<>();
    Socket socket;
    PrintWriter printWriter;

    public PerClientThread(Socket socket) {
        this.socket = socket;
        try {
            printWriter = new PrintWriter(socket.getOutputStream());
            list.add(printWriter);
        } catch (Exception e) {
            e.getStackTrace();
        }

    }

    @Override
    public void run() {
        // super.run();

        for (PrintWriter writer : list) {
            writer.println("aaa");
            writer.flush();
        }
    }
}
