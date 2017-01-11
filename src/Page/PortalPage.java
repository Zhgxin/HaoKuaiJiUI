package Page;
import java.io.IOException;

import java.util.List;

import Utility.ElementCommonActions; 

import org.openqa.selenium.support.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//首页Page
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
	
	//首页
	@FindBy(xpath="//*[@id=\"app/vm/Header_0\"]/div[2]/a")
	public WebElement reopen;

//******************************账套设置*************************************
	//选择账套
	@FindBy(xpath="//*[@id=\"app/vm/Header_0\"]/div[3]/div[2]")
	public WebElement books;
	
	//新建账套
	@FindBy(xpath="//*[@id=\"app/vm/Header_0\"]/div[4]")
	public WebElement newBooks;
	
	//账套名称//*[@id="chanjet_form_Text_3"]
	@FindBy(xpath="//*[@id=\"chanjet_form_Text_3\"]")
	public WebElement bookName;
	
	//选择月份
	@FindBy(xpath="//*[@id=\"createBookContent\"]/ul[6]/li[2]/div[2]/div[1]/div[1]")
	public WebElement upmonth;
	@FindBy(xpath="//*[@id=\"createBookContent\"]/ul[6]/li[2]/div[2]/div[1]/div[2]")
	public WebElement downmonth;
	
	//选择会计制度
	@FindBy(xpath="//*[@id=\"createBookContent\"]/ul[10]/li[2]/table/tbody/tr")
	public WebElement institution;
	
	//2013会计制度
	@FindBy(xpath="//*[@id=\"dijit_MenuItem_0\"]")
	public WebElement itt2013;
	
	//2007会计制度
	@FindBy(xpath="//*[@id=\"dijit_MenuItem_1\"]")
	public WebElement itt2007;
	
	//民非制度
	@FindBy(xpath="//*[@id=\"dijit_MenuItem_2\"]")
	public WebElement ittMF;
	
	//保存
	@FindBy(xpath="//*[@id=\"createBookContent\"]/ul[12]/li[3]/div[2]")
	public WebElement svbook;
	
	//取消
	@FindBy(xpath="//*[@id=\"createBookContent\"]/ul[12]/li[3]/div[1]")
	public WebElement cancel;

//*********************************设置**********************************
	//设置
	@FindBy(xpath="//*[@id=\"app/vm/Header_0\"]/div[5]")
	public WebElement setup;
	
	//科目期初
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_1\"]/div[1]/div/div/ul/li[1]/a")
	public WebElement subjectbg;
	
	//辅助核算
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_1\"]/div[1]/div/div/ul/li[2]/a")
	public WebElement assist;
	
	//账号管理
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_1\"]/div[1]/div/div/ul/li[3]/a")
	public WebElement amanage;
	
	//归档管理
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_1\"]/div[1]/div/div/ul/li[4]/a")
	public WebElement pmanage;
	
	//账套导入
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_1\"]/div[1]/div/div/ul/li[5]/a")
	public WebElement imanage;
	
	//用户管理
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_1\"]/div[1]/div/div/ul/li[6]/a")
	public WebElement umanage;
//*********************************账簿参数**********************************
	//账簿
	@FindBy(xpath="//*[@id=\"costReport\"]")
	public WebElement book;
	
	//总账
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_9\"]/div[1]/div/div/ul/li[1]/a")
	public WebElement allbook;
	
	//明细账
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_9\"]/div[1]/div/div/ul/li[2]/a")
	public WebElement detailbook;
	
	//余额表
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_9\"]/div[1]/div/div/ul/li[3]/a")
	public WebElement balancetable;
	
	//辅助核算明细账
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_9\"]/div[1]/div/div/ul/li[4]/a")
	public WebElement assistbook;
	
	//辅助核算余额表
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_9\"]/div[1]/div/div/ul/li[5]/a")
	public WebElement assistbalance;
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
	
	//选择账套
	public void ChooseBooks(int index){
		int num = index-1;
		ElementCommonActions.click_(books);
		List <WebElement> bookelements = _webDriver.findElementsByXPath("//*[@id=\"common_form_HeaderMenu_0\"]/div[1]/div/div/ul/li");
		bookelements.get(num).click();
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
	
	//返回首页
	public void Reopen() throws InterruptedException{
		Thread.sleep(1000);
		reopen.click();
	}
//****************************设置函数**********************************
	public void SetUp(){
		if(ElementCommonActions.WaitForElementPresent(setup))
			ElementCommonActions.click_(setup);
	}
	//科目初期
	public void Subjectbg(){
		if(ElementCommonActions.WaitForElementPresent(subjectbg))
			ElementCommonActions.click_(subjectbg);
	}
	
	//辅助核算
	public void Assist(){
		if(ElementCommonActions.WaitForElementPresent(assist))
			assist.click();
	}
	
	//账套管理
	public void Amanage(){
		if(ElementCommonActions.WaitForElementPresent(amanage))
			amanage.click();
	}
	
	//归档管理
	public void Pmanage(){
		if(ElementCommonActions.WaitForElementPresent(pmanage))
			pmanage.click();
	}
	//账套导入
	public void Imanage(){
		if(ElementCommonActions.WaitForElementPresent(imanage))
			imanage.click();
	}
	//用户管理
	public void Umanage(){
		if(ElementCommonActions.WaitForElementPresent(umanage))
			umanage.click();
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
//***************************账簿函数**********************************
	public void IntoBook()throws InterruptedException{
		Thread.sleep(1000);
		if(ElementCommonActions.WaitForElementPresent(book))
			book.click();
	}
	
	//总账
	public void IntoAllbook()throws InterruptedException{
		if(ElementCommonActions.WaitForElementPresent(allbook))
			allbook.click();
		Thread.sleep(1000);
	}
	
	//明细账
	public void IntoDetailbook(){
		if(ElementCommonActions.WaitForElementPresent(detailbook))
			detailbook.click();
	}
	
	//余额表
	public void IntoBanlance(){
		if(ElementCommonActions.WaitForElementPresent(balancetable))
			balancetable.click();
	}
	
	//辅助核算明细账
	public void IntoAssistbook(){
		if(ElementCommonActions.WaitForElementPresent(assistbook))
			assistbook.click();
	}
	
	//辅助核算余额表
	public void IntoAssistbalance(){
		if(ElementCommonActions.WaitForElementPresent(assistbalance))
			assistbalance.click();
	}
//***************************选择账套函数*******************************
	public void NewBooks(String name)throws InterruptedException{
		Thread.sleep(1000);
		if(ElementCommonActions.WaitForElementPresent(newBooks))
			newBooks.click();
		bookName.sendKeys(name);
	}
	//选择账套月份
	public void ChooseMouth(int num){
		int index = num-1;
		for(int i=0;i<12;i++){
			downmonth.click();
		}
		for(int i=0;i<index;i++){
			upmonth.click();
		}

	}
	//选择会计准则
	public void ChooseInstitution(){
		if(ElementCommonActions.WaitForElementPresent(institution))
			institution.click();
		
	}
	
	public void Choose2013(){
		if(ElementCommonActions.WaitForElementPresent(itt2013))
			itt2013.click();
	}
	
	public void Choose2007(){
		if(ElementCommonActions.WaitForElementPresent(itt2007))
			itt2013.click();
	}
	
	public void ChooseMF(){
		if(ElementCommonActions.WaitForElementPresent(ittMF))
			ittMF.click();
	}
	
	//保存
	public void SvBook(){
		if(ElementCommonActions.WaitForElementPresent(svbook))
			svbook.click();
	}
	
	//取消
	public void Cancel(){
		if(ElementCommonActions.WaitForElementPresent(cancel))
			cancel.click();
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
