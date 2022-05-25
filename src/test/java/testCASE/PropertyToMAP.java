package testCASE;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyToMAP {
	
	public static void main(String[] args) throws Throwable {
		
		Properties prop = new Properties();
		prop.load(new FileReader("src/test/resources/Properties/browser.properties"));
		
		HashMap<String, String> retMap = new HashMap<>();
	    for (Map.Entry<Object, Object> entry : prop.entrySet()) {
	        retMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
	    }
	    System.out.println(retMap);
		
	}
	
	

}
