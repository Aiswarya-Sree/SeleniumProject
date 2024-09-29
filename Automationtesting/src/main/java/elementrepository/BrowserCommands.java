package elementrepository;

public class BrowserCommands extends Base {

	public void browsercommand()
	{
		String title=driver.getTitle();
		System.out.println("the title of web page is " +title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}
	
	public static void main(String[] args) {
		
		BrowserCommands obj=new BrowserCommands();
		obj.initilaisebrowser();
		obj.browsercommand();
	}

}
