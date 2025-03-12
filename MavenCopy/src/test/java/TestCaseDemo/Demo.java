package TestCaseDemo;
import Browser.browser;
import Pages.page1;
import Pages.page2;
import ScreenShot.capture;
public class Demo {

	public static void main(String[] args) throws Exception {
		browser.openBrowser();
		browser.navigateToUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		page1.userNameEnter("Admin");
		capture.screenShot("username");
		page1.passwordEnter("admin123");
		page1.clickOnLogin();

		if(page1.Title().equals("OrangeHRM"))
		{
			System.out.println("Title matched with expected");
		}
		else
		{
			System.out.println("Title is not matched with expected");
		}
		browser.closeBrowser();

		browser.openBrowser();
		browser.navigateToUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		page1.userNameEnter("Admin");
		capture.screenShot("username");
		page1.passwordEnter("admin123");
		page1.clickOnLogin();
	
		if(page2.Username().equals("manda User"))
		{
			System.out.println("user matched with expected");
		}
		else
		{
			System.out.println("login user namepage2: "+page2.Username());
		}
		page2.optionclick("Time");
		browser.closeBrowser();
	}
}