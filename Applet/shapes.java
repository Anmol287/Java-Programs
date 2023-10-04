import java.applet.*;
import java.awt.*;

public class shapes extends Applet {
    public void init() {
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
    }

    public void paint(Graphics g) {
        g.drawRect(40, 40, 700, 300);
        // triangle1
        g.drawLine(200, 80, 80, 280);
        g.drawLine(80, 280, 300, 280);
        g.drawLine(200, 80, 300, 280);
        // triangle2
        g.drawLine(570, 80, 450, 280);
        g.drawLine(450, 280, 670, 280);
        g.drawLine(570, 80, 670, 280);
        // nose
        g.drawOval(300, 400, 150, 150);
        // Arc for the smile
        g.drawArc(80, 480, 600, 200, 180, 180);
    }
}
/*
 * <applet code="shapes.class" width="800" height="800">
 * </applet>
 */