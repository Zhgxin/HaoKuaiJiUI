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
//科目期初Page
public class CoursePage extends PageBase{
	
	
	
	
	public CoursePage () throws IOException
	{
		PageFactory.initElements(_webDriver, this);
	}
	//资产
	public void assSet()
	{
		WebElement assset = _webDriver.findElement(By.linkText("负债"));
		assset.click();
	}
	//共同
	public void comMon()
	{
		WebElement common = _webDriver.findElement(By.linkText("共同"));
		common.click();
	}
	//权益
	public void inTerest()
	{
		WebElement interest = _webDriver.findElement(By.linkText("权益"));
		interest.click();
	}
	//成本
	public void coSt()
	{
		WebElement cost = _webDriver.findElement(By.linkText("成本"));
		cost.click();
	}
	//损益
	public void sunYi(){
		WebElement sunyi = _webDriver.findElement(By.linkText("损益"));
		sunyi.click();
	}
	//科目
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
//			System.out.print("蟑螂");
//		}
		WebElement newButton = _webDriver.findElement(By.xpath(String.format("//*[@id=\"app_vm_SubjectGrid_0\"]/table/tbody/tr[%d]/td[1]/div/span", index)));
		newButton.click();
	}
	//添加下级科目
	public void newCourse(){
		//添加下级科目
		WebElement newSoncourse = _webDriver.findElement(By.linkText("添加下级科目"));
		if(ElementCommonActions.WaitForElementPresent(newSoncourse))
			newSoncourse.click();

	}
	//存在旧数据
	public void OldData(){
		//存在旧数据
		List<WebElement> olddata = _webDriver.findElements(By.xpath("//span[contains(@class,'dijitButtonContents')]"));
		if(olddata.get(1).isDisplayed()){
			status = true;
			olddata.get(1).click();
		}
	}
	//编辑科目
	public void editCourse()
	{
		//编辑科目
		WebElement editSoncourse =  _webDriver.findElement(By.linkText("编辑科目"));
		if(ElementCommonActions.WaitForElementPresent(editSoncourse))
			editSoncourse.click();
	}
	//禁用科目
	public void stopCourse()
	{
		//禁用科目
		WebElement stopSoncourse = _webDriver.findElement(By.linkText("禁用科目"));
		if(ElementCommonActions.WaitForElementPresent(stopSoncourse))
			stopSoncourse.click();
	}
	//启用科目
	public void startCourse()
	{
		WebElement startSoncourse = _webDriver.findElement(By.linkText("启用科目"));
		if(ElementCommonActions.WaitForElementPresent(startSoncourse))
			startSoncourse.click();
	}
	//添加科目期初数据
	public String GetCellVauleByRowNameAndColumnName(String RowName,String columnName)
	{
		int index = -1;
		//获取列元素
		List<WebElement> thelements = _webDriver.findElementsByXPath("//div[contains(@class,'grid-table-head')]/table[1]/thead/tr/th");
		for(int i=0;i<thelements.size();i++)
		{
			if(thelements.get(i).getText().equals(columnName))
			{
				index = i+1;
				break;
			}
			
		}
		//获取行元素
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
		
		//查找要校验的报表单元格对数
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
