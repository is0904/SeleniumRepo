package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// Step 1: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();

		try {
			
			
			// Step 2: Load the URL https://en-gb.facebook.com/
			driver.get("https://en-gb.facebook.com/");
			
			// Step 3: Maximise the window
			driver.manage().window().maximize();
			
			// Step 4: Add implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			// Step 5: Click on Create New Account button
			driver.findElement(By.xpath("//*[text()='Create new account']")).click();
			
			// Step 6: Enter the first name
			driver.findElement(By.xpath("//*[@placeholder='First name']")).sendKeys("Indhu");
			
			// Step 7: Enter the last name
			driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("sundar");
			
			// Step 8: Enter the mobile number
			driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("7845578422");
			
			// Step 9: Enterthe password
			driver.findElement(By.xpath("//*[@id='password_step_input']")).sendKeys("welcome@123");
			
			// Step 10: Handle all the three drop downs
			Select day=new Select (driver.findElement(By.xpath("//*[@id='day']")));
			day.selectByIndex(8);
			Select month=new Select (driver.findElement(By.xpath("//*[@id='month']")));
			month.selectByVisibleText("Apr");
			Select year=new Select (driver.findElement(By.xpath("//*[@id='year']")));
			year.selectByValue("1996");
			
			// Step 11: Select the radio button "Female" 
			// ( A normal click will do for this step) 
			driver.findElement(By.xpath("//*[@name='sex']")).click();
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			driver.quit();
		}
		
		
		

	}

}
