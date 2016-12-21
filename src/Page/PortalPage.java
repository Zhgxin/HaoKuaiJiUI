package Page;
import java.io.IOException;

import Utility.ElementCommonActions; 
import org.openqa.selenium.support.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class PortalPage extends PageBase{
	//红包/
	@FindBy(className="cjt_active_redClose")
	public WebElement the_red;
	
	//提示
	@FindBy(className="wec_close")
	public WebElement the_point;
	
	//消息
	@FindBy(xpath="//*[@id=\"app/vm/Header_0\"]/div[21]/div[1]/div[2]")
	public WebElement headTipClose;
//*********************************凭证参数**********************************
	//凭证
	@FindBy(xpath="//*[@id=\"vouchers\"]")
	public WebElement vouChers;
	
	//新增凭证
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_12\"]/div[1]/div/div/ul/li[1]/a")
	public WebElement newlyVoucher;
	
	//查看凭证
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_12\"]/div[1]/div/div/ul/li[2]/a")
	public WebElement lookVoucher;
	
	//凭证汇总表
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_12\"]/div[1]/div/div/ul/li[3]/a")
	public WebElement voucherTotal;
	
//*********************************报表参数**********************************
	//报表
	@FindBy(xpath="//*[@id=\"costReportManage\"]/a/span[1]")
	public WebElement setIcon_15;
	
	//资产负债表
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[1]/a")
	public WebElement property;
	
	//利润表
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[2]/a")
	public WebElement profit;
	
	//利润表季报
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[3]/a")
	public WebElement profits;
	
	//现金流量表
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[4]/a")
	public WebElement cash;
	
	//现金流量表季报
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[5]/a")
	public WebElement cashs;
	
	//应收统计表
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[6]/a")
	public WebElement receivable;
	
	//应付统计表
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[7]/a")
	public WebElement payable;
	
	//费用统计表
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[8]/a")
	public WebElement cost;
	
	//收支统计表
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[9]/a")
	public WebElement income;
	
	//纳税统计表
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[10]/a")
	public WebElement payduty;
	
	public PortalPage() throws IOException{
		PageFactory.initElements(_webDriver, this);
	}
	
//*****************************提示语函数***********************************
	//关闭红包
	public void CloseThered() throws InterruptedException{
		if(ElementCommonActions.WaitForElementPresent(the_red))
		the_red.click();
	}

	//关闭提示
	public void ClosePoint()throws InterruptedException{
		//Thread.sleep(2000);
		if(ElementCommonActions.WaitForElementPresent(the_point))
			ElementCommonActions.click_(the_point);
	}
	
	//关闭消息提示
	public void CloseTop() throws InterruptedException{	
		if(ElementCommonActions.WaitForElementPresent(headTipClose))
			ElementCommonActions.click_(headTipClose);
	}
//****************************凭证函数**********************************
	//新增凭证
	public void NewVoucher() throws InterruptedException
	{
		Thread.sleep(1000);
		if(ElementCommonActions.WaitForElementPresent(vouChers))
			vouChers.click();
		if(ElementCommonActions.WaitForElementPresent(newlyVoucher))
			newlyVoucher.click();
	}
	
	//查看凭证
	public void IntoVoucher() throws InterruptedException
	{
		Thread.sleep(1000);
		if(ElementCommonActions.WaitForElementPresent(vouChers))
			vouChers.click();
		if(ElementCommonActions.WaitForElementPresent(lookVoucher))
			lookVoucher.click();
	}
	
	//查看凭证总汇表
	public void IntoVouchertotal() throws InterruptedException
	{
		Thread.sleep(1000);
		if(ElementCommonActions.WaitForElementPresent(vouChers))
			vouChers.click();
		if(ElementCommonActions.WaitForElementPresent(voucherTotal))
			voucherTotal.click();
	}
	
//****************************报表函数**********************************
	//进入资产负债表
	public void IntoProperty() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(property))
			property.click();
	}
	
	//进入利润表
	public void Intoprofit() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(profit))
			profit.click();
	}
	
	//进入利润变季报
	public void Intoprofits() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(profits))
			profits.click();
	}
	
	//进入现金流量表
	public void Intocash() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(cash))
			cash.click();
	}
	
	//进入现金流量表季报
	public void Intocashs() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(cashs))
			cashs.click();
	}
	
	//进入应收统计表
	public void Intoreceivable() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(receivable))
			receivable.click();
	}
	
	//进入应付统计表
	public void Intopayable() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(payable))
			payable.click();
	}
	
	//进入费用统计表
	public void Intocost() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(cost))
			cost.click();
	}
	
	//收支统计表
	public void Intoincome() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(income))
			income.click();
	}
	
	//进入纳税统计表
	public void Intopayduty() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(payduty))
			payduty.click();
	}
}
