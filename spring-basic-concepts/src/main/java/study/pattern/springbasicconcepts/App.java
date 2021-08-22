package study.pattern.springbasicconcepts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-basicss-context.xml"});
		Person person = (Person) context.getBean("person");
		System.out.println(person.getFirstName() + "---------->" + person.getLastName());
		
		
		System.out.println(" Country : "+person.getAddress().getCountry());
		
		
		Address address = (Address) context.getBean("address");
		System.out.println("Country Name "+address.getCountry());
		
		
	}
	
}
