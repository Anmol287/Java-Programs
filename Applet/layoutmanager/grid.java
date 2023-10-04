import java.awt.*;

public class grid extends Frame {
    public static void main(String[] args) {
        Frame f = new Frame("Button Example");
        Button b, b2, b3, b4, b5;

        b = new Button("A");
        b2 = new Button("B");
        b3 = new Button("C");
        b4 = new Button("D");
        b5 = new Button("E");

        f.add(b);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setSize(400, 400);
        f.setLayout(new GridLayout());
        f.setVisible(true);
    }
}
