/**
 * 
 */
package study.pattern.interfaceandimplementation.laptop;

import study.pattern.interfaceandimplementation.laptop.monitor.Monitor;
import study.pattern.interfaceandimplementation.laptop.ram.Ram;


/**
 * @author madhukargunda
 *
 */
public class Laptop {

	
	private Monitor monitor;
	
	private Ram ram;

	public Laptop(Monitor monitor, Ram ram) {
		super();
		this.monitor = monitor;
		this.ram = ram;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

}
