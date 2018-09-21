package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Props {

	static Properties properties = new Properties();

	static {
		try {
			InputStream is = Props.class.getClassLoader().getResourceAsStream("project.properties");
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getDbUrl() {
		return properties.getProperty("db.url");
	}

	public static String getDbDriver() {
		return properties.getProperty("db.driver");
	}

	public static String getDbDialect() {
		return properties.getProperty("db.dialect");
	}

	public static String getDbUsername() {
		return properties.getProperty("db.username");
	}

	public static String getDbPassword() {
		return properties.getProperty("db.password");
	}
}
