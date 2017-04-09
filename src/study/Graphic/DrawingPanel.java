package study.Graphic;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ikocos on 08/04/2017.
 */
public class DrawingPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawRect(100,110,200,40);
        g.drawRect(150,70,100,40);
        g.drawOval(125,150,30,30);
        g.drawOval(245,150,30,30);
        g.drawLine(50,180,350,180);
    }
}
