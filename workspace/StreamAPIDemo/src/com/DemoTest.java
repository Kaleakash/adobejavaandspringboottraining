package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.stream.Stream;


interface Abc {
	void dis1();
}
class MethodRef {
	public static void dis1( ) {
		System.out.println("Method Ref global logic");
	}
}
public class DemoTest {

	public static void main(String[] args) {
		int abc[]= {10,20,30,40,50};
		Stream.of(abc);			//converting primitive to stream 
		
		List<Integer> ll = new ArrayList<>();
		ll.add(10); ll.add(20); ll.add(30);
		//ll.stream().forEach(System.out::println);					//retrieve record with method ref 
		ll.stream().forEach(val->System.out.println(val));			// retrieve record method method ref 
		Abc obj1 = ()->System.out.println("Lambda Expression - 1 way");
		obj1.dis1();
		
		Abc obj2 = ()->System.out.println("Lambda Expression  - 2 way");
		obj2.dis1();
		
		Abc obj3 = MethodRef::dis1;
		obj3.dis1();
	}

}
