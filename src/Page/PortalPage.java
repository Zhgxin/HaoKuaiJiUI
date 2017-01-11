package Page;
import java.io.IOException;

import java.util.List;

import Utility.ElementCommonActions; 

import org.openqa.selenium.support.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//��ҳPage
public class PortalPage extends PageBase{
	//���/
	@FindBy(className="cjt_active_redClose")
	public WebElement the_red;
	
	//��ʾ
	@FindBy(className="wec_close")
	public WebElement the_point;
	
	//��Ϣ
	@FindBy(xpath="//*[@id=\"app/vm/Header_0\"]/div[21]/div[1]/div[2]")
	public WebElement headTipClose;
	
	//��ҳ
	@FindBy(xpath="//*[@id=\"app/vm/Header_0\"]/div[2]/a")
	public WebElement reopen;

//******************************��������*************************************
	//ѡ������
	@FindBy(xpath="//*[@id=\"app/vm/Header_0\"]/div[3]/div[2]")
	public WebElement books;
	
	//�½�����
	@FindBy(xpath="//*[@id=\"app/vm/Header_0\"]/div[4]")
	public WebElement newBooks;
	
	//��������//*[@id="chanjet_form_Text_3"]
	@FindBy(xpath="//*[@id=\"chanjet_form_Text_3\"]")
	public WebElement bookName;
	
	//ѡ���·�
	@FindBy(xpath="//*[@id=\"createBookContent\"]/ul[6]/li[2]/div[2]/div[1]/div[1]")
	public WebElement upmonth;
	@FindBy(xpath="//*[@id=\"createBookContent\"]/ul[6]/li[2]/div[2]/div[1]/div[2]")
	public WebElement downmonth;
	
	//ѡ�����ƶ�
	@FindBy(xpath="//*[@id=\"createBookContent\"]/ul[10]/li[2]/table/tbody/tr")
	public WebElement institution;
	
	//2013����ƶ�
	@FindBy(xpath="//*[@id=\"dijit_MenuItem_0\"]")
	public WebElement itt2013;
	
	//2007����ƶ�
	@FindBy(xpath="//*[@id=\"dijit_MenuItem_1\"]")
	public WebElement itt2007;
	
	//����ƶ�
	@FindBy(xpath="//*[@id=\"dijit_MenuItem_2\"]")
	public WebElement ittMF;
	
	//����
	@FindBy(xpath="//*[@id=\"createBookContent\"]/ul[12]/li[3]/div[2]")
	public WebElement svbook;
	
	//ȡ��
	@FindBy(xpath="//*[@id=\"createBookContent\"]/ul[12]/li[3]/div[1]")
	public WebElement cancel;

//*********************************����**********************************
	//����
	@FindBy(xpath="//*[@id=\"app/vm/Header_0\"]/div[5]")
	public WebElement setup;
	
	//��Ŀ�ڳ�
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_1\"]/div[1]/div/div/ul/li[1]/a")
	public WebElement subjectbg;
	
	//��������
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_1\"]/div[1]/div/div/ul/li[2]/a")
	public WebElement assist;
	
	//�˺Ź���
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_1\"]/div[1]/div/div/ul/li[3]/a")
	public WebElement amanage;
	
	//�鵵����
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_1\"]/div[1]/div/div/ul/li[4]/a")
	public WebElement pmanage;
	
	//���׵���
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_1\"]/div[1]/div/div/ul/li[5]/a")
	public WebElement imanage;
	
	//�û�����
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_1\"]/div[1]/div/div/ul/li[6]/a")
	public WebElement umanage;
//*********************************�˲�����**********************************
	//�˲�
	@FindBy(xpath="//*[@id=\"costReport\"]")
	public WebElement book;
	
	//����
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_9\"]/div[1]/div/div/ul/li[1]/a")
	public WebElement allbook;
	
	//��ϸ��
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_9\"]/div[1]/div/div/ul/li[2]/a")
	public WebElement detailbook;
	
	//����
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_9\"]/div[1]/div/div/ul/li[3]/a")
	public WebElement balancetable;
	
	//����������ϸ��
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_9\"]/div[1]/div/div/ul/li[4]/a")
	public WebElement assistbook;
	
	//������������
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_9\"]/div[1]/div/div/ul/li[5]/a")
	public WebElement assistbalance;
//*********************************ƾ֤����**********************************
	//ƾ֤
	@FindBy(xpath="//*[@id=\"vouchers\"]")
	public WebElement vouChers;
	
	//����ƾ֤
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_12\"]/div[1]/div/div/ul/li[1]/a")
	public WebElement newlyVoucher;
	
	//�鿴ƾ֤
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_12\"]/div[1]/div/div/ul/li[2]/a")
	public WebElement lookVoucher;
	
	//ƾ֤���ܱ�
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_12\"]/div[1]/div/div/ul/li[3]/a")
	public WebElement voucherTotal;
	
//*********************************�������**********************************
	//����
	@FindBy(xpath="//*[@id=\"costReportManage\"]/a/span[1]")
	public WebElement setIcon_15;
	
	//�ʲ���ծ��
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[1]/a")
	public WebElement property;
	
	//�����
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[2]/a")
	public WebElement profit;
	
	//�������
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[3]/a")
	public WebElement profits;
	
	//�ֽ�������
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[4]/a")
	public WebElement cash;
	
	//�ֽ���������
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[5]/a")
	public WebElement cashs;
	
	//Ӧ��ͳ�Ʊ�
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[6]/a")
	public WebElement receivable;
	
	//Ӧ��ͳ�Ʊ�
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[7]/a")
	public WebElement payable;
	
	//����ͳ�Ʊ�
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[8]/a")
	public WebElement cost;
	
	//��֧ͳ�Ʊ�
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[9]/a")
	public WebElement income;
	
	//��˰ͳ�Ʊ�
	@FindBy(xpath="//*[@id=\"chanjet_form_CommandMenu_10\"]/div[1]/div/div/ul/li[10]/a")
	public WebElement payduty;
	
	public PortalPage() throws IOException{
		PageFactory.initElements(_webDriver, this);
	}
	
	//ѡ������
	public void ChooseBooks(int index){
		int num = index-1;
		ElementCommonActions.click_(books);
		List <WebElement> bookelements = _webDriver.findElementsByXPath("//*[@id=\"common_form_HeaderMenu_0\"]/div[1]/div/div/ul/li");
		bookelements.get(num).click();
	}
//*****************************��ʾ�ﺯ��***********************************
	//�رպ��
	public void CloseThered() throws InterruptedException{
		if(ElementCommonActions.WaitForElementPresent(the_red))
		the_red.click();
	}

	//�ر���ʾ
	public void ClosePoint()throws InterruptedException{
		//Thread.sleep(2000);
		if(ElementCommonActions.WaitForElementPresent(the_point))
			ElementCommonActions.click_(the_point);
	}
	
	//�ر���Ϣ��ʾ
	public void CloseTop() throws InterruptedException{	
		if(ElementCommonActions.WaitForElementPresent(headTipClose))
			ElementCommonActions.click_(headTipClose);
	}
	
	//������ҳ
	public void Reopen() throws InterruptedException{
		Thread.sleep(1000);
		reopen.click();
	}
//****************************���ú���**********************************
	public void SetUp(){
		if(ElementCommonActions.WaitForElementPresent(setup))
			ElementCommonActions.click_(setup);
	}
	//��Ŀ����
	public void Subjectbg(){
		if(ElementCommonActions.WaitForElementPresent(subjectbg))
			ElementCommonActions.click_(subjectbg);
	}
	
	//��������
	public void Assist(){
		if(ElementCommonActions.WaitForElementPresent(assist))
			assist.click();
	}
	
	//���׹���
	public void Amanage(){
		if(ElementCommonActions.WaitForElementPresent(amanage))
			amanage.click();
	}
	
	//�鵵����
	public void Pmanage(){
		if(ElementCommonActions.WaitForElementPresent(pmanage))
			pmanage.click();
	}
	//���׵���
	public void Imanage(){
		if(ElementCommonActions.WaitForElementPresent(imanage))
			imanage.click();
	}
	//�û�����
	public void Umanage(){
		if(ElementCommonActions.WaitForElementPresent(umanage))
			umanage.click();
	}
//****************************ƾ֤����**********************************
	//����ƾ֤
	public void NewVoucher() throws InterruptedException
	{
		Thread.sleep(1000);
		if(ElementCommonActions.WaitForElementPresent(vouChers))
			vouChers.click();
		if(ElementCommonActions.WaitForElementPresent(newlyVoucher))
			newlyVoucher.click();
	}
	
	//�鿴ƾ֤
	public void IntoVoucher() throws InterruptedException
	{
		Thread.sleep(1000);
		if(ElementCommonActions.WaitForElementPresent(vouChers))
			vouChers.click();
		if(ElementCommonActions.WaitForElementPresent(lookVoucher))
			lookVoucher.click();
	}
	
	//�鿴ƾ֤�ܻ��
	public void IntoVouchertotal() throws InterruptedException
	{
		Thread.sleep(1000);
		if(ElementCommonActions.WaitForElementPresent(vouChers))
			vouChers.click();
		if(ElementCommonActions.WaitForElementPresent(voucherTotal))
			voucherTotal.click();
	}
//***************************�˲�����**********************************
	public void IntoBook()throws InterruptedException{
		Thread.sleep(1000);
		if(ElementCommonActions.WaitForElementPresent(book))
			book.click();
	}
	
	//����
	public void IntoAllbook()throws InterruptedException{
		if(ElementCommonActions.WaitForElementPresent(allbook))
			allbook.click();
		Thread.sleep(1000);
	}
	
	//��ϸ��
	public void IntoDetailbook(){
		if(ElementCommonActions.WaitForElementPresent(detailbook))
			detailbook.click();
	}
	
	//����
	public void IntoBanlance(){
		if(ElementCommonActions.WaitForElementPresent(balancetable))
			balancetable.click();
	}
	
	//����������ϸ��
	public void IntoAssistbook(){
		if(ElementCommonActions.WaitForElementPresent(assistbook))
			assistbook.click();
	}
	
	//������������
	public void IntoAssistbalance(){
		if(ElementCommonActions.WaitForElementPresent(assistbalance))
			assistbalance.click();
	}
//***************************ѡ�����׺���*******************************
	public void NewBooks(String name)throws InterruptedException{
		Thread.sleep(1000);
		if(ElementCommonActions.WaitForElementPresent(newBooks))
			newBooks.click();
		bookName.sendKeys(name);
	}
	//ѡ�������·�
	public void ChooseMouth(int num){
		int index = num-1;
		for(int i=0;i<12;i++){
			downmonth.click();
		}
		for(int i=0;i<index;i++){
			upmonth.click();
		}

	}
	//ѡ����׼��
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
	
	//����
	public void SvBook(){
		if(ElementCommonActions.WaitForElementPresent(svbook))
			svbook.click();
	}
	
	//ȡ��
	public void Cancel(){
		if(ElementCommonActions.WaitForElementPresent(cancel))
			cancel.click();
	}
//****************************������**********************************
	//�����ʲ���ծ��
	public void IntoProperty() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(property))
			property.click();
	}
	
	//���������
	public void Intoprofit() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(profit))
			profit.click();
	}
	
	//��������伾��
	public void Intoprofits() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(profits))
			profits.click();
	}
	
	//�����ֽ�������
	public void Intocash() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(cash))
			cash.click();
	}
	
	//�����ֽ���������
	public void Intocashs() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(cashs))
			cashs.click();
	}
	
	//����Ӧ��ͳ�Ʊ�
	public void Intoreceivable() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(receivable))
			receivable.click();
	}
	
	//����Ӧ��ͳ�Ʊ�
	public void Intopayable() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(payable))
			payable.click();
	}
	
	//�������ͳ�Ʊ�
	public void Intocost() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(cost))
			cost.click();
	}
	
	//��֧ͳ�Ʊ�
	public void Intoincome() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(income))
			income.click();
	}
	
	//������˰ͳ�Ʊ�
	public void Intopayduty() throws InterruptedException
	{
		if(ElementCommonActions.WaitForElementPresent(setIcon_15))
			setIcon_15.click();
		if(ElementCommonActions.WaitForElementPresent(payduty))
			payduty.click();
	}
}
