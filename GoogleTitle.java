package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class GoogleTitle {
	@Test
	public void compareTitle()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64_130\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String acutalTitle=driver.getTitle();
		
		String expectedTitle = "Google";

		
		//Assert.assertEquals(expected, actual);
		Assert.assertEquals(acutalTitle, expectedTitle);
		
	}

}