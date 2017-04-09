package study.Socket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ikocos on 08/04/2017.
 */
public class Server {
    public static void main(String args[]) {

        JFrame jFrame = new JFrame("server");
        jFrame.setLocation(200, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setPreferredSize(new Dimension(300, 300));


        Container container = jFrame.getContentPane();
        //container.setLayout(new FlowLayout());

        JLabel jLabel = new JLabel();
        JTextField jTextField = new JTextField(10);
        jTextField.setText("hello,client!");
        JButton jButton = new JButton("Send");

        JPanel jPanel = new JPanel();
        jPanel.add(jTextField);
        jPanel.add(jButton);
        container.add(jLabel, BorderLayout.CENTER);
        container.add(jPanel, BorderLayout.SOUTH);
        jFrame.pack();
        jFrame.setVisible(true);
        SerSocket serSocket = new SerSocket(jTextField);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                serSocket.sendMessage();
            }
        });
        jFrame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

                new Thread(serSocket.getMessage).start();

            }

            @Override
            public void windowClosing(WindowEvent e) {
                serSocket.close();
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.print("open");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

    }
}

class SerSocket extends SocketLib {
    ServerSocket serverSocket = null;


    public SerSocket(JTextField jTextField) {
        super(jTextField);
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(9000);
            System.out.println("server is running");
            //for (;;){
            socket = serverSocket.accept();
            System.out.println("server is running");
            // Thread thread = new PerClientThread(socket);
            // thread.start();
            //}


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // this.close();
        }
        setSocket(socket);

    }


    public void close() {
        try {
            socket.close();
            serverSocket.close();
        } catch (Exception e) {

        }
    }
}
