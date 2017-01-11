package Page;
//������ȷ��������Ĳ���
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
	//ѡ���Ŀ
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
	//���ش�ӡ
	List<WebElement> lists = _webDriver.findElements(By.xpath("//div[contains(@class,'fnBtns')]"));
	public void Dowmload(){
		lists.get(lists.size()-2).click();
	}
	public void Putout(){
		lists.get(lists.size()-1).click();
	}
	//ѡ���·�
	public void Choosemoon(String num)
	{
		List<WebElement> listmoon = _webDriver.findElementsByXPath("//ul[contains(@class,'monthList')]/li");
		for(int i=0;i<listmoon.size();i++){
			if(listmoon.get(i).getText().contains(num))
				listmoon.get(i).click();
		}
	}
	//��ϸ�����
	//δ���
	public void Kind(){
		WebElement accountKind = _webDriver.findElement(By.xpath("//span[contains(@class,'textCenter')]"));
		accountKind.click();
	}
	//��ϸ
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
	//��֤����
	public String GetCellVaule(String RowName,String columnName)
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
		List<WebElement> trelements = _webDriver.findElementsByXPath("//div[contains(@class,'grid-panel')]/table/tbody/tr");
		for(int i=0;i<trelements.size();i++)
		{
			if(trelements.get(i).getText().contains(RowName))
			{
				targetTR= trelements.get(i);
				break;
			}
		}
		
		//����ҪУ��ı���Ԫ�����
		WebElement cell = targetTR.findElement(By.xpath(String.format(".//td[%d]/span", index)));
		return cell.getText();
	}
}
