package study.pattern.injectingBeanReferences.service;

import java.util.Map;

import study.pattern.injectingBeanReferences.notify.NotificationService;

public class NotificationManager {

	/*
	 	private List<NotificationService> notificationService;

		public NotificationManager(List<NotificationService> notificationService) {
			this.notificationService = notificationService;
		}
	
		public List<NotificationService> getNotificationService() {
			return notificationService;
		}
		
		public void notifyService() {
			notificationService.forEach(s ->  System.out.println(s.getClass().getSimpleName()));
		}
	*/
	
	
	private Map<String,NotificationService> notificationService;
	
	public NotificationManager(Map<String,NotificationService> notificationService) {
		this.notificationService = notificationService;
	}
 	
	public void notifyService() {
		this.notificationService.entrySet().forEach(entry -> System.out.println(entry.getKey() +":"+ entry.getValue()));
	}
}
