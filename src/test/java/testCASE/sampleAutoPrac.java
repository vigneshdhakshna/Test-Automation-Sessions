package testCASE;

import java.lang.reflect.Method;

import org.testng.Assert;

public class sampleAutoPrac {
	
	public static Method set1(String NAme) {
		System.out.println("Hey "+ NAme);
		Assert.fail();
		System.out.println("Hey "+ NAme);
		return null;
		
	}
	
	public static Method set3(String NAme) {
		System.out.println("Hey "+ NAme);
		System.out.println("Hey "+ NAme);
		return null;
		
	}
	
	public static void set2(Method m, String NAme) {
		
		try {
			m.invoke(m, NAme);
			
		} 
		catch (Exception e) {
			}
		catch (Error e) {
				}
		
		} 
	
	public static void main(String[] args) {
		set2(set1("Vignesh"),null);
		
	}
	

}
