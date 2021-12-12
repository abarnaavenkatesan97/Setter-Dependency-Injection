package empPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bank {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("empspring.xml");
		Employee empobj1 = (Employee)context.getBean("employee1");
		empobj1.displayStudentInfo();
		Employee empobj2 = (Employee)context.getBean("employee2");
		empobj2.displayStudentInfo();
	}

}
