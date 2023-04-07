package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("(//input[@id='username']")).sendKeys("demoSalesManager");
//		driver.findElement(By.xpath("(//input[@id='password']")).sendKeys("crmsfa");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("(//input[@class='decorativeSubmit'])")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.xpath("(//a[text()='Leads']")).click();
		}

}
