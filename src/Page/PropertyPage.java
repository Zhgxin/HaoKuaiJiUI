package Page;
import java.io.IOException;

import Utility.ElementCommonActions; 

import org.openqa.selenium.support.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class PropertyPage extends ReportBasePage{
	//选择分类
	@FindBy(xpath="//*[@id=\"nav_balanceSheet\"]/div[1]/div[1]/div[1]")
	public WebElement select;
	
	@FindBy(xpath="//*[@id=\"nav_balanceSheet\"]/div[1]/div[1]/div[2]/div/div[1]/ul/li[2]/a")
	public WebElement select_1;
	
	public PropertyPage() throws IOException{
		PageFactory.initElements(_webDriver, this);
	}
	//选择重分类
	public void select_echo() throws InterruptedException
	{
		Thread.sleep(2000);
		if(ElementCommonActions.WaitForElementPresent(select))
			ElementCommonActions.click_(select);
		if(ElementCommonActions.WaitForElementPresent(select_1))
			select_1.click();
	}
	
}
