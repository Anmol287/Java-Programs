import java.awt.*;
import java.applet.*;

public class examtrianc extends Applet {

    public void paint(Graphics g) {
        // square
        g.drawRect(100, 100, 400, 400);
        // triangle inside square
        int x[] = { 150, 300, 450, };
        int y[] = { 400, 150, 400 };
        g.drawPolygon(x, y, 3);
        // circle inside triangle
        g.drawOval(220, 235, 162, 162);

    }
}

/*
 * <applet code="examtrianc.class" width="600" height="700">
 * </applet>
 */
