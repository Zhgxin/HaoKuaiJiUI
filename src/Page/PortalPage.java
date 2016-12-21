package Page;
import java.io.IOException;

import Utility.ElementCommonActions; 
import org.openqa.selenium.support.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
