package Guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		
		Select Title = new Select(driver.findElement(By.name("title")));
		
		//Title.selectByIndex(4);
		//Title.selectByValue("Doctor");
		Title.selectByVisibleText("Father");
		
		//Index
		//Value
		//VisibleText
		
		Select Year = new Select(driver.findElement(By.name("year")));
		
		Year.selectByValue("1939");
		
		
		List<WebElement> options = Year.getOptions();
		
		System.out.println("Total Options:"+options.size());
		
		for (int i=0; i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
