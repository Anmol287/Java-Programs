import javax.swing.*;

public class TableExample {
	JFrame f;

	TableExample() {
		f = new JFrame();
		String data[][] = { { "01", "ANMOL Kansal", "78975" },
				{ "02", "SAHIL", "45679" },
				{ "03", "HIMANSHI", "79651" },
				{ "04", "ALICE", "56848" },
				{ "05", "ANCHAL", "45565" } };

		String column[] = { "ID", "NAME", "SALARY" };
		JTable jt = new JTable(data, column);
		jt.setBounds(30, 30, 400, 400);
		JScrollPane sp = new JScrollPane(jt);
		f.add(sp);
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new TableExample();
	}
}
