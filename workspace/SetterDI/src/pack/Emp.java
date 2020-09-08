package pack;

public class Emp {
private String msg;
private int id;
private String name;

public Emp(String msg, int id, String name) {
	super();
	this.msg = msg;
	this.id = id;
	this.name = name;
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
public Emp() {
	// TODO Auto-generated constructor stub
	System.out.println("Constructor called...");
}
public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}


public void display() {
	System.out.println("Welcome to Spring Core "+msg);
}
}
