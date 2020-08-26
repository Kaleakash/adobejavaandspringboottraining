import java.util.function.*;
import java.util.*;
class Abc implements Function<Integer,String>{
	public String apply(Integer n) {
		return "Welcome to Function interface impl without Lambda coding with value "+10;
	}
}
class LambdaDemo{
	public static void main(String args[]) {
	Function obj1 = new Abc();
	System.out.println(obj1.apply(10));
	
	Function<Integer,String> obj2 = (value)->"Welcome to Lambda expression with Function coding "+value;
	System.out.println(obj2.apply(100));	

	Consumer<String> obj3 = (name)->System.out.println("Welcome user "+name);
	obj3.accept("Ravi");
	obj3.accept("Ramesh");	

	Supplier<String> obj4 = ()->"Welcome User";
	System.out.println(obj4.get());

	Predicate<Integer> obj5 = (val)->val>100;
	System.out.println(obj5.test(50));
	System.out.println(obj5.test(150));
	}
}

