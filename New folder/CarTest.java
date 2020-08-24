class Car {

	Car() {
		System.out.println("Object created....");
	}
		
	void carInfo() {
		System.out.println("Car class method");	
	}
}
class CarTest {
	public static void main(String args[]) {
	Car obj1 = new Car();
	obj1.carInfo();	
	obj1.carInfo();
	obj1.carInfo();

	Car obj2 = new Car();
	obj2.carInfo();
	obj2.carInfo();
	}
}



