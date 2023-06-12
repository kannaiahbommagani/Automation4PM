package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement Frame3 = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		
		driver.switchTo().frame(Frame3);
		driver.findElement(By.name("mytext3")).sendKeys("Kannaiah");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
	}

}
