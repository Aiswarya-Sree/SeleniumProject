package elementrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
public void initilaisebrowser()
{
driver=new ChromeDriver();
driver.get("https://selenium.qabible.in/index.php");
driver.manage().window().maximize();
}
public void closequit()
{
	//driver.close();
	driver.quit();
}
	public static void main(String[] args) {

	Base obj= new Base();
	obj.initilaisebrowser();
	obj.closequit();
	}

}
