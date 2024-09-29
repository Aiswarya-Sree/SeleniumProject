package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locating_by_id()
	{
		WebElement message = driver.findElement(By.id("single-input-field"));
		WebElement message1 = driver.findElement(By.id("inlineRadio22"));
		WebElement message2 = driver.findElement(By.id("inlineRadio23"));
		WebElement message3 = driver.findElement(By.id("single-input-field"));
		WebElement message4 = driver.findElement(By.id("validationCustomUsername"));)
	}
/*webelement is interfce
	findelement=is method
	by=class
    id is method */
	
	public void locating_by_class()
	{
		WebElement message = driver.findElement(By.className("form-check-input"));
		WebElement message1 = driver.findElement(By.className("btn btn-primary"));
		WebElement message2 = driver.findElement(By.className("form-control datepicker"));
		WebElement message3 = driver.findElement(By.className("ui-button ui-corner-all ui-widget"));
		WebElement message4 = driver.findElement(By.className("w25 fleft"));
		
		
	}
	
	
	public static void main(String[] args) {
		

	}

}
