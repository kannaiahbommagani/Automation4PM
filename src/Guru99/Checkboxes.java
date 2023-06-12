package Guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		List<WebElement> Chkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("Number of Chkbox:"+ Chkbox.size());
		
		//All Checkboxes
		/*for(int i=0; i<Chkbox.size(); i++)
		{
			Chkbox.get(i).click();
		}*/
		
		//Firsttwo Checkboxes
		
		/*for(int i=0;i<2;i++)
		{
			Chkbox.get(i).click();
		}*/
		
		
		//Last 2 select
		
		//Total Checkboxes - How many you want to select checkboxes= index
		//3-2=1
		for(int i=1; i<Chkbox.size();i++)
		{
			Chkbox.get(i).click();
		}
		
		
			
			System.out.println("Kannaiah");
		
		
		
		
	}

}
