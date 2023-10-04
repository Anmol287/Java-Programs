
import java.awt.*;
import java.applet.*;

public class GraphicExample extends Applet {
        public void init() {
                setBackground(Color.blue);
                setForeground(Color.white);

        }

        public void paint(Graphics g) {
                g.drawString("ANMOL KANSAL", 410, 410);
                g.setColor(Color.blue);
                g.drawRect(40, 70, 100, 40);
                g.setColor(Color.red);
                g.fillRect(40, 120, 100, 40);
                g.setColor(Color.magenta);
                g.drawOval(40, 170, 30, 60);
                g.setColor(Color.pink);
                g.fillOval(90, 170, 30, 30);
                g.setColor(Color.black);
                g.drawLine(40, 240, 140, 240);
                g.setColor(Color.green);
                g.drawArc(40, 260, 60, 100, 0, -180);
                g.setColor(Color.white);
                int x[] = { 200, 350, 490, 350, 200 };
                int y[] = { 100, 100, 250, 400, 400 };
                g.fillPolygon(x, y, 5);

        }
}
/*
 * <html>
 * <body>
 * <applet code = "GraphicExample.class" width=500 height= 500></applet>
 * </body>
 * </html>
 */
