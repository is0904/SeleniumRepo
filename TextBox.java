package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
//		LeafGround Assignments
//		*
//		**Note : Kindly refer the video attached to do the following assignments
//		TextBox
//		=======
//		https://www.leafground.com/input.xhtml
		String url = "https://www.leafground.com/input.xhtml";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	    
//		1. Type your name
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Indhu");
//		2. Append Country to this City
		driver.findElement(By.xpath("//*[text()='Append Country to this City.']/following-sibling::div[1]/div/input")).sendKeys("Ontario");
//		3. Verify if text box is disabled
		WebElement textbox_disabled = driver.findElement(By.xpath("//*[text()='Verify if text box is disabled']/following-sibling::div[1]/div/input"));
		if(textbox_disabled.isEnabled()){
			System.out.println("textbox is enabled");
		}else {
			System.out.println("textbox is disabled");
		}
//		4. Clear the typed text
		driver.findElement(By.xpath("//*[text()='Clear the typed text.']/following-sibling::div[1]/div/input")).clear();
//		5. Retrieve the typed text
		String retrievedtext = driver.findElement(By.xpath("//*[text()='Retrieve the typed text.']/following-sibling::div[1]/div/input")).getText();
		System.out.println(retrievedtext);
//		6. Type email and Tab. Confirm control moved to next element
		WebElement textarea = driver.findElement(By.xpath("//*[text()='Type about yourself']/following-sibling::div[1]/div/textarea"));
		System.out.println(textarea.isSelected());
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
		email.sendKeys("indhu.browse@gmail.com");
		email.sendKeys(Keys.TAB);
		System.out.println(textarea.isSelected());
//		7. Type about yourself
	    textarea.sendKeys("I am learning in testleaf");
//		8. Text Editor
//		9. Just Press Enter and confirm error message*
	    String err_msg = "Age is mandatory";
	    driver.findElement(By.xpath("//*[text()='Just Press Enter and confirm error message*']/following-sibling::div/div[1]/input")).sendKeys(Keys.ENTER);

//	    String actualErrMsg = driver.findElement(By.xpath("//*[@class='ui-message-error-detail']")).getText();
//	    System.out.println();
//	    if (err_msg==actualErrMsg){
//	    	System.out.println("Expected error message");
//	      }else {
//	    	  System.out.println("Invalid error message");
//	      }
	    System.out.println(driver.findElement(By.xpath("//*[text()='Age is mandatory']")).isDisplayed());
	    
//		10. Click and Confirm Label Position Changes
	    
//		11. Type your name and choose the third option
//		12. Click and Confirm Keyboard appears
	    driver.findElement(By.xpath("//*[text()='Click and Confirm Keyboard appears']/following-sibling::input")).click();
	    boolean isKeyboardDisplayed = driver.findElement(By.xpath("//*[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isDisplayed();
        if (isKeyboardDisplayed) {
        	System.out.println("Keyboard is displayed");
        }else {
        	System.out.println("Keyboard is not displayed");
        
        }
        
//	    13. Custom Toolbar
//
//		Button
//		======
//		https://www.leafground.com/button.xhtml
//		1. Click and Confirm title
//		2. Confirm if the button is disabled
//		3. Find the position of the Submit button
//
//		DropDown
//		========
//		https://www.leafground.com/select.xhtml
//
//		Checkbox
//		=======
//		https://www.leafground.com/checkbox.xhtml
//
//		Radio
//		=====
//		https://www.leafground.com/radio.xhtml
//
	}

}
