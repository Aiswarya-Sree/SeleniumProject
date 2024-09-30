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
		WebElement message4 = driver.findElement(By.id("validationCustomUsername"));
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
	
	public void locating_by_name()
	{
	
		WebElement message = driver.findElement(By.name("viewport"));
		
	}
	
	public void locating_by_linktext()
	{
		WebElement message = driver.findElement(By.linkText("check-box-demo.php"));
	}
	
	public void locating_by_partiallinktext()
	{
	
		WebElement message= driver.findElement(By.partialLinkText("simple-form"));
	}
	
	//CSS SELECTOR
	
	public void tag_id()  //tag & ID - syntax tag#id
	{
		WebElement message =driver.findElement(By.cssSelector("input#single-input-field"));
	}
	
	public void tag_class() //tag & class - syntax tag.class
	{
		WebElement messgae = driver.findElement(By.cssSelector("input.form-check-input"));
	}
	public void tag_attribute() //tag & attribute -syntax tag[attribute=value]
	{
		WebElement message = driver.findElement(By.cssSelector("input[placeholder=State]"));
		
	}
	
	public void tag_class_attribute() // tag & class & attribute -syntax tag.classname[attribute=value]
	{
		WebElement message = driver.findElement(By.cssSelector("input.form-control[placeholder=State]"));
	}
	public static void main(String[] args) {
		

	}

}
