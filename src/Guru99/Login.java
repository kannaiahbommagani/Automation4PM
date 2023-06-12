package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/V4/");  ///Done
		
		driver.findElement(By.name("uid")).sendKeys("mngr489901");
		driver.findElement(By.name("password")).sendKeys("gubuqys");
		driver.findElement(By.name("btnLogin")).click();
		
		String Exp_Text = "Welcome To Manager's Page of Guru99 Bank";
		WebElement Act_Text = driver.findElement(By.className("heading3"));
		
		if(Act_Text.getText().equals(Exp_Text))
		{
			System.out.println("Text is matching");
		}
		else {
			System.out.println("Text not Matching");
		}
		
		
		if(false)
		{
			System.out.println("Ok");
		}
		else {
			System.out.println("No");
		}
		
		

	}

}
