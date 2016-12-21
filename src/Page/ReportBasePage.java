package Page;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.support.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utility.*;

public class ReportBasePage extends PageBase{
	
	public ReportBasePage() throws IOException{
		PageFactory.initElements(_webDriver, this);
	}
	
	//校验表单单项数据
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
	
	//验证表单单列数据
	public String[] GetCellVauleColumnName(int num)
	{
		WebElement targetTR = null;
		List<WebElement> trelements = _webDriver.findElementsByXPath("//div[contains(@class,'grid-panel')]/table/tbody/tr");
		String numBer [] = new String[trelements.size()];
		for(int i=0;i<trelements.size();i++)
		{
			numBer[i] =trelements.get(i).findElement(By.xpath(String.format(".//td[%d]/span",num))).getText();
		}
		return numBer;
				
	}
	
}
