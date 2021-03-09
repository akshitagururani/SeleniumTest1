package seleniumsample;
import org.openqa.selenium.By;	
import org.openqa.selenium.chrome.ChromeDriver;


public class facebookprogram {
	
	    public static void main(String[] args) throws InterruptedException {
	    	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\exe files\\chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
	        
	        
			driver.get("https://www.facebook.com");
	        
	        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	        driver.findElement(By.id("pass")).sendKeys("aks");
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        driver.findElement(By.linkText("Forgotten password?")).click();
	      //  Thread.sleep(2000);
	     //   driver.close();
	       // System.exit(0);
	}
	}
