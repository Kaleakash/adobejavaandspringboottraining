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
Emp e = (Emp)factory.getBean("obj1");
System.out.println(e.getMsg());
	}

}
