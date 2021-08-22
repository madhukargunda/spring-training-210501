package study.pattern.injectbeanreftocollection.moniotor.impl;

import org.springframework.stereotype.Service;

import study.pattern.injectbeanreftocollection.moniotor.Monitor;

@Service
public class SamsungMonitor implements Monitor {

	public void show() {
		System.out.println("samsung monitor");
	}
}
