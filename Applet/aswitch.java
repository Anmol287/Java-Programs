import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class aswitch extends Applet implements ActionListener {
    Button b, b2, b3;

    public void init() {
        b = new Button("Draw Rectangle");
        add(b);

        b2 = new Button("Draw Circle");
        add(b2);

        b3 = new Button("Draw triangle");
        add(b3);

        b.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this); // registering the action event
        setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
    }

    public void paint(Graphics g) {
        Font f = new Font("Times new Roman", 2, 30);
        g.setFont(f);
        g.drawString("Choose the options : ", 20, 20);
    }

    public void actionPerformed(ActionEvent e) {
        Graphics g = getGraphics();

        if (e.getSource() == b) {
            g.drawRect(150, 300, 300, 150);
        }
        if (e.getSource() == b2) {
            g.drawOval(300, 100, 150, 150);
        }
        if (e.getSource() == b3) {
            g.drawLine(200, 80, 80, 280);
            g.drawLine(80, 280, 300, 280);
            g.drawLine(200, 80, 300, 280);
        }
    }
}
/*
 * <applet code="aswitch" height="500" width="500">
 * </applet>
 */
