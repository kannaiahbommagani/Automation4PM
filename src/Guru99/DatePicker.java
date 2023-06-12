package Guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://jqueryui.com/datepicker/");
			
			driver.switchTo().frame(0);
			
			driver.findElement(By.id("datepicker")).click();
			
			String Year="2022";
			String Month="February";
			String date="16";
			
			//Select Month & Year
			while(true)
			{
				String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				String YR=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				if(mon.equals(Month) && YR.equals(Year))
				{
					break;
				}
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				
			}
			List<WebElement> Alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			
			for(WebElement dt:Alldates)
			{
				if(dt.getText().equals(date))
				{
					dt.click();
				}
			}
			
			
			
			
			
			
			
			
			
		
		
	}

}
