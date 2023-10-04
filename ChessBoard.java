public class ChessBoard {
	public static void main(String args[]) {
		System.out.println("               +------------------------+");
		for (int i = 1; i <= 8; i++) {
			System.out.print("               |");
			for (int j = 1; j <= 8; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("|||");
				} else {
					System.out.print("   ");
				}
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("               +------------------------+");
	}
}
