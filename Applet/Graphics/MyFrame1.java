import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class MyFrame1 extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon = new ImageIcon("pic.jpg");

    MyFrame1() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550, 550);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("pic.jpg");
        label = new JLabel();
        label.setBounds(0, 0, 200, 200);
        label.setIcon(icon);
        // label.setBackground(Color.red);
        label.setOpaque(true);
        // this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 'g':
                label.setLocation(label.getX() + 10, label.getY() + 10);
                break;
            case 'r':
                label.setLocation(label.getX() - 10, label.getY() - 10);
                break;
            case 'f':
                label.setLocation(label.getX() - 10, label.getY() + 10);
                break;
            case 't':
                label.setLocation(label.getX() + 10, label.getY() - 10);
                break;
        }
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("You released key char " + e.getKeyChar());
        System.out.println("You released key code " + e.getKeyCode());
    }
}
/*
 * <html>
 * <body>
 * <applet code = "MyFrame1.class" width=5000 height= 5000></applet>
 * </body>
 * </html>
 */
