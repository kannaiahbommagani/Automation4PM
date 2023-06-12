package Guru99;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demo.guru99.com/v4");
		
		TakesScreenshot TS= (TakesScreenshot)driver;
		
		File Loginpage=TS.getScreenshotAs(OutputType.FILE);
		
		File LoginTrg = new File("C:\\Users\\kanna\\eclipse-workspace\\Automation4PM\\ScreenShots\\Login.png");
		
		FileUtils.copyFile(Loginpage,LoginTrg);
		
		
		WebElement ikon= driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]"));
		
		File Ikon1=ikon.getScreenshotAs(OutputType.FILE);
		File IkonTrg = new File("C:\\Users\\kanna\\eclipse-workspace\\Automation4PM\\ScreenShots\\Bug.png");
		
		FileUtils.copyFile(Ikon1,IkonTrg);
		
		
		
		
		
	}

}
