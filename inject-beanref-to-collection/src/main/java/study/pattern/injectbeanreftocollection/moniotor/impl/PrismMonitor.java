package study.pattern.injectbeanreftocollection.moniotor.impl;

import org.springframework.stereotype.Service;

import study.pattern.injectbeanreftocollection.moniotor.Monitor;

@Service
public class PrismMonitor implements Monitor {

	public void show() {
		System.out.println("Invoking the Prism Monitr");
	}

}
