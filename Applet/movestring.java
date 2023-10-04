import java.applet.*;
import java.awt.*;

public class movestring extends Applet implements Runnable {
    int x, y;
    Thread t;

    public void init() {
        setBackground(Color.BLACK);
        setForeground(Color.white);
        x = 50;
        y = 100;
        t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        Font f = new Font("Times New Roman", 1, 20);
        g.setFont(f);
        g.drawString("WELCOME TO ANIMATION", x, y);
    }

    public void run() {
        try {
            while (true) {
                if (x > 600) {
                    x = 50;
                }
                Thread.sleep(500);
                x += 50;
                repaint();
            }
        } catch (Exception e) {
        }
    }

}

/*
 * <applet code="movestring.class" width="800" height="600" name="Animation">
 * </applet>
 */