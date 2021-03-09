package seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoautomation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\exe files\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.findElementById("username").sendKeys("akshita");
		driver.findElementById("password").sendKeys("123");
		driver.findElementById("Login").click();
		System.out.println(driver.findElement(By.cssSelector("[class='loginError']")).getText());//to get the login error text
		System.out.println("hello");
	}

}
