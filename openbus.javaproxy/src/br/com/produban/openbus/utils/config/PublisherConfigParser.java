package br.com.produban.openbus.utils.config;

import java.util.Properties;

public class PublisherConfigParser {

	private static final String LISTENIG_THREADS = "listening.threads";
	private static final String DEFAULT_TOPIC = "default.topic";
	private static final String INTEGRATION_TIER_SERVER = "integration.tier.server";
	private static final String INTEGRATION_TIER_PORT = "integration.tier.port";
	
	public static PublisherConfig parse(Properties properties) {
		final int listeningThreads = findIntegerProperty(properties, LISTENIG_THREADS);
		final String defaultTopic = findProperty(properties, DEFAULT_TOPIC);
		final String integrationTierServer = findProperty(properties, INTEGRATION_TIER_SERVER);
		final String integrationTierPort = findProperty(properties, INTEGRATION_TIER_PORT);

		return new PublisherConfig(listeningThreads, defaultTopic, integrationTierServer, integrationTierPort);
	}
	
    private static int findIntegerProperty(Properties properties, String key) {
        final String value = findProperty(properties, key);
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException(
                    "Invalid integer " + key + " = " + value, exception);
        }
    }
	
    private static String findProperty(Properties properties, String key) {
        final String value = properties.getProperty(key);
        if (value == null) throw new IllegalArgumentException("Please specify " + key);
        return value;
    }

}
