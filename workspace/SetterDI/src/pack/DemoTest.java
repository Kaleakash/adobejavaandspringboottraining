package pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DemoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
Emp e = (Emp)factory.getBean("obj1"); //down level type casting
System.out.println(e.getMsg());
System.out.println("id is "+e.getId());
System.out.println("Name is "+e.getName());

Emp e2 = (Emp)factory.getBean("obj3"); //down level type casting
System.out.println(e2.getMsg());
System.out.println("id is "+e2.getId());
System.out.println("Name is "+e2.getName());

Emp e1 = (Emp)factory.getBean("obj2"); //down level type casting 
e1.display();
	}

}
