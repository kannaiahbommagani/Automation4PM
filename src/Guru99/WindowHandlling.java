package Guru99;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandlling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Selenium")).click();
		
		driver.findElement(By.linkText("Selenium in biology")).click();
		
		Set<String> WindowID=driver.getWindowHandles();
		
		for(String Win:WindowID)
		{
			String title=driver.switchTo().window(Win).getTitle();
			if(title.equals("Selenium in biology - Wikipedia"))
			{
				driver.findElement(By.linkText("Talk")).click();
				driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table/tbody/tr[2]/td/table[1]/tbody/tr[1]/th/button/span")).click();
				}
			Thread.sleep(5000);
			if(title.equals("Selenium - Wikipedia"))
			{
			driver.findElement(By.id("p-lang-btn-checkbox")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("हिन्दी")).click();
			}
		}		
	}

}
