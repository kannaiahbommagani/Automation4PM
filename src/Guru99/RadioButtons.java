package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		//driver.findElement(By.id("vfb-7-3")).click();
		
		WebElement Radio1 = driver.findElement(By.xpath("//*[@id=\"vfb-7-1\"]"));
		WebElement Radio2 = driver.findElement(By.xpath("//*[@id=\"vfb-7-2\"]"));
		WebElement Radio3=driver.findElement(By.xpath("//input[@id='vfb-7-3']"));
		
		
		Radio2.click();
		
		

	}

}
