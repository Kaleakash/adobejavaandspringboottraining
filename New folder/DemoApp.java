class DemoApp {
	static void dis1() {
		int res = 10/0;
		System.out.println("dis1() method");
	}
	static void dis2() throws Exception{
			//try{
			dis1();
			//}catch(Exception e){}
		System.out.println("dis2() method");
	}
	public static void main(String args[]) throws Exception{
		//try{
		dis2();
		//}catch(Exception e){}
		System.out.println("main() method");	
	}
}
