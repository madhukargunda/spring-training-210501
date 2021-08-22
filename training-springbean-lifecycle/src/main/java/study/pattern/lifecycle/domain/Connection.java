package study.pattern.lifecycle.domain;

public class Connection {

	public String getDatabaseUrl() {
		return databaseUrl;
	}

	public void setDatabaseUrl(String databaseUrl) {
		this.databaseUrl = databaseUrl;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	private String databaseUrl;

	private String hostName;

	private String port;

	public String readData() {
		return "";
	}

	public void release() {

	}

}
