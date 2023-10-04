public class starnum {
    public static void main(String args[]) {
        
        for (int i = 2; i <= 6; i++) {
            for (int j = 1; j < i; j++) {

                if (i % 2 != 0 && j % 2 == 0) {
                    System.out.print(j);
                } else if (j % 2 != 0 && i % 2 == 0) {
                    System.out.print(j);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
