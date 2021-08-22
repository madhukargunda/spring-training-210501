package study.pattern.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.pattern.lifecycle.domain.Person;

public class ApplicationLifeCycle {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"bean-lifecycle-context.xml"});
		Person person = (Person)context.getBean("person");
		context.close();
	}
	
}
