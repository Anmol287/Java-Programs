import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;

// class extends JFrame and implements actionlistener
public class card extends JFrame implements ActionListener {

    CardLayout card;
    JButton b1, b2, b3;
    Container c;

    card() {

        // to get the content
        c = getContentPane();
        c.setLayout(new CardLayout(40, 30));

        b1 = new JButton("CENTER");
        b2 = new JButton("NORTH");
        b3 = new JButton("SOUTH");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        c.add("a", b1);
        c.add("b", b2);
        c.add("c", b3);
    }

    public void actionPerformed(ActionEvent e) {
        // call the next card
        card.next(c);
    }

    public static void main(String[] args) {

        card cl = new card();
        cl.setSize(400, 400);
        cl.setVisible(true);
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
