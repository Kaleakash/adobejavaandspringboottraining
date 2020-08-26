class A {
	static void dis1() {
		System.out.println("A class method");
	}
}
class B extends A {
	static void dis1() {
		System.out.println("B class method");
	}
}
class StaticDemo{
	public static void main(String args[]) {
	A obj1 = new B();
	obj1.dis1();	
	}
}

