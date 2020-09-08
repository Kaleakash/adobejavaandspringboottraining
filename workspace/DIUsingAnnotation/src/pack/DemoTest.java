package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml"); //interface extends BeanFactory 
Employee emp = (Employee)ac.getBean("emp");
System.out.println(emp);
Address add = emp.getAdd();
add.setCity("Hyderbad");
add.setState("TS");
emp.setAdd(add);
Employee emp1 = (Employee)ac.getBean("emp");
System.out.println(emp1);
	}

}
