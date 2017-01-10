package Page;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.ElementCommonActions;
//��Ŀ�ڳ�Page
public class CoursePage extends PageBase{
	
	
	
	
	public CoursePage () throws IOException
	{
		PageFactory.initElements(_webDriver, this);
	}
	//�ʲ�
	public void assSet()
	{
		WebElement assset = _webDriver.findElement(By.linkText("��ծ"));
		assset.click();
	}
	//��ͬ
	public void comMon()
	{
		WebElement common = _webDriver.findElement(By.linkText("��ͬ"));
		common.click();
	}
	//Ȩ��
	public void inTerest()
	{
		WebElement interest = _webDriver.findElement(By.linkText("Ȩ��"));
		interest.click();
	}
	//�ɱ�
	public void coSt()
	{
		WebElement cost = _webDriver.findElement(By.linkText("�ɱ�"));
		cost.click();
	}
	//����
	public void sunYi(){
		WebElement sunyi = _webDriver.findElement(By.linkText("����"));
		sunyi.click();
	}
	//��Ŀ
	public void getCourse(String num)throws InterruptedException, FileNotFoundException, IOException
	{
		Thread.sleep(1000);
		int index = 0;
		WebElement targetTR = null;
		List<WebElement> trelements = _webDriver.findElementsByXPath("//*[@id=\"app_vm_SubjectGrid_0\"]/table/tbody/tr/td[1]/div");
		for(int i=0;i<trelements.size();i++){
			if(trelements.get(i).getText().contains(num)){
				targetTR= trelements.get(i);
				index = i+1;
				break;
			}
		}
//		ElementCommonActions.moveTo(targetTR);
		Actions action = new Actions(_webDriver);
//		try
//		{
		action.moveToElement(targetTR).build().perform();
//		}
//		catch (IllegalArgumentException e)
//		{
//			JavascriptExecutor j = (JavascriptExecutor)_webDriver;
//			j.executeScript("document.getElementsByClassName('grid-pane')[0].scrollTop=1000");
//			action.moveToElement(targetTR).build().perform();
//			System.out.print("���");
//		}
		WebElement newButton = _webDriver.findElement(By.xpath(String.format("//*[@id=\"app_vm_SubjectGrid_0\"]/table/tbody/tr[%d]/td[1]/div/span", index)));
		newButton.click();
	}
	//����¼���Ŀ
	public void newCourse(){
		//����¼���Ŀ
		WebElement newSoncourse = _webDriver.findElement(By.linkText("����¼���Ŀ"));
		if(ElementCommonActions.WaitForElementPresent(newSoncourse))
			newSoncourse.click();

	}
	//���ھ�����
	public void OldData(){
		//���ھ�����
		List<WebElement> olddata = _webDriver.findElements(By.xpath("//span[contains(@class,'dijitButtonContents')]"));
		if(olddata.get(1).isDisplayed()){
			status = true;
			olddata.get(1).click();
		}
	}
	//�༭��Ŀ
	public void editCourse()
	{
		//�༭��Ŀ
		WebElement editSoncourse =  _webDriver.findElement(By.linkText("�༭��Ŀ"));
		if(ElementCommonActions.WaitForElementPresent(editSoncourse))
			editSoncourse.click();
	}
	//���ÿ�Ŀ
	public void stopCourse()
	{
		//���ÿ�Ŀ
		WebElement stopSoncourse = _webDriver.findElement(By.linkText("���ÿ�Ŀ"));
		if(ElementCommonActions.WaitForElementPresent(stopSoncourse))
			stopSoncourse.click();
	}
	//���ÿ�Ŀ
	public void startCourse()
	{
		WebElement startSoncourse = _webDriver.findElement(By.linkText("���ÿ�Ŀ"));
		if(ElementCommonActions.WaitForElementPresent(startSoncourse))
			startSoncourse.click();
	}
	//��ӿ�Ŀ�ڳ�����
	public String GetCellVauleByRowNameAndColumnName(String RowName,String columnName)
	{
		int index = -1;
		//��ȡ��Ԫ��
		List<WebElement> thelements = _webDriver.findElementsByXPath("//div[contains(@class,'grid-table-head')]/table[1]/thead/tr/th");
		for(int i=0;i<thelements.size();i++)
		{
			if(thelements.get(i).getText().equals(columnName))
			{
				index = i+1;
				break;
			}
			
		}
		//��ȡ��Ԫ��
		WebElement targetTR = null;
		List<WebElement> trelements = _webDriver.findElementsByXPath("//table[contains(@class,'dgrid-row-table')]/tbody/tr");
		for(int i=0;i<trelements.size();i++)
		{
			if(trelements.get(i).getText().contains(RowName))
			{
				targetTR= trelements.get(i);
				break;
			}
		}
		
		//����ҪУ��ı���Ԫ�����
		WebElement cell = targetTR.findElement(By.xpath(String.format(".//td[%d]", index)));
		return cell.getText();
	}
	//test
	public void a(){
		try{
		JavascriptExecutor j = (JavascriptExecutor)_webDriver;
		//j.executeScript("document.getElementsByClassName('grid-pane')[0].scrollTop=1000px");
		j.executeScript("ScrollToControl.('')");
		}catch(IllegalArgumentException e){
			a();
		}
	}
}
