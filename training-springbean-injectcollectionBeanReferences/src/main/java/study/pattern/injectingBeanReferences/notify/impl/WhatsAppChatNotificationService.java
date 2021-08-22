package study.pattern.injectingBeanReferences.notify.impl;

import study.pattern.injectingBeanReferences.notify.NotificationService;

public class WhatsAppChatNotificationService implements NotificationService {

	@Override
	public void notification() {
		System.out.println("WhatsappChatNotificationService ");
	}

}
