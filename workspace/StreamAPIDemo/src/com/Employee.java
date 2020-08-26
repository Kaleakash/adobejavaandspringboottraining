package com;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private float salary;

@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	//return this.id-o.id;		//Asc order by Id
	return o.id-this.id;		//Asc order by Id
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
