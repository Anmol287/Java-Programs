public class E3thread {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {

             public void run() {
                try {
                    //synchronized (this) {
                        while (true) {
                            System.out.println("Schildt");
                            Thread.sleep(2000);

                        }
                    //}
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        });

        // thread 2

        Thread t1 = new Thread(new Runnable() {

            public void run() {
                try {
                    //synchronized (this) {
                        while (true) {
                            System.out.println("Bala Guru Swamy");
                            Thread.sleep(3000);

                        }
                    //}
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        });
        // thread 3

        Thread t2 = new Thread(new Runnable() {

             public void run() {
                try {
                    //synchronized (this) {
                        while (true) {
                            System.out.println("Chris Bates \n");
                            Thread.sleep(4000);
                        }
                   // }
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
            }
        });

        t.start();
        t1.start();
        t2.start();

    }
}
