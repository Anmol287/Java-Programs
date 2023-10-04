import java.awt.*;
import java.applet.*;

public class GraphicA extends Applet {
    public void init() {
        setBackground(Color.black);
        setForeground(Color.white);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("ink free", Font.BOLD, 50));
        g.drawString("Sahil Saini ", 40, 50);
        g.setColor(Color.red);
        int x[] = { 95, 85, 106, 95 };
        int y[] = { 85, 104, 104, 85 };
        g.fillPolygon(x, y, 4);
        g.setColor(Color.magenta);
        int k[] = { 150, 200, 300, 350, 300, 200, 150 };
        int l[] = { 250, 350, 350, 250, 150, 150, 250 };
        g.fillPolygon(k, l, 6);
        g.setColor(Color.blue);
        g.fillArc(500, 310, 100, 100, 0, -180);
        g.setColor(Color.blue);
        g.fillArc(500, 410, 100, 100, 0, 180);
        g.fillArc(520, 450, 100, 100, 0, -180);
    }
}

/*
 * <html>
 * <body>
 * <applet code = "GraphicA.class" width=500 height= 500></applet>
 * </body>
 * </html>
 */
