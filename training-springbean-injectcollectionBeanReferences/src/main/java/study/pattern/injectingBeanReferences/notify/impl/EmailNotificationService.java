package study.pattern.injectingBeanReferences.notify.impl;

import study.pattern.injectingBeanReferences.notify.NotificationService;

public class EmailNotificationService implements NotificationService {

	@Override
	public void notification() {
		System.out.println("Email Notification Service");
	}
}
