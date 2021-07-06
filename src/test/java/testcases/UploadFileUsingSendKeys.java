package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileUsingSendKeys {

	@Test
	public void UploadFileUsingSendKeysTest() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\pandi\\Pictures\\Screenshots\\maven  9.jpg");
		driver.findElement(By.xpath("//span[text()='Start upload']")).click();
	}
}
