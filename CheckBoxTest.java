package seleniumsample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class CheckBoxTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\exe files\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement checkbox= driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
		Thread.sleep(3000);
		checkbox.click();
		System.out.println(checkbox.isSelected());
		//print the number of checkboxes in the page
		//input[type='checkbox']->find out common locator for all the checkbox-> .size()- for count of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.quit();
		
	}

}
