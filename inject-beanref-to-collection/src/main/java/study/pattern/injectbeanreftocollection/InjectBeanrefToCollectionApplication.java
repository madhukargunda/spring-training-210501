package study.pattern.injectbeanreftocollection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import study.pattern.injectbeanreftocollection.moniotor.Monitor;



public class InjectBeanrefToCollectionApplication {
	
	@Autowired
	private List<Monitor> monitorList;

	public static void main(String[] args) {
		System.out.println("Executing the InjectBeanrefToCollectionApplication");
	}

}
