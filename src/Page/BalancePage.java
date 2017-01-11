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
//����
public class BalancePage extends PageBase{
	public BalancePage()throws IOException{
		PageFactory.initElements(_webDriver, this);
	}
	public void Getcell(){
		List <WebElement> trs = _webDriver.findElements(By.xpath("//tr[contains(text(),'����ֽ�')]"));
		System.out.print(trs.size());
	}
}
