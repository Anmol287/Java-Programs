class Threadst1 extends Thread {

    public void run() {
        System.out.println("Current thread name: " + Thread.currentThread().getName());
        System.out.println("run() method called");
    }

}

public class Threadst {
    public static void main(String[] args) {
        Threadst1 mtc = new Threadst1();
        mtc.start();
        mtc.start();

    }
}
