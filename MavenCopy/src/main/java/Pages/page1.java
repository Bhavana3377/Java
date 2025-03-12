package Pages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.browser;
import Locators.page1Objects;
import ScreenShot.capture;

public class page1 extends browser {
	static page1Objects obj;
	public static void userNameEnter(String data) throws InterruptedException
	{
		//Thread.sleep(2000);
		obj= PageFactory.initElements(driver, page1Objects.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("username"))));
		obj.username.sendKeys(data);	
	}
	
	public static void passwordEnter(String data) throws InterruptedException
	{
		
		obj.password.sendKeys(data);
	}
	public static void clickOnLogin() throws InterruptedException
	{
		obj.loginButton.click();
	}
	
	public static String Title() throws Exception
	{
		return driver.getTitle();
	}
}






