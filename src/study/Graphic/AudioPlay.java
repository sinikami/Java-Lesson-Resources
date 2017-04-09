package study.Graphic;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;

/**
 * Created by ikocos on 08/04/2017.
 */
public class AudioPlay {
    public static void main(String args[]) {
        JFrame jFrame = new JFrame("Audio play");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocation(300, 300);
        jFrame.setPreferredSize(new Dimension(500, 400));


        Container container = jFrame.getContentPane();

        JTextField jTextField = new JTextField(30);//audio url

        JButton jButton = new JButton("Play");

        container.setLayout(new FlowLayout());
        container.add(jTextField);
        container.add(jButton);


        jFrame.pack();
        jFrame.setVisible(true);


        jButton.addActionListener(e -> {
                    File file = new File(jTextField.getText());
                    try {
                        AudioClip audioClip = Applet.newAudioClip(file.toURI().toURL());
                        audioClip.play();
                    } catch (MalformedURLException e1) {
                        JOptionPane.showMessageDialog(jTextField, "aaaaa", "bbbb", JOptionPane.ERROR_MESSAGE);
                    }

                }
        );

    }


}
