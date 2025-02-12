package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class GoogleTitleTG {

	@Test
	public void compareTitle()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String acutalTitle=driver.getTitle();
		String expectedTitle = "google";

		//Assert
	Assert.assertEquals(acutalTitle, expectedTitle);
	//	Assert.assertEquals(expected, actual);
}
}