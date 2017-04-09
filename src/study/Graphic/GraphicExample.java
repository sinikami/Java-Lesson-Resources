package study.Graphic;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ikocos on 08/04/2017.
 */
public class GraphicExample {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Draw a car");
        jFrame.setLocation(500, 300);
        jFrame.setPreferredSize(new Dimension(500, 350));

        Container container = jFrame.getContentPane();

        DrawingPanel drawingPanel = new DrawingPanel();
        DrawingPanelGraph drawingPanelGraph = new DrawingPanelGraph();

        container.add(drawingPanelGraph, BorderLayout.CENTER);
        JPanel jPanel = new JPanel();

        JTextField jTextField1 = new JTextField(3);
        JTextField jTextField2 = new JTextField(3);
        JTextField jTextField3 = new JTextField(3);
        JButton jButton = new JButton("Draw");
        jPanel.add(new JLabel("Korean"));
        jPanel.add(jTextField1);
        jPanel.add(new JLabel("English"));
        jPanel.add(jTextField2);
        jPanel.add(new JLabel("Math"));
        jPanel.add(jTextField3);
        jPanel.add(jButton);

        container.add(jPanel, BorderLayout.SOUTH);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);

        jButton.addActionListener(e -> {
            int korean = Integer.parseInt(jTextField1.getText());
            int english = Integer.parseInt(jTextField2.getText());
            int math = Integer.parseInt(jTextField3.getText());
            drawingPanelGraph.setScores(korean, english, math);
            drawingPanelGraph.repaint();
        });
    }
}
