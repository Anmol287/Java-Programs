class TestMultipleNaming extends Thread {
	public void run() {
		System.out.println("Inside Run method");
	}
}

class Multithreading2 {
	public static void main(String args[]) {
		// creating threads
		TestMultipleNaming t1 = new TestMultipleNaming();
		TestMultipleNaming t2 = new TestMultipleNaming();
		TestMultipleNaming t3 = new TestMultipleNaming();
		TestMultipleNaming t4 = new TestMultipleNaming();
		TestMultipleNaming t5 = new TestMultipleNaming();

		System.out.println("Name of 1st thread: " + t1.getName());
		System.out.println("Name of 2nd thread: " + t2.getName());
		System.out.println("Name of 3rd thread: " + t3.getName());
		System.out.println("Name of 4th thread: " + t4.getName());
		System.out.println("Name of 5th thread: " + t5.getName());

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		t1.setName("Amity");
		t2.setName("Anmol 2");
		t3.setName("Welcome 3");
		t4.setName("Welcome 4");
		t5.setName("Kansal 56");

		System.out.println("Name of 1st thread after changing: " + t1.getName());
		System.out.println("Name of 2nd thread after changing: " + t2.getName());
		System.out.println("Name of 3rd thread after changing: " + t3.getName());
		System.out.println("Name of 4th thread after changing: " + t4.getName());
		System.out.println("Name of 5th thread after changing: " + t5.getName());

	}
}
