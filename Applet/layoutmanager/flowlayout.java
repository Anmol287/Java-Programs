import java.awt.*;

public class flowlayout extends Frame {
    public static void main(String[] args) {
        Frame f = new Frame("Flow layout ");
        Button b, b2, b3;

        b = new Button("A");
        b2 = new Button("B");
        b3 = new Button("C");

        f.add(b);
        f.add(b2);
        f.add(b3);

        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
