import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Japplet extends Applet implements MouseListener, MouseMotionListener {
    int X = 240, Y = 240;
    String msg = "Mouse events";

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(Color.black);
        setForeground(Color.white);
    }

    public void mouseClicked(MouseEvent me) {
        msg = "Mouse Clicked ";
        setBackground(Color.blue);
        showStatus("Mouse clicked");
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        msg = "Mouse Entered ";
        setBackground(Color.red);
        showStatus("Mouse Entered");
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void mousePressed(MouseEvent me) {
        msg = "Mouse Pressed ";
        setBackground(Color.orange);
        showStatus("Mouse Pressed");
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        msg = "Mouse Released ";
        setBackground(Color.lightGray);
        showStatus("Mouse Released");
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        msg = "Mouse Moved ";
        setBackground(Color.green);
        showStatus("Mouse Moved ");
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        msg = "Mouse Dragged ";
        setBackground(Color.magenta);
        showStatus("Mouse dragged");
        repaint();
    }

    public void paint(Graphics g) {
        Font f = new Font("Times new roman", 3, 40);
        g.setFont(f);
        g.drawString(msg, X, Y);
    }
}

/*
 * <html>
 * <body>
 * <applet code = "Japplet.class" width=500 height= 500></applet>
 * </body>
 * </html>
 */
