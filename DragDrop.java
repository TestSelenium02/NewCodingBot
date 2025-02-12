package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64_130\\chromedriver.exe");
      WebDriver  driver= new ChromeDriver();
       driver.get("https://jqueryui.com/droppable/");
       
     List<WebElement> l1 =driver.findElements(By.tagName("iframe"));
System.out.println(l1.size());

driver.switchTo().frame(0);

WebElement source =driver.findElement(By.xpath("//div[@id='draggable']"));

WebElement destination =driver.findElement(By.xpath("//div[@id='droppable']"));

Actions act = new Actions(driver);
act.dragAndDrop(source, destination).build().perform();

	}

}
