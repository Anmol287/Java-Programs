import java.awt.*;
import java.applet.*;

public class LabelDemo extends Applet {
    public void init() {
        setBackground(Color.red);
        setForeground(Color.black);
        Label l1 = new Label("MARVEL");
        Label l2 = new Label("FAN");
        add(l1);
        add(l2);
    }

    public void paint(Graphics g) {
        g.drawString("Labeldemo", 100, 100);
    }
}
/*
 * <html>
 * <body>
 * <applet code = "LabelDemo.class" width=500 height= 500></applet>
 * </body>
 * </html>
 */