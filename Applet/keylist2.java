import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class keylist2 extends Applet implements KeyListener {
    int X = 150, Y = 150;
    String msg = "Key Events";

    public void init() {
        setBackground(Color.black);
        setForeground(Color.white);
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        msg = "Key Pressed";
        setBackground(Color.yellow);
        showStatus("Key Pressed");
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
        msg = "Key Released";
        setBackground(Color.red);
        showStatus("Key Released");
        repaint();
    }

    public void keyTyped(KeyEvent ke) {
        msg = "Key Typed";
        setBackground(Color.blue);
        showStatus("Key Typed");
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, X, Y);
    }
}

/*
  <html>
   <body>
    <applet code = "keylist2.class" width=500  height= 500></applet>
   </body>
 </html>
 */
