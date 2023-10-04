import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class scrollpanel extends JFrame {
    public scrollpanel() {
        super("ScrollPane");
        ImageIcon img = new ImageIcon("child.jpg");

        JScrollPane png = new JScrollPane(new JLabel(img));

        getContentPane().add(png);
        setSize(600, 650);
        setVisible(true);
    }

    public static void main(String[] args) {
        new scrollpanel();
    }
}