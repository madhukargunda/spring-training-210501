package study.pattern.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.pattern.autowire.domain.Person;

public class AutowireExample 
{
    public static void main( String[] args )
    {
        /*ApplicationContext context  = new ClassPathXmlApplicationContext(new String[] { "autowire-by-name-context.xml" });
        Person person =(Person) context.getBean("person");
        System.out.println(person.getAddress()); */
        
        
        
        // autowire bytype
        
      /*  ApplicationContext context  = new ClassPathXmlApplicationContext(new String[] { "autowire-by-type-context.xml" });
        Person person =(Person) context.getBean("person");
        System.out.println(person.getAddress());  
        
        */
        
        
    	// autowire constructor
        
    	ApplicationContext context  = new ClassPathXmlApplicationContext(new String[] { "autowire-by-constructor-context.xml" });
    	
        Person person =(Person) context.getBean("person");
        System.out.println("Person Object :" +person.getAddress());
        
        
        System.out.println("Contact Object: "+person.getContact());
    }
}
