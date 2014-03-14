package br.com.produban.openbus.utils.config;

public class PublisherConfig {
	private final int listeningThreads;
	private final String defaultTopic;
	private final String integrationTierServer;
	private final String integrationTierPort;

	public PublisherConfig(int listeningThreads, String defaultTopic, String integrationTierServer,
			String integrationTierPort) {
		super();
		this.listeningThreads = listeningThreads;
		this.defaultTopic = defaultTopic;
		this.integrationTierServer = integrationTierServer;
		this.integrationTierPort = integrationTierPort;
	}

	public int getListeningThreads() {
		return listeningThreads;
	}

	public String getDefaultTopic() {
		return defaultTopic;
	}

	public String getIntegrationTierServer() {
		return integrationTierServer;
	}

	public String getIntegrationTierPort() {
		return integrationTierPort;
	}

}
