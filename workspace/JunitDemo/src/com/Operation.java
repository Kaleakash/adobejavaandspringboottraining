package com;

import java.util.ArrayList;
import java.util.List;

public class Operation {

			public int add(int x, int y) {
				System.out.println("I Came Here!");
				return x+y;
			}
			
			public List<String> getInfo() {
				List<String> listOfStd = new ArrayList<String>();
				listOfStd.add("ravi");
				listOfStd.add("ramesh");
				listOfStd.add("rajesh");
				return listOfStd;
			}
			
			public String getEmployeeFromDb() {
									//codiing to call the DAO Methods with conditions. 
				
				return "Welcome to Db Login";
			}
}
