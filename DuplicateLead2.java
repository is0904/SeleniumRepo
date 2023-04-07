package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead2 {

	public static void main(String[] args) {
//	1	Launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
//		2	Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
//		3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
//		5	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
//		6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
//		7	Click Find leads
		driver.findElement(By.xpath("(//*[text()='Find Leads'])[1]")).click();
//		8	Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
//		9	Enter Email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("indhu.browse@gmail.com");
//		10	Click find leads button
		driver.findElement(By.xpath("(//*[text()='Find Leads'])[3]")).click();
//		11	Capture name of First Resulting lead
		String firstResultingLeadName = driver.findElement(By.xpath("(//div[text()='indhu.browse@gmail.com']/../..)[1]/td[3]")).getText();
//		12	Click First Resulting lead
		driver.findElement(By.xpath("(//div[text()='indhu.browse@gmail.com']/../..)[1]/td[3]")).click();
//		13	Click Duplicate Lead
		driver.findElement(By.xpath("//a[@class='subMenuButton' and text()='Duplicate Lead']")).click();
//		14	Verify the title as 'Duplicate Lead'
		String currentTitle = driver.getTitle();
		if (currentTitle.contains("Duplicate Lead")) {
			System.out.println("Duplicate lead page is displayed");
		}
//		15	Click Create Lead
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
//		16	Confirm the duplicated lead name is same as captured name
		String duplicateLeadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(duplicateLeadName==firstResultingLeadName) {
			System.out.println("duplicated lead name is same as captured name");
		}else {
			System.out.println("duplicated lead name is not same as captured name");
		}
//		17	Close the browser (Do not log out)
		driver.close();
	
	}

}
