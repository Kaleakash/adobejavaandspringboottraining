interface A {
	void dis1();
	default void dis2() {
		System.out.println("A interface default imp");
	}
	static void dis3() {
		System.out.println("A interface Static method");
	}
}
class B implements A {
	public void dis1() {
		System.out.println("A interface dis1() method");
	}
}
class DefaultMethod {
	public static void main(String args[]) {
	
	}
}

