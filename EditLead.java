package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
	
		
//		Assignment 2:Edit Lead

//		  1. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
//		  2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		  3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
//		  4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
//		  5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
//		  6. Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
//		  7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test leaf");
//		  8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Indhu");
//		  9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sundar");
//		  10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("is");
//		  11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("it");
//		  12. Enter Description Field Using any Locator of your choice 
		WebElement createDescription = driver.findElement(By.id("createLeadForm_description"));
		createDescription.sendKeys("happy learning");
//		  13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("indhu.browse@gmail.com");
//		  14. Select State/Province as NewYork Using Visible Text
		Select dd = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		dd.selectByVisibleText("New York");
//		  15. Click on Create Button
		driver.findElement(By.xpath("//*[@value='Create Lead']")).click();
//      16. Click on edit button
		driver.findElement(By.xpath("//*[text()='Edit']")).click();
//      17. Clear the Description Field using .clear()
		WebElement updateDescription = driver.findElement(By.id("updateLeadForm_description"));
		updateDescription.clear();
//		  18. Fill ImportantNote Field with Any text
		driver.findElement(By.xpath("//*[@id='updateLeadForm_importantNote']")).sendKeys("hello testleaf");
//		  19. Click on update button 
		driver.findElement(By.xpath("//*[@value='Update']")).click();
//		  20. Get the Title of Resulting Page. refer the video  using driver.getTitle()
		String title = driver.getTitle();
		System.out.println(title);

	}

}
