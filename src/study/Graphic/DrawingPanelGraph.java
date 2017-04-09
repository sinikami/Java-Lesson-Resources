package study.Graphic;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ikocos on 08/04/2017.
 */
public class DrawingPanelGraph extends JPanel {
    int English, Korean, Math;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
       // setBackground(Color.green);

        g.setColor(Color.green);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.blue);
        g.drawLine(50, 250, 350, 250);

        for (int i = 0; i < 11; i++) {
            g.drawString(i * 10 + "", 25, 255 - 20 * i);
            g.drawLine(50, 250 - 20 * i, 350, 250 - 20 * i);
        }
        g.drawLine(50, 20, 50, 250);
        g.drawString("Korean", 100, 270);
        g.drawString("English", 200, 270);
        g.drawString("Math", 300, 270);
        g.setColor(Color.RED);

        if (Korean > 0) g.fillRect(110, 250 - Korean * 2, 10, Korean * 2);

        g.setColor(Color.black);
        if (English > 0) g.fillRect(210, 250 - English * 2, 10, English * 2);
        if (Math > 0) g.fillRect(310, 250 - Math * 2, 10, Math * 2);
    }

    public void setScores(int korean, int english, int math) {
        this.Korean = korean;
        this.English = english;
        this.Math = math;
    }
}
