package study.pattern.springbeanannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.pattern.springbeanannotations.domain.Person;

public class SpringBeanAnnotationExamples {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-annotations-context.xml"});
		
		Person person = (Person) context.getBean("person");
		
		System.out.println(person + "\n Address object from Person class ---->" +person.getAddress());
		
		
		System.out.println("Address object "+context.getBean("address"));
		
		
		System.out.println("Service Class Object :"+context.getBean("employeService"));
		
	}
	
}
