class MultiThreadingConcept extends Thread {
	public void run() {
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Multithreading {
	public static void main(String args[]) {
		MultiThreadingConcept obj1 = new MultiThreadingConcept();
		MultiThreadingConcept obj2 = new MultiThreadingConcept();
		obj1.start();
		obj2.start();

	}
}
