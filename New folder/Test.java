interface A {
	int add(int x, int y);
}
interface B {
	int sub(int x, int y);
}
class Server implements A,B{
	public int add(int x, int y) {
		return x+y;
	}
	public int sub(int x, int y) {
		return x+y;
	}
	void ownMethod() {
		System.out.println("Server own method");
	}
}
class Test {
	public static void main(String args[]) {
	Server ss = new Server();
	A obj1 = new Server();	//RMI 
	B obj2 = new Server();	
	System.out.println(obj1.add(1,2));		
	//System.out.println(obj1.sub(1,2));		
	//System.out.println(obj2.add(1,2));
	System.out.println(obj2.sub(1,2));				
	}
}



