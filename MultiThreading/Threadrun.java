public class Threadrun implements Runnable {
    public void run() {
        System.out.println("Thread by Runnable Interface.");
    }

    public static void main(String args[]) {
        Threadrun m1 = new Threadrun();
        Thread t1 = new Thread(m1); // Using the constructor Thread(Runnable r)
        t1.start();
    }
}
