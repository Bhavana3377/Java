package Locators;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Browser.browser;
public class page2Objects extends browser {
	public page2Objects()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindAll(@FindBy(css="[class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]"))
	public List<WebElement> list;  
	
	@FindBy(css="[class=\"oxd-userdropdown-name\"]")
	@CacheLookup
	public WebElement dashboardelement;
	

	

}
