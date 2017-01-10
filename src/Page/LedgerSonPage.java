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

import org.openqa.selenium.support.PageFactory;

public class LedgerSonPage extends PageBase{
	public LedgerSonPage()throws IOException{
		PageFactory.initElements(_webDriver, this);
	}
	//cell
	WebElement ruqst = null;
	//button¥Ú”°œ¬‘ÿ
	List <WebElement> buttons = _webDriver.findElements(By.xpath("//button[contains(@class,'greenBtn')]"));
	public void Download(){
		buttons.get(buttons.size()-2).click();
	}
	public void Stamp(){
		buttons.get(buttons.size()-1).click();
	}
	
	public void getcell(String rowcontent,String colcontent){
		int index = 0;
		WebElement rowgoal = null;
		List<WebElement> tableSon = _webDriver.findElements(By.xpath("//table[contains(@class,'dgrid-row-table')]"));
		List<WebElement> listcol = _webDriver.findElements(By.xpath("//table[contains(@data-dojo-attach-point,'theadDetail')]/thead/tr/th"));
		List<WebElement> tablegoal = tableSon.get(tableSon.size()-1).findElements(By.xpath(".//tbody/tr"));
		for(int i=0;i<listcol.size();i++){
			if(listcol.get(i).getText().contains(colcontent)){
				index = i+1;
				//System.out.print("1");
				break;
			}
		}
		for(int i=0;i<tablegoal.size();i++){
			if(tablegoal.get(i).getText().contains(rowcontent)){
				rowgoal = tablegoal.get(i);
				//System.out.print("2");
				break;
			}
		}
		ruqst = rowgoal.findElement(By.xpath(String.format(".//td[%d]", index)));
	}
	
	public String cellText(){
		return ruqst.getText();
	}
	public void getvouher(){
		Actions action = new Actions(_webDriver);
		action.moveToElement(ruqst).build().perform();
		WebElement editvoucher = ruqst.findElement(By.xpath(".//div[1]/a"));
		editvoucher.click();
	}
}
