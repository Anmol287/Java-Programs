import java.applet.*;
import java.awt.*;

public class First extends Applet {
    public void init() {
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
    }

    public void paint(Graphics g) {
        Font f = new Font("Times New Roman", 2, 40);
        g.setFont(f);
        g.drawString("I am Anmol Kansal", 100, 150);
        g.drawRect(180, 200, 200, 200);
    }
}
/*
 * <applet code="First.class" width="600" height="550">
 * </applet>
 */


