package seleniumsample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\exe files\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//dropdown with select tag- static 
		//in the url the code is for currency static dropdown5
		WebElement staticDropdown = driver.findElementById("ctl00_mainContent_DropDownListCurrency");
		//id we have Select tag in inspect then only below options will work
		Select dropdown = new Select(staticDropdown);//to call any class we always create object of the class(here dropdown)
		dropdown.selectByIndex(3);//to select 3rd dropdown- by index no - in UI
		System.out.println(dropdown.getFirstSelectedOption().getText());//it will see the first selected web element and will give the text
		dropdown.selectByVisibleText("AED");//another way of selecting any dropdown - by visible text- in UI
		System.out.println(dropdown.getFirstSelectedOption().getText());//to print the selected option
		dropdown.selectByValue("INR");//another way of selecting dropdown- by value- in inspect to check
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//to click passenger dropdown
		driver.findElementById("divpaxinfo").click();
		Thread.sleep(2000);
		//driver.findElementById("hrefIncAdt").click();//if you select 1 adult this is fine but for selecting more than 1 or 10 or 20 etc adults we can use while loop/for loop
		//if we want 5 adult passengers we need to add we can use while loop/for loop
		//for(int i=1;i<5;i++)
		System.out.println(driver.findElementById("divpaxinfo").getText());//to grab the text present in passenger before loop
		int i=1;
		while(i<5)
		{
			driver.findElementById("hrefIncAdt").click();//5 times
			i++;
		}
		
		driver.findElementById("btnclosepaxoption").click();
		
		System.out.println(driver.findElementById("divpaxinfo").getText());//to grab the text present in passenger after loop
		driver.quit();
	}

}
