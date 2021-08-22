package study.pattern.springbeanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanScopesExample 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {""});
    }
}
