package study.Graphic;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ikocos on 08/04/2017.
 */
public class ImageLoad {
    public static  void main(String[] args){
        JFrame jFrame = new JFrame("Image load");
        jFrame.setLocation(300,300);
        jFrame.setPreferredSize(new Dimension(500,400));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = jFrame.getContentPane();
        DrawingPanelImage drawingPanelImage = new DrawingPanelImage();



        container.add(drawingPanelImage,BorderLayout.CENTER);

        JPanel jPanel = new JPanel();//image load
        JButton jButton = new JButton( "Load");// image load button
        JTextField jTextField = new JTextField(30); // image path

        jPanel.add(jTextField);
        jPanel.add(jButton);
        container.add(jPanel,BorderLayout.SOUTH);

        jFrame.pack();
        jFrame.setVisible(true);


        jButton.addActionListener(e -> {
            drawingPanelImage.loadImage(jTextField.getText());
        });
    }
}
