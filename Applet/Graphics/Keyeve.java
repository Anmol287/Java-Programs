import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Keyeve extends Applet implements KeyListener {
    String msg = "";
    int X = 10, Y = 20;

    public void init() {
        setBackground(Color.black);
        setForeground(Color.white);
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        showStatus("Key Down ");
        int key = ke.getKeyCode();
        switch (key) {
            case KeyEvent.VK_S:
                msg += "ANMOL ";
                break;
            case KeyEvent.VK_J:
                msg += "KANSAL ";
                break;
            case KeyEvent.VK_I:
                msg += "AMITY NOIDA ";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                msg += "Arrow Down  ";
                break;
            case KeyEvent.VK_PAGE_UP:
                msg += "Arrow UP  ";
                break;
            case KeyEvent.VK_LEFT:
                msg += "Arrow Left  ";
                break;
            case KeyEvent.VK_RIGHT:
                msg += "Arrow Right  ";
                break;
        }
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
        showStatus("Key Up");
    }

    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, X, Y);
    }
}

/*
 * <applet code = "Keyeve.class" width=500 height= 500></applet>
 */
