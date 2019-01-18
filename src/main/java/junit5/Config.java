package junit5;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class Config {
	private static final String CONFIG_PATH = System.getProperty("config.path", "config.properties");
	private Properties props = new Properties();
	private static Config instance = null;

	public Config() {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL appResourceURL = loader.getResource(CONFIG_PATH);

		try (InputStream is = appResourceURL.openStream()) {
			props.load(is);
		} catch (IOException e) {
			System.err.println("Fail to load config: " + CONFIG_PATH);
		}
	}

	public static synchronized Config getInstance() {
		if (null == instance) {
			instance = new Config();
		}
		return instance;
	}

	public String getProperty(String key) {
		return props.getProperty(key);
	}

	public String getProperty(String key, String defaultValue) {
		return props.getProperty(key, defaultValue);
	}
}
