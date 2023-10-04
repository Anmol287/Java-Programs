class throwDemo {
	static void method() {
		try {
			System.out.println("caught inside method()");
			throw new NullPointerException("throw keyword demo");
			// System.out.println("caught inside method()");
		} catch (NullPointerException e) {
			throw e;
		}
	}

	public static void main(String args[]) {
		try {
			// method is called which has NullpointerException created explicitly
			// exception is handled and again thrown the same exception in catch block
			method();
		}
		// thrown exception in the catch block of method is handled and caught the
		// exception
		catch (NullPointerException e) {
			System.out.println("caught inside main method() " + e);
		}
	}
}
