package study.pattern.injectingBeanReferences;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.pattern.injectingBeanReferences.service.NotificationManager;

public class InjectingBeanReferences {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"inject-collection-beans-context.xml"});
		NotificationManager manager = (NotificationManager) context.getBean("notificationManager");
		manager.notifyService();
		context.close();
	}
}
