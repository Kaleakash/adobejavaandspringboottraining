class A implements Runnable {
	public void run() {
		System.out.println("Thread example");
	}
}
class InnerClassDemo {
	public static void main(String args[]) {
	//1st way
	A obj1 = new A();
	Thread t1 = new Thread(obj1);
	t1.start();	

	//2nd way 
	Runnable r = new Runnable(){
		public void run() {
		System.out.println("Thread example using anonymous");
		}
	};

	Thread t = new Thread(r);
	t.start();
	}
}

