
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Checkboxdemo extends Applet {

    public void init() {
        Checkbox c1 = new Checkbox("GYM");
        Checkbox c2 = new Checkbox("Readind Newspaper");
        Checkbox c3 = new Checkbox("Yoga ");
        Checkbox c4 = new Checkbox("International Relation");
        Checkbox c5 = new Checkbox("Learning new things");

        Font f = new Font("Times New Roman", 4, 18);
        c1.setFont(f);
        c2.setFont(f);
        c3.setFont(f);
        c4.setFont(f);
        c5.setFont(f);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
    }
    public void paint(Graphics g) {
        g.drawString("Checkbox demo", 100, 100);
    }
}
/* <applet code = "Checkboxdemo.class" width=500 height= 500></applet> */
