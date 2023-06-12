package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
			
		driver.get("https://text-compare.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("text1")).sendKeys("Welcome to selenium" + Keys.ENTER+"Kannaiah");
		
		Actions Act= new Actions(driver);
		
		Act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		Act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		Act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		
		
		
		
	}

}
