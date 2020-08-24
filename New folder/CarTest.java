class Car {
	int wheel;
	String color;
	float price;
	void carInfo(String name) {
		System.out.println("Car Info "+name);
		System.out.println("Wheel "+wheel);
		System.out.println("Color "+color);	
		System.out.println("Price "+price);
			
	}
}
class CarTest {
	public static void main(String args[]) {
	Car innova  = new Car();
	innova.wheel = 4;
	innova.color = "Gray";
	innova.price = 1500000;
	innova.carInfo("Innova");
	
	Car swift  = new Car();
	swift.wheel = 4;
	swift.color = "Black";
	swift.price = 850000;
	swift.carInfo("Swift");	
	}
}
