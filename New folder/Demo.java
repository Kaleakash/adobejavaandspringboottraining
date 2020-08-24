import java.util.Scanner;
class Demo {
	public static void main(String args[]) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the id");
	int id = obj.nextInt();
	System.out.println("id is "+id);
	
	System.out.println("Enter the name");
	String name= obj.next();
	
	System.out.println("name is "+name);
	System.out.println("Enter the salary");
	float salary = obj.nextFloat();
	System.out.println("salary is "+salary);	
	}
}