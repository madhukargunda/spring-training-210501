package study.pattern.trainingComponentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TrainingComponentScanApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "springbean-collection.xml" });
		System.out.println(context.getBean("address"));
	}
}
