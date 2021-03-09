package seleniumsample;

import org.openqa.selenium.chrome.ChromeDriver;

//validate whether the title of the page is correct or not
public class DemoAutomation1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\exe files\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");//to hit url on the browser
		System.out.println(driver.getTitle());//validate if page title is correct
		System.out.println(driver.getCurrentUrl());//validate if you are landed on correct url
		//System.out.println(driver.getPageSource());//to check some UI components can need page source,how to check page source if inspect is disabled
		
		driver.get("https://yahoo.com");
		driver.navigate().back();//for going to back page
		driver.navigate().forward();//for going to forward page
		driver.close();//it closes current browser
		driver.quit();//it closes all the browsers opened by selenium script(all child and parent window)
	}

}
