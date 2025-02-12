package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64_130\\chromedriver.exe");
	      WebDriver  driver= new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("https://demo.guru99.com/insurance/v1/register.php");
		   WebElement l1= driver.findElement(By.xpath("//select[@id='user_dateofbirth_2i']"));
		   Select s1= new Select(l1);
		  // s1.selectByIndex(4);
		 
//selecting option from dropdown without using select methods
		   
List<WebElement>alloptions= s1.getOptions();
for(WebElement option:alloptions)
{
	if(option.getText().equals("June"))
	{
		option.click();
		break;
	}
}
}
}
