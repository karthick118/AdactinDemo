package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;

	public ConfigurationReader() throws IOException {

		File f = new File("F:\\Users\\Karthick\\eclipse-workspace\\AdactinDemo\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getBrowserlaunch() {
		String browsername = p.getProperty("browsername");
		return browsername;
	}

	public String geturl() {
		String url = p.getProperty("url");
		return url;

	}

}
