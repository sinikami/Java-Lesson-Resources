package study.Socket;

import study.Thread.PrintThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.net.Socket;

/**
 * Created by ikocos on 08/04/2017.
 */
public class Client {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("client");
        jFrame.setLocation(300, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setPreferredSize(new Dimension(300, 300));


        Container container = jFrame.getContentPane();
        //container.setLayout(new FlowLayout());

        JLabel jLabel = new JLabel();
        JTextField jTextField = new JTextField(10);
        jTextField.setText("hello,server!");
        JButton jButton = new JButton("Send");

        JPanel jPanel = new JPanel();
        jPanel.add(jTextField);
        jPanel.add(jButton);
        container.add(jLabel, BorderLayout.CENTER);
        container.add(jPanel, BorderLayout.SOUTH);

        jFrame.pack();
        jFrame.setVisible(true);
        ClientSocket clientSocket = new ClientSocket(jTextField);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clientSocket.sendMessage();
            }
        });
        jFrame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

                new Thread(clientSocket.getMessage).start();
            }

            @Override
            public void windowClosing(WindowEvent e) {
                clientSocket.close();
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

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });


    }


}

class ClientSocket extends SocketLib {

    public ClientSocket(JTextField jTextField) {
        super(jTextField);
        Socket socket=null;
        try {
            socket = new Socket("192.168.20.7", 9000);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //  this.close();
        }
        setSocket(socket);

    }



    public void close() {
        try {
            socket.close();

        } catch (Exception e) {

        }
    }
}