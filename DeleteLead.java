package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
 
//		Delete Lead:
//		1	Launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
//		2	Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
//		3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");;
//		4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
//		5	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
//		6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
//		7	Click Find leads
		driver.findElement(By.xpath("(//*[text()='Find Leads'])[1]")).click();
//		8	Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click(); 
//		9	Enter phone number
		driver.findElement(By.xpath("//*[@name='phoneNumber']")).sendKeys("1111111111");
//		10	Click find leads button
		driver.findElement(By.xpath("(//*[text()='Find Leads'])[3]")).click();
//		11	Capture lead ID of First Resulting lead
		String firstResultingLead = driver.findElement(By.xpath("//div[text()='1 1111111111']/../../td[1]/div/a")).getText();
//		12	Click First Resulting lead
		driver.findElement(By.xpath("//div[text()='1 1111111111']/../../td[1]/div/a")).click();
//		13	Click Delete
		driver.findElement(By.xpath("//*[text()='Delete']")).click();	
//		14	Click Find leads
		driver.findElement(By.xpath("(//*[text()='Find Leads'])[1]")).click();
//		15	Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstResultingLead);
//		16	Click find leads button
		driver.findElement(By.xpath("(//*[text()='Find Leads'])[3]")).click();
//		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
//		18	Close the browser (Do not log out)
		driver.close();

	}

}
