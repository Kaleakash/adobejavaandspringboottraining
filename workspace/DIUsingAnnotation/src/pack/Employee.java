package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope(value="singleton")
public class Employee {

private int id;
private String name;

private float salary;

@Autowired
private Address add;
@Autowired
@Qualifier(value="add1")
private Address ladd;

public Address getLadd() {
	return ladd;
}
public void setLadd(Address ladd) {
	this.ladd = ladd;
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
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
			+ ", add=" + add + "] "+ladd;
}

}
