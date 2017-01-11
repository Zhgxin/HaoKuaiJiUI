package Page;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.support.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VoucherBasePage extends PageBase{
	//第一行
	@FindBy(xpath="//*[@id=\"chanjet_voucher_VoucherItem_4\"]/ul[3]/li[1]/ul[2]/textarea")
	public WebElement vouCher_1_1;
	@FindBy(xpath="//*[@id=\"chanjet_voucher_VoucherItem_4\"]/ul[3]/li[2]/ul[1]")
	public WebElement vouCher_1_2;
	@FindBy(xpath="//*[@id=\"chanjet_voucher_VoucherMoney_10\"]/ul[2]/input")
	public WebElement vouCher_1_3;
	@FindBy(xpath="//*[@id=\"chanjet_voucher_VoucherMoney_10\"]")
	public WebElement vouCher_1_3_1;
	
	//第二行
	@FindBy(xpath="//*[@id=\"chanjet_voucher_VoucherItem_5\"]/ul[3]/li[1]")
	public WebElement vouCher_2_1_1;
	@FindBy(xpath="//*[@id=\"chanjet_voucher_VoucherItem_5\"]/ul[3]/li[1]/ul[2]/textarea")
	public WebElement vouCher_2_1_2;
	@FindBy(xpath="//*[@id=\"chanjet_voucher_VoucherItem_5\"]/ul[3]/li[2]")
	public WebElement vouCher_2_3_1;
	@FindBy(xpath="//*[@id=\"chanjet_voucher_VoucherMoney_13\"]")
	public WebElement vouCher_2_4_1;
	@FindBy(xpath="//*[@id=\"chanjet_voucher_VoucherMoney_13\"]/ul[2]/input")
	public WebElement vouCher_2_4_2;
	
	public VoucherBasePage() throws IOException
	{
		PageFactory.initElements(_webDriver, this);
	}
	public void createVoucher(String point1,String course1,String num1,String point2,String course2,String num2)
	{
		
		//创建第一行
		vouCher_1_1.sendKeys(point1);
		vouCher_1_2.click();
		//获取科目
		List<WebElement> trelements = _webDriver.findElementsByXPath("//*[@id=\"chanjet_form_PopListBox_3\"]/ul[2]/li");
		
		for(int i=0;i<trelements.size();i++)
		{
			if(trelements.get(i).getText().contains(course1))
			{
				trelements.get(i).click();
				break;
			}
		}
		vouCher_1_3_1.click();
		vouCher_1_3.sendKeys(num1);
		//创建第二行
		vouCher_2_1_1.click();
		vouCher_2_1_2.sendKeys(point2);
		vouCher_2_3_1.click();
		List<WebElement> trelement = _webDriver.findElementsByXPath("//*[@id=\"chanjet_form_PopListBox_3\"]/ul[2]/li");
		for(int i=0;i<trelement.size();i++)
		{
			//System.out.print(trelements.get(i).getText());
			if(trelement.get(i).getText().contains(course2))
			{
				trelement.get(i).click();
				break;
			}
		}
		vouCher_2_4_1.click();
		vouCher_2_4_2.sendKeys(num2);
		
	}
	
}
