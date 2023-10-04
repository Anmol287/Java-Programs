import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AppletEventHandling extends Applet implements MouseListener {
    StringBuffer strbuf;

    public void init() {
        addMouseListener(this);
        strbuf = new StringBuffer();
        addItem("Initializing the applet");
        addItem("Welcome to the amity");
    }

    public void start() {
        addItem("Staring the applet");
    }

    public void stop() {
        addItem("Stoping the applet");
    }

    public void destroy() {
        addItem("destroying the applet");
        addItem("good bye!!");
    }

    void addItem(String word) {
        System.out.println(word);
        strbuf.append(word);
        repaint();
    }

    public void paint(Graphics g) {
        Font f = new Font("Times New Roman", 3, 40);
        g.setFont(f);
        g.drawString(strbuf.toString(), 20, 200);
        setForeground(Color.blue);
        setBackground(Color.green);
    }

    public void mouseEntered(MouseEvent event) { }
    public void mouseExited(MouseEvent e) { }
    public void mouseExisted(MouseEvent event) { }
    public void mousePressed(MouseEvent event) { }
    public void mouseReleased(MouseEvent event) { }
    
    public void mouseClicked(MouseEvent event) {
        addItem("Mouse is clicked");
    }
}

/* <applet code = "AppletEventHandling.class" width=500 height= 500></applet> */


