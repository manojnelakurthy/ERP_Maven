package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {
public static String getVAlueForKey(String key) throws Throwable{
	Properties configproperties=new Properties();
	FileInputStream fi=new FileInputStream("D:\\Selenium_Evening\\ERP_Maven\\PropertyFile\\Environment.properties");
	configproperties.load(fi);
	return configproperties.getProperty(key);
}		  
}