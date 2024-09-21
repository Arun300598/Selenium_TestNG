package AbhiBus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbhiBus {
	
	private WebDriver driver;
	@Test
	
	public void checkTitle()
	
	{
		// Automatically manage the ChromeDriver
		
		String givenTitle="Book Bus Tickets Online at Lowest Fare, Upto ₹350 Cashback On Bus Booking | AbhiBus";
        WebDriverManager.chromedriver().setup();
        
        // Initialize the ChromeDriver
        driver = new ChromeDriver();
        
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        
        String title=driver.getTitle();
        System.out.print(title);
        
        Assert.assertEquals(title, givenTitle);
        
        driver.quit();
	}

}
