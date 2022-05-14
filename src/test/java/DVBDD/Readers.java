package DVBDD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import util.Base.PageBase;

public class Readers extends PageBase{
	private BufferedReader reader;
	List<String> lines = new ArrayList<String>();
	
	public Readers(String filePath) {
		super();
		open(filePath);
	}
	
	public void open(String filePath) {
		try {
			reader = new BufferedReader(new FileReader(filePath));
			String line;
			while ((line = reader.readLine()) != null) {
				lines.add(line);} 		reader.close();

			}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<String> getLine() {
		return lines;
	}
	
	public void runSteps() {
		for (String line : lines) {
			switch(line.split(" ")[0]){ 
			  case "open" : selenium.navigateTo(line.split(" ")[1].replace("\"", ""));break;
			  case "title" : selenium.Log(selenium.getTitle().equalsIgnoreCase(line.split(" ")[1].replace("\"", "")));break;
			  case "type" : selenium.typeENTER(selenium.findBy_Xpath(line.split(" ")[1].replace("\"", "")), line.split(" ")[2].replace("\"", ""));break;
			  case "wait" : selenium.sleep(selenium.StringToInt(line.split(" ")[1].replace("\"", "")));break;
			}
			
		}
	}
	
	
}
