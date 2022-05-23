package DVBDD;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.testng.annotations.Test;

public class Runner {
	
	@Test()
	public void test1() throws IOException {
		Path fileName = Path.of("src/test/resources/TestData/Text/sample.kmdv");
        String str = Files.readString(fileName);	
        String[] split = str.split("\n");
        for (String strs : split) {
        	System.out.println(strs);
        	System.out.println(" ---");
			
		}
    	}
	

}
