package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovers {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//Mouse Hovers
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement Desktop=driver.findElement(By.linkText("Desktops"));
		WebElement Mac = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a"));
		
		Actions Act= new Actions(driver);

		Act.moveToElement(Desktop).moveToElement(Mac).click().perform();
		
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement Button = driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		
		Act.doubleClick(Button).perform();
		
		driver.switchTo().alert().accept();
		
		WebElement Rightclick= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Act.contextClick(Rightclick).perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
