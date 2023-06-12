package Guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maps {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://petdiseasealerts.org/forecast-map");
		
		
		String State= "California"; 
		
		//Nevada
		//Montana
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		List<WebElement> AllStates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement St:AllStates)
		{
			if(St.getText().equals(State))
			{
				St.click();
			}
		}
		
		
		
		
	}

}
