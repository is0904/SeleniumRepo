package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead2 {

	public static void main(String[] args) {
	
//		* 1	Launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
//		* 2	Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
//		* 3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		* 4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
//		* 5	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
//		* 6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
//		* 7	Click Find leads
		driver.findElement(By.xpath("//*[text()='Find Leads']")).click();
//		* 8	Enter first name
		driver.findElement(By.xpath("(//*[@name='firstName'])[3]")).sendKeys("Indhu");
		driver.findElement(By.xpath("(//*[@name='lastName'])[3]")).sendKeys("sundar");
//		* 9	Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//		* 10 Click on first resulting lead
		driver.findElement(By.xpath("(//div/a[text()='Indhu'])[1]")).click();
//		* 11 Verify title of the page
		String currentPageTitle = driver.getTitle();
		if(currentPageTitle.contains("View Lead")) {
			System.out.println("Expected page title is displayed");
		}else {
			System.out.println("Expected page title is not displayed");
		}
//		* 12 Click Edit
		driver.findElement(By.xpath("//*[text()='Edit']")).click();
		String newCompanyName = "updated company name";
//		* 13 Change the company name
		WebElement updateCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));
		updateCompanyName.clear();
		updateCompanyName.sendKeys(newCompanyName);
//		* 14 Click Update
		driver.findElement(By.xpath("//input[@type='submit' and @value='Update']")).click();
//		* 15 Confirm the changed name appears

		String currentCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(currentCompanyName.contains("newCompanyName")){
			System.out.println("updated company name is confirmed");
		}else {
			System.out.println("updated company name is not confirmed");
		}
		
//		* 16 Close the browser (Do not log out)
		driver.close();
	}

}
