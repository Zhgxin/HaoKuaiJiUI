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
	//ѡ���Ŀ
	@FindBy(xpath="//*[@id=\"app_vm_SubjectAutoComplete_0\"]/div[1]/input")
	public WebElement course;
	//����
	@FindBy(xpath="//*[@id=\"nav_totalAccount\"]/div[1]/div[3]")
	public WebElement download;
	//��ӡ
	@FindBy(xpath="//*[@id=\"nav_totalAccount\"]/div[1]/div[4]")
	public WebElement putout;
	public LedgerPage()throws IOException{
		PageFactory.initElements(_webDriver, this);
	}
	//ѡ���Ŀ
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
	//ѡ���·�
	public void Choosemoon(String num)
	{
		List<WebElement> listmoon = _webDriver.findElementsByXPath("//ul[contains(@class,'yearList')]/li");
		for(int i=0;i<listmoon.size();i++){
			if(listmoon.get(i).getText().contains(num))
				listmoon.get(i).click();
		}
	}
	//��ӡ
	public void Putout(){
		if(ElementCommonActions.WaitForElementPresent(putout)){
			putout.click();
		}
	}
	//����
	public void Down(){
		if(ElementCommonActions.WaitForElementPresent(download)){
			download.click();
		}
	}
	//����  ʵ����ledgerPage.Detaildata("2016-02");
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
	//ȡ��
	//����name����ȡ��Ŀ������table��Ȼ���ٸ���row,colѡ��Ŀ��
	//ʵ����ledgerPage.getcell("2016-02", "���ºϼ�",3)
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
