	package study.pattern.springtrainingexample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.pattern.springtrainingexample1.domain.Address;
import study.pattern.springtrainingexample1.domain.Person;

public class SpringTrainingExample {
	public static void main(String[] args) {
		// location of spring configuration file
		
		System.out.println("Creation of the First Application context");
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "beandefinition-context.xml" });
		
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		//person.setFirstName("Doe John");
		//System.out.println(person);
		
		//System.out.println("*************************************************************");
		//System.out.println(context.getBean("person"));
		
		
		/*Address address = (Address) context.getBean("address");
		System.out.println(address);
		
		Person person1 = (Person) context.getBean("person");
		System.out.println(person1.getFirstName());
		
		Address address1 = (Address) context.getBean("address");
		System.out.println(address1); */
		
				
				
		System.out.println("\n  Creation of the Second Application context");
		ApplicationContext context2 = new ClassPathXmlApplicationContext(new String[] { "beandefinition-context.xml" });
		
		System.out.println("\n Creation of the third Application context");
		ApplicationContext context3 = new ClassPathXmlApplicationContext(new String[] { "beandefinition-context.xml" });
		

	}
}
