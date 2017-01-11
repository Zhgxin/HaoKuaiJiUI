package Page;
//首先先确保所输入的参数
import java.util.List;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DetailaccountPage extends PageBase{
	public DetailaccountPage()throws IOException{
		PageFactory.initElements(_webDriver, this);
	}
	//选择科目
	@FindBy(xpath="//*[@id=\"app_vm_SubjectAutoComplete_0\"]/div[1]/input")
	public WebElement course;
	public void Choosecourse(String name){
		List<WebElement> listcourse = _webDriver.findElementsByXPath("//*[@id=\"app_vm_SubjectAutoComplete_0\"]/div[2]/div");
		for(int i=0;i<listcourse.size();i++){
			if(listcourse.get(i).getText().contains(name)){
				listcourse.get(i).click();
			}
		}
	}
	//下载打印
	List<WebElement> lists = _webDriver.findElements(By.xpath("//div[contains(@class,'fnBtns')]"));
	public void Dowmload(){
		lists.get(lists.size()-2).click();
	}
	public void Putout(){
		lists.get(lists.size()-1).click();
	}
	//选择月份
	public void Choosemoon(String num)
	{
		List<WebElement> listmoon = _webDriver.findElementsByXPath("//ul[contains(@class,'monthList')]/li");
		for(int i=0;i<listmoon.size();i++){
			if(listmoon.get(i).getText().contains(num))
				listmoon.get(i).click();
		}
	}
	//明细账类别
	//未完成
	public void Kind(){
		WebElement accountKind = _webDriver.findElement(By.xpath("//span[contains(@class,'textCenter')]"));
		accountKind.click();
	}
	//详细
	public void Detaildata(String name){
		List<WebElement> datail = _webDriver.findElements(By.xpath("//*[@id=\"nav_detailAccount\"]/div[2]/div[2]/div[2]/table/tbody/tr"));
		for(int i=0;i<datail.size();i++){
			if(datail.get(i).getText().contains(name)){
				Actions actions = new Actions(_webDriver);
				actions.moveToElement(datail.get(i)).build().perform();
				WebElement cell = datail.get(i).findElement(By.xpath(".//td[2]/div/a"));
				cell.click();
			}
		}
	}
	//验证数据
	public String GetCellVaule(String RowName,String columnName)
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
		List<WebElement> trelements = _webDriver.findElementsByXPath("//div[contains(@class,'grid-panel')]/table/tbody/tr");
		for(int i=0;i<trelements.size();i++)
		{
			if(trelements.get(i).getText().contains(RowName))
			{
				targetTR= trelements.get(i);
				break;
			}
		}
		
		//查找要校验的报表单元格对数
		WebElement cell = targetTR.findElement(By.xpath(String.format(".//td[%d]/span", index)));
		return cell.getText();
	}
}
