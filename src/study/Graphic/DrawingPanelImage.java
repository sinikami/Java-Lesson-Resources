package study.Graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

/**
 * Created by ikocos on 08/04/2017.
 */
public class DrawingPanelImage extends JPanel {
    String imagePath;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Image img = Toolkit.getDefaultToolkit().getImage(imagePath);
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

    }
    public void loadImage(String imagePath){
        this.imagePath = imagePath;
        repaint();
    }
}
