package Page;

import java.io.IOException;
import java.util.List;

import Utility.ElementCommonActions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
//辅助核算Page
public class AssistPage extends PageBase{
	//项目名称
	@FindBy(xpath="//*[@id=\"nav_assistAccounting\"]/div[3]/div/div/div[2]/table/tbody/tr/td[3]/input")
	public WebElement name;
	//存货
	@FindBy(xpath="//*[@id=\"nav_assistAccounting\"]/div[2]/a[6]")
	public WebElement stock;
	//单位
	@FindBy(xpath="//*[@id=\"nav_assistAccounting\"]/div[3]/div/div/div[2]/table/tbody/tr/td[8]/input")
	public WebElement unIt;
	//删除
	@FindBy(xpath="//*[@id=\"nav_assistAccounting\"]/div[3]/div/div/div[1]/table/tbody/tr[2]/td[1]/div/a")
	public WebElement deleTe;
	//删除确定
	@FindBy(xpath="//*[@id=\"dijit_form_Button_1\"]")
	public WebElement deleTebutton;
	
	
	public AssistPage ()throws IOException{
		PageFactory.initElements(_webDriver, this);
	}
	
	public void TableAssist (String naMe){
	//获取辅助核算表单
	List<WebElement> aelement = _webDriver.findElementsByXPath("//*[@id=\"nav_assistAccounting\"]/div[3]/div/div/div[1]/table/tbody/tr");
	WebElement cell = aelement.get(aelement.size()-1).findElement(By.xpath(String.format(".//td[%d]", 3)));
	if(ElementCommonActions.WaitForElementPresent(cell))
		cell.click();
	if(ElementCommonActions.WaitForElementPresent(name))
		name.sendKeys(naMe);
	
	}
	
	//进入存货
	public void IntoStock()throws InterruptedException{
		Thread.sleep(1000);
		if(ElementCommonActions.WaitForElementPresent(stock))
			stock.click();
	}
	//添加存货
	public void AssistStock(String naMe,String n)throws InterruptedException{
		Thread.sleep(1000);
		List<WebElement> belement = _webDriver.findElementsByXPath("//*[@id=\"nav_assistAccounting\"]/div[3]/div/div/div[1]/table/tbody/tr");
		belement.get(belement.size()-1).findElement(By.xpath(String.format(".//td[%d]", 3))).click();
		
		if(ElementCommonActions.WaitForElementPresent(name))
			name.sendKeys(naMe);
		if(ElementCommonActions.WaitForElementPresent(unIt))
			unIt.sendKeys(n);
		//Actions action = new Actions(_webDriver);
	}
	
	//删除库存
	public void	deleteStock(int num)throws InterruptedException{
		Thread.sleep(1000);
		List<WebElement> belement = _webDriver.findElementsByXPath("//*[@id=\"nav_assistAccounting\"]/div[3]/div/div/div[1]/table/tbody/tr");
		WebElement stop = belement.get(num-1).findElement(By.xpath(String.format(".//td[%d]", 3)));
		Actions action = new Actions(_webDriver);
		action.moveToElement(stop).build().perform();
		if(ElementCommonActions.WaitForElementPresent(deleTe))
			deleTe.click();
	}
	
	//更改辅助核算状态
	public void disableAssist(int num){
		int targetTR = 0;
		targetTR = targetTR+num;
		WebElement disable = _webDriver.findElement(By.xpath(String.format("//*[@id=\"nav_assistAccounting\"]/div[3]/div/div/div[1]/table/tbody/tr[%d]/td[4]/label", targetTR)));
		disable.click();
	}
	public void disableAssistStock(int num)throws InterruptedException{
		int targetTR = 0;
//		List<WebElement> delement = _webDriver.findElementsByXPath("//*[@id=\"nav_assistAccounting\"]/div[3]/div/div/div[1]/table/tbody/tr/td[3]");
		//System.out.print(delement.get(0).getText());
//		for(int i=0;i<delement.size();i++){
//			if(delement.get(i).getText().contains(name)){
//				targetTR = i+1;
//				break;
//			}
//		}
		targetTR = targetTR+num;
		WebElement disable = _webDriver.findElement(By.xpath(String.format("//*[@id=\"nav_assistAccounting\"]/div[3]/div/div/div[1]/table/tbody/tr[%d]/td[5]/label", targetTR)));
		disable.click();
		
	}
}
