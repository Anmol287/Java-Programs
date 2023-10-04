class ThreadDemo extends Thread {
	public void run() {
		System.out.println("Inside Run method");
	}
}

class Multithreading1 {
	public static void main(String args[]) {
		// creating threads
		ThreadDemo obj1 = new ThreadDemo();
		ThreadDemo obj2 = new ThreadDemo();
		ThreadDemo obj3 = new ThreadDemo();
		// display priority of above threads using getPriority()
		System.out.println("first thread priority : " + obj1.getPriority());
		System.out.println("Second thread priority : " + obj2.getPriority());
		System.out.println("Third thread priority : " + obj3.getPriority());

		// setting priorities of above threads
		obj1.setPriority(2);
		obj2.setPriority(5);
		obj3.setPriority(8);

		// display changed priorities of thread
		System.out.println("first thread priority : " + obj1.getPriority());
		System.out.println("Second thread priority : " + obj2.getPriority());
		System.out.println("Third thread priority : " + obj3.getPriority());

		// Displays the name of currently executing thread
		System.out.println("Currently Executing thread : " + Thread.currentThread().getName());
		System.out.println("Main thread priority :" + Thread.currentThread().getPriority());

		// main thread priority set to 10
		Thread.currentThread().setPriority(10);
		System.out.println(" Priority of main thread: " + Thread.currentThread().getPriority());

	}
}
