package seleniumsample;

import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\exe files\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElementById("ctl00_mainContent_ddl_originStation1_CTXT").click();
		driver.findElementByXPath("//a[@value='DEL']").click();
		Thread.sleep(1000);
		//driver.findElementByXPath("(//a[@value='PNY'])[2]").click();
		//another way is by parent/child travel mechanism xpath
		driver.findElementByXPath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNY']").click();
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
