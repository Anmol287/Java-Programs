import java.applet.Applet;
import java.awt.*;

public class ract extends Applet {

  public void paint(Graphics g) {
    setBackground(Color.pink);
    g.setColor(Color.black);
    g.drawLine(10, 10, 500, 10);
    g.drawLine(10, 502, 502, 502);
    g.drawLine(10, 10, 10, 500);
    g.drawLine(500, 10, 500, 500);
    g.setColor(Color.red);
    g.drawLine(250, 10, 10, 500);
    g.drawLine(250, 10, 500, 500);
    g.drawLine(10, 500, 500, 500);
    g.setColor(Color.blue);
    g.drawLine(250, 500, 130, 255);
    g.drawLine(250, 500, 375, 255);
    g.drawLine(130, 255, 375, 255);

  }
}
/*
 * <applet code=ract width=600 height=600>
 * </applet>
 */