package study.pattern.injectingBeanReferences.notify.impl;

import study.pattern.injectingBeanReferences.notify.NotificationService;

public class SMSNotificationService implements NotificationService {

	@Override
	public void notification() {
		System.out.println("SMS Notification Service");
	}

}
