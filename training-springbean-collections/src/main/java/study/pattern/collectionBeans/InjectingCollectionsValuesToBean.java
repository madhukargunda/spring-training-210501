package study.pattern.collectionBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.pattern.collectionBeans.beans.Person;

/**
 * Hello world!
 *
 */
public class InjectingCollectionsValuesToBean 
{
    public static void main( String[] args )
    {
    	System.out.println("Creation of the First Application context");
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "springbean-collection.xml" });
		Person person  = (Person) context.getBean("person");
				
		System.out.println("Getting the Address Object : ");
		System.out.print(person.getAddress());
		
		
		System.out.println("Getting the List of Books Interested ");
		System.out.print(person.getBooksInterested());
		
		System.out.println("Getting the Exam Score values ");
		System.out.println(person.getExamScore());
		
    }
}
