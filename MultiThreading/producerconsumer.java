import java.util.LinkedList;

public class producerconsumer {

    public static void main(String args[]) throws InterruptedException {
        final PC pc = new PC();

        // creating producer thread
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // creating consumer thread
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    pc.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // starting the threads
        t1.start();
        t2.start();

        // join method will wait for thread to die
        t1.join();
        t2.join();
    }

    public static class PC {

        // creating linkedlist
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;

        // function call by producer thread
        public void produce() throws InterruptedException {
            int value = 1;
            while (true) {
                synchronized (this) {

                    while (list.size() == capacity) {
                        wait();
                    }
                    System.out.println("Producer produces: " + value);
                    // inserting good in list
                    list.add(value++);

                    // notifies the other thread i.e consumer thread
                    notify();

                    Thread.sleep(1000);
                }
            }
        }

        public void consumer() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    while (list.size() == 0) {
                        wait();
                    }
                    // to remove item from the producer list
                    int val = list.removeFirst();
                    System.out.println("Consumer consumes : " + val);

                    // it will notify producer thread
                    notify();
                    // and sleep
                    Thread.sleep(1000);

                }
            }

        }

    }
}