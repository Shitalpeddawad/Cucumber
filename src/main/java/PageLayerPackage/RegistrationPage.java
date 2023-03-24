package PageLayerPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayerPackage.BaseClass;

public class RegistrationPage extends BaseClass
{
	@FindBy(name="firstname")
	WebElement fn;

	@FindBy(name="lasttname")
	WebElement ln;
	
	@FindBy(name="reg_email__")
	WebElement mb;
	
	@FindBy(name="reg_passwd__")
	WebElement pwd;
	
	public  RegistrationPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void register(String firstname,String lastname,String emailid,String password)
	{
		fn.sendKeys(firstname);
		ln.sendKeys(lastname);
		mb.sendKeys(emailid);
		pwd.sendKeys(password);
	}
	
	
	
	
	


}
