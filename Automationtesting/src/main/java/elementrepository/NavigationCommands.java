package elementrepository;

public class NavigationCommands extends Base {
public void navigates()
{
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
	public static void main(String[] args) {
		NavigationCommands obj= new NavigationCommands();
		obj.initilaisebrowser();
		obj.navigates();
		

	}

}
