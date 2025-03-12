package Locators;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Browser.browser;

public class page1Objects extends browser {
	public page1Objects()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="username")
	public WebElement username;
	
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(css="[type=\"submit\"]")
	public WebElement loginButton;
	

}