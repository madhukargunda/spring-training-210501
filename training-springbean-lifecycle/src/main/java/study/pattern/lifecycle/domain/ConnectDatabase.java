package study.pattern.lifecycle.domain;

public class ConnectDatabase {

	private Connection connection = new Connection();
	
	public void intializeConnectionDataProper() {
		this.connection.setDatabaseUrl("");
		this.connection.setHostName("");
		this.connection.setPort("");
	}

	public void readData() {
		System.out.println("Read the Data " + connection.readData());
	}

	public void destory() {
		System.out.println("Release the Connection ");
		connection.release();
	}
}
