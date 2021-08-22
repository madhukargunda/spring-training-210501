package study.pattern.interfaceandimplementation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import study.pattern.interfaceandimplementation.laptop.Laptop;
import study.pattern.interfaceandimplementation.laptop.monitor.apple.AppleMonitor14Inch;
import study.pattern.interfaceandimplementation.laptop.monitor.lg.LgMonitor16Inch;
import study.pattern.interfaceandimplementation.laptop.ram.apple.AppleRam32GB;
import study.pattern.interfaceandimplementation.laptop.ram.lg.Lg8GBRam;

@SpringBootApplication
public class InterfaceAndImplementationApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterfaceAndImplementationApplication.class, args);
	
		/**
		 *     Travis Requirement Purchasing of the laptop
		 *  
		 *  	a. Apple Monitor - 14Inch 
		 *  	b. Apple Ram - 32 GB
		 */
		
		// 1.Creation of the dependencies for creation of the Laptop Object
			
		AppleMonitor14Inch apple14InchForTravis = new AppleMonitor14Inch();
		AppleRam32GB ram32GbForTravis = new AppleRam32GB();
		
		Laptop travisLaptop = new Laptop(apple14InchForTravis,ram32GbForTravis);
		
		//2. - Later decided to upgrade RAM
		Lg8GBRam lg8gbram = new Lg8GBRam(); 
		travisLaptop.setRam(lg8gbram);	
		
		//3. -  Later decided to upgraded monitor
		travisLaptop.setMonitor(new LgMonitor16Inch());
	}

}
