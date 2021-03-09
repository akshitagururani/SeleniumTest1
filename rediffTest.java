package seleniumsample;

import org.openqa.selenium.chrome.ChromeDriver;

public class rediffTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\exe files\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
		driver.findElementByCssSelector("a[title='Already a user? Sign in']").click();
		driver.findElementByCssSelector("input[id='login1']").sendKeys("Akshita");
		driver.findElementById("password").sendKeys("123");
		driver.quit();
	}
	

}
