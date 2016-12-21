package Page;
import java.io.IOException;

import Utility.AppConfigure;

import org.openqa.selenium.support.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
	AppConfigure config = new AppConfigure("BaseConfig.Properties");
	
	//ÕËºÅ
	String user = config.getString("userName");
	
	//ÃÜÂë
	String pswd = config.getString("password");
	
	//»î¶¯//*[@id="dm_course"]/div
	@FindBy(xpath="//*[@id=\"dm_course\"]/div")
	public WebElement  dm_course;
	
	//µÇÂ½button
	@FindBy(id="loginBtnId")
	public WebElement  loginBtnLink;
	
	//ÕËºÅ
	@FindBy(id="ChanjetloginNameInput")
	public WebElement  userName;
	
	//ÃÜÂë
	@FindBy(id="ChanjetloginPwdInput")
	public WebElement  password;
	
	//µÇÂ½
	@FindBy(id="loginBtn")
	public WebElement  loginBtn;
	
	public LoginPage() throws IOException{  
	    PageFactory.initElements(_webDriver, this);  
	}
	
	public void DoLogin() throws InterruptedException{

		Thread.sleep(1000);
		dm_course.click();
		loginBtnLink.click();
		Thread.sleep(1000);
		userName.sendKeys(user);
		password.sendKeys(pswd);
		loginBtn.click();
	}
}
