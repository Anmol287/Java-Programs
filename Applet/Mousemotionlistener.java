import java.awt.*;
import java.awt.event.*;

public class Mousemotionlistener extends Frame implements MouseMotionListener {
    String msg="";

    // constructor
    Mousemotionlistener() {
        addMouseMotionListener(this);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 40, 20);
    }

    public void mouseMoved(MouseEvent e) {
        msg="Mouse moved";
        repaint();
		}
        public void paint(Graphics g){
            g.drawString(msg, 100, 100);
        }
    public static void main(String[] args) {
        new Mousemotionlistener();
    }
}


