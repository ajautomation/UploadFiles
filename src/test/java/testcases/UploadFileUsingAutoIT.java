package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileUsingAutoIT {

	@Test
	public void UploadFileUsingAutoITTest() throws IOException, InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://resume.naukri.com/resume-quality-score?fftid=101003");
		
		driver.findElement(By.xpath("//span[@class='browse']")).click();
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\pandi\\Desktop\\FileUploadScript.exe");
		
	}
}
