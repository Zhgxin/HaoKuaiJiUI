package Page;

import java.util.List;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.ElementCommonActions;

public class LedgerPage extends PageBase{
	//选择科目
	@FindBy(xpath="//*[@id=\"app_vm_SubjectAutoComplete_0\"]/div[1]/input")
	public WebElement course;
	//下载
	@FindBy(xpath="//*[@id=\"nav_totalAccount\"]/div[1]/div[3]")
	public WebElement download;
	//打印
	@FindBy(xpath="//*[@id=\"nav_totalAccount\"]/div[1]/div[4]")
	public WebElement putout;
	public LedgerPage()throws IOException{
		PageFactory.initElements(_webDriver, this);
	}
	//选择科目
	public void Choosecourse(String name){
		List<WebElement> listcourse = _webDriver.findElementsByXPath("//*[@id=\"app_vm_SubjectAutoComplete_0\"]/div[2]/div");
		for(int i=0;i<listcourse.size();i++){
			if(listcourse.get(i).getText().contains(name)){
				listcourse.get(i).click();
			}
		}
	}
	public void Clickcourse(){
		course.click();
	}
	//选择月份
	public void Choosemoon(String num)
	{
		List<WebElement> listmoon = _webDriver.findElementsByXPath("//ul[contains(@class,'yearList')]/li");
		for(int i=0;i<listmoon.size();i++){
			if(listmoon.get(i).getText().contains(num))
				listmoon.get(i).click();
		}
	}
	//打印
	public void Putout(){
		if(ElementCommonActions.WaitForElementPresent(putout)){
			putout.click();
		}
	}
	//下载
	public void Down(){
		if(ElementCommonActions.WaitForElementPresent(download)){
			download.click();
		}
	}
	//详情  实例：ledgerPage.Detaildata("2016-02");
	public void Detaildata(String name){
		List<WebElement> datail = _webDriver.findElementsByXPath("//table[contains(@class,'dgrid-row-table border')]");
		//System.out.print(datail.size());
		//System.out.print(datail.get(0).getText());
		for(int i=0;i<datail.size();i++){
			if(datail.get(i).getText().contains(name)){
				WebElement cell = datail.get(i).findElement(By.xpath(".//tbody/tr[1]/td[1]/div"));
				Actions actions = new Actions(_webDriver);
				actions.moveToElement(cell).build().perform();
				WebElement look = cell.findElement(By.xpath(".//a[2]"));
				look.click();
			}
		}
	}
	//取数
	//根据name参数取得目标所在table，然后再根据row,col选中目标
	//实例：ledgerPage.getcell("2016-02", "本月合计",3)
	public String getcell(String name,String col,int row){
		int index = row;
		List<WebElement> datail = _webDriver.findElementsByXPath("//table[contains(@class,'dgrid-row-table border')]");
		List<WebElement> getrow = _webDriver.findElementsByXPath("//*[@id=\"nav_totalAccount\"]/div[2]/div[2]/div[1]/table/thead/tr/th");
		WebElement cell = null;
		
		for(int i=0;i<datail.size();i++){
			if(datail.get(i).getText().contains(name)){
				//System.out.print("1");
				List<WebElement> icell = datail.get(i).findElements(By.xpath(".//tbody/tr"));
				for(int j=0;j<icell.size();j++){
					if(icell.get(j).getText().contains(col)){
						cell = icell.get(j);
						//System.out.print("ok"+cell);
						break;
					}
				}
			}
		}
		WebElement ruqst = cell.findElement(By.xpath(String.format(".//td[%d]/span", index)));
		return ruqst.getText();
		
	}
}
