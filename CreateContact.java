package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
//		 * //Pseudo Code

//		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver = new ChromeDriver();
		try {
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();

//			 * 2. Enter UserName and Password Using Id Locator
			driver.findElement(By.id("username")).sendKeys("demosalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");

//			 * 3. Click on Login Button using Class Locator
			driver.findElement(By.className("decorativeSubmit")).click();

//			 * 4. Click on CRM/SFA Link
			driver.findElement(By.linkText("CRM/SFA")).click();
			
//			 * 5. Click on contacts Button
			driver.findElement(By.xpath("//*[text()='Contacts']")).click();

//			 * 6. Click on Create Contact
			driver.findElement(By.xpath("//*[text()='Create Contact']")).click();

//			 * 7. Enter FirstName Field Using id Locator
			driver.findElement(By.xpath("//*[@id='firstNameField']")).sendKeys("Indhu");

//			 * 8. Enter LastName Field Using id Locator
			driver.findElement(By.xpath("//*[@id='lastNameField']")).sendKeys("sundar");

//			 * 9. Enter FirstName(Local) Field Using id Locator
			driver.findElement(By.xpath("//*[@id='createContactForm_firstNameLocal']")).sendKeys("i");

//			 * 10. Enter LastName(Local) Field Using id Locator
			driver.findElement(By.xpath("//*[@id='createContactForm_lastNameLocal']")).sendKeys("s");
//			 * 
//			 * 11. Enter Department Field Using any Locator of Your Choice
			driver.findElement(By.xpath("//*[@id='createContactForm_departmentName']")).sendKeys("it");

//			 * 12. Enter Description Field Using any Locator of your choice 
			WebElement description = driver.findElement(By.xpath("//*[@id='createContactForm_description']"));
			description.sendKeys("happy learning");
			
//			 * 13. Enter your email in the E-mail address Field using the locator of your choice
			driver.findElement(By.xpath("//*[@id='createContactForm_primaryEmail']")).sendKeys("indhu.browse@gmail.com");

//			 * 14. Select State/Province as NewYork Using Visible Text
			Select dd = new Select(driver.findElement(By.xpath("//*[@id='createContactForm_generalStateProvinceGeoId']")));
			dd.selectByVisibleText("New York");

//			 * 15. Click on Create Contact
			driver.findElement(By.xpath("//*[@value='Create Contact']")).click();

//			 * 16. Click on edit button 
			driver.findElement(By.xpath("//*[text()='Edit']")).click();
			
//			 * 17. Clear the Description Field using .clear
			WebElement editDescription = driver.findElement(By.xpath("//*[@id='updateContactForm_description']"));
			editDescription.clear();

//			 * 18. Fill ImportantNote Field with Any text
			driver.findElement(By.xpath("//*[@id='updateContactForm_importantNote']")).sendKeys("hello testleaf");

//			 * 19. Click on update button using Xpath locator
			driver.findElement(By.xpath("(//td/input)[9]")).click();

//			 * 20. Get the Title of Resulting Page
			String title = driver.getTitle();
			System.out.println(title);

		}catch(Exception e) {
			System.out.println(e);
		}
	}	

}
