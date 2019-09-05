package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesFile {
	
    private static PropertiesFile single_instance = null; 
    private static Map<String, String> settings = null;
    
    public PropertiesFile() throws IOException 
    { 
    	settings = new HashMap<String, String>();
    	Properties prop = new Properties();
    	
    	Path currentRelativePath = Paths.get("");
    	String sPath = currentRelativePath.toAbsolutePath().toString();
   
    	InputStream input = new FileInputStream(sPath + "/src/main/java/config/config.properties");
		prop.load(input);
		
		Enumeration KeyValues = prop.keys();
		while (KeyValues.hasMoreElements()) {
			String key = (String) KeyValues.nextElement();
			String value = prop.getProperty(key);
			
			settings.put(key, value);			
		}
    }
    
    public static PropertiesFile getInstance() throws IOException 
    { 
        if (single_instance == null) 
            single_instance = new PropertiesFile(); 
  
        return single_instance; 
    } 
    
	public static String getConfig(String key)
	{
		try {
			if(settings.containsKey(key))
			{
				return settings.get(key);
			}
		}
		catch(Exception ex) {}
		
		return "";
	}

}
