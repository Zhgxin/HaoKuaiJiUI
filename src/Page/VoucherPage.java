package Page;

import java.util.List;
import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VoucherPage extends VoucherBasePage{
	//保存
	@FindBy(xpath="//*[@id=\"nav_pingzheng\"]/div[2]/div[4]/ul/li[2]")
	public WebElement serveVoucher;
	
	//保存并新增
	@FindBy(xpath="//*[@id=\"nav_pingzheng\"]/div[2]/div[4]/ul/li[3]")
	public WebElement newserveVoucher;
	
	//模板
	@FindBy(xpath="//*[@id=\"nav_pingzheng\"]/div[2]/div[4]/ul/li[1]/div")
	public WebElement mould;
	
	//日期
	@FindBy(xpath="//*[@id=\"chanjet_form_Date_0\"]")
	public WebElement voucherdate;
	
	public VoucherPage() throws IOException
	{
		PageFactory.initElements(_webDriver, this);
	}
	
	//模板方法
	public void mouLd(String name){
		Actions actions =new Actions(_webDriver);
		actions.moveToElement(mould).build().perform();
		List<WebElement> element = _webDriver.findElements(By.xpath("//*[@id=\"nav_pingzheng\"]/div[2]/div[4]/ul/li[1]/ul/li"));
		for(int i=0;i<element.size();i++){
			if(element.get(i).getText().contains(name))
				element.get(i).click();
		}
	}
	//保存
	public void sv(){
		serveVoucher.click();
	}

}
