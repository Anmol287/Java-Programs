import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Checklist extends Applet implements ItemListener, ActionListener {
    Choice c;
    List l;
    String cmsg, lmsg;

    public void init() {
        c = new Choice();
        l = new List();
        c.add("Java");
        c.add("Python");
        c.add("Android");
        c.add("IOS");
        l.add("Java");
        l.add("Python");
        l.add("Android");
        l.add("IOS");
        add(c);
        add(l);
        c.addItemListener(this);
        l.addItemListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        repaint();
    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    public void paint(Graphics g) {
        cmsg = c.getSelectedItem();
        lmsg = l.getSelectedItem();
        g.drawString(cmsg, 300, 400);
        g.drawString(lmsg, 300, 500);
    }
}
/*
 * <html>
 * <body>
 * <applet code = "Checklist.class" width=500 height= 500></applet>
 * </body>
 * </html>
 */
