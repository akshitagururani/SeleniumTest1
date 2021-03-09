package seleniumsample;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyclass {
	public static void main(String args[]) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\Akshita\\eclipse-workspace\\sampleproject\\src\\seleniumsample\\config.properties");
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("Username"));
		System.out.print(prop.getProperty("Key"));
		
	}
}