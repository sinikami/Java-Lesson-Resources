package study.Socket;

import study.tools.print;

import javax.swing.*;
import java.io.*;
import java.net.Socket;

/**
 * Created by ikocos on 08/04/2017.
 */
public class SocketLib {
    Socket socket = null;
    JTextField jTextField;
    public Runnable getMessage = () -> {
        BufferedReader bufferedReader = null;
        InputStream inputStream = null;
        try {
            inputStream = getSocket().getInputStream();

            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            print.r("getMessage");
            for (; ; ) {
                String msg = bufferedReader.readLine();
                if (msg.equals("bye")) break;
                System.out.println(msg);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    };
    public void sendMessage(){
        PrintWriter printWriter = null;

        try {
            OutputStream outputStream = socket.getOutputStream();
            printWriter = new PrintWriter(outputStream);
            printWriter.println(jTextField.getText());
            printWriter.flush();
            System.out.println(jTextField.getText());
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }

    public SocketLib(JTextField jTextField) {
        this.jTextField = jTextField;
    }
}
