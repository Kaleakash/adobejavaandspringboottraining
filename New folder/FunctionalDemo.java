@FunctionalInterface
interface A {
	void dis1();
	default void dis2() {
		System.out.println("Default method imp of A interface");
	}
	static void dis3() {
		System.out.println("Static method imp of A interface");
	}
}
class B implements A {
	public void dis1() {
		System.out.println("A interface imp");
	}

}
class FunctionalDemo{
	public static void main(String args[]) {
	B obj1 = new B();
	obj1.dis1();	
	obj1.dis2();
	A.dis3();
	}
}

