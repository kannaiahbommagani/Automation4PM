package Guru99;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement From = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement To= driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
		Actions Act = new Actions(driver);
		
		Act.dragAndDrop(From, To).perform();
		
		
		
		
	}

}
