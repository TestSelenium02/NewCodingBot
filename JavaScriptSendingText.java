package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSendingText {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64_130\\chromedriver.exe");
	     driver= new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");

	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('login-username').value='Selenium'");

	}

}
