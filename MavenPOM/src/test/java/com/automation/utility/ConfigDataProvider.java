package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties prop;
	
	public ConfigDataProvider()
	{
		File scr = new File("./Config/config.properties");
		try {
			FileInputStream fis = new FileInputStream(scr);
			prop = new Properties();
			prop.load(fis);
			
			} catch (FileNotFoundException e) {			
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	public String getDataFromConfig(String keyToSearch)
	{
		return prop.getProperty(keyToSearch);
	}
	
	public String getBrowser()
	{
		return prop.getProperty("Browser");
	}
	
	public String getStagingUrl()
	{
		return prop.getProperty("qaURL");
	}
	
}
