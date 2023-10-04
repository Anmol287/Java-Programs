class ThreadDemo implements Runnable {
	Thread t;

	ThreadDemo() {
		t = new Thread(this, "Demo thread");
		System.out.println("Child thread: " + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("child thread running:" + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Interrupted.");
		}
		System.out.println("Exiting Child thread");
	}
}

class NewThread {
	public static void main(String args[]) {
		new ThreadDemo();
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("main thread running:" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted.");
		}
		System.out.println("Main thread exiting");
	}

}
