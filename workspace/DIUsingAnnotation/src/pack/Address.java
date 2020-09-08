package pack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("add")		//<bean id="add" class ="pack.Address"></bean>
@Scope(value="singleton")
public class Address {

@Value("Bangalore")
private String city;

@Value("Kar")
private String state;

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}

}
