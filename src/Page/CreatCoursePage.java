package Page;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.ElementCommonActions;
//创建科目Page
public class CreatCoursePage extends PageBase{
	//保存并退出/取消
	List<WebElement> svOut = _webDriver.findElements(By.xpath("//button[contains(@class,'greenWhiteBtn')]"));
	//
	List<WebElement> svNew = _webDriver.findElements(By.xpath("//button[contains(@class,'greenBtn')]"));
		
	public CreatCoursePage() throws IOException{
		PageFactory.initElements(_webDriver, this);
	}
	
	//添加下级科目
		public void newCourse(String name,String unit,String sign,String assist)throws InterruptedException
		{
			List<WebElement> data = _webDriver.findElements(By.xpath("//input[contains(@class,'greenBorder')]"));
			//科目名称
			data.get(0).sendKeys(name);
			//计量单位
			data.get(1).clear();
			data.get(1).sendKeys(unit);
			//外币符号
			data.get(4).sendKeys(sign);
			Thread.sleep(1000);
			//辅助核算
			List<WebElement> assistData = _webDriver.findElementsByClassName("label-radio");
			for(int i=0;i<assistData.size();i++){
				//System.out.print(assistData.get(i).getText());
				if(assistData.get(i).getText().equals(assist)){
					assistData.get(i).click();
					break;
				}
			}
			//保存并退出
			svOut.get(0).click();
			//判断是否存在期初数据
			//List<WebElement> data_1 = _webDriver.findElements(By.xpath("//div[contains(@class,'ass-tr')]"));
			if(status){
				List<WebElement> data_1 = _webDriver.findElements(By.xpath("//div[contains(@class,'ass-tr')]"));
				for(int i=0;i<data_1.size();i++){
					
					if(data_1.get(i).findElement(By.xpath(".//div[1]")).getText().equals(assist+"："))
					{
						data_1.get(i).findElement(By.xpath(".//div[2]")).click();
					}
					
				}
			}
			//选择辅助核算
			List<WebElement> assist_1 = _webDriver.findElements(By.xpath("//div[contains(@class,'popListBox')]/ul"));
			//List<WebElement> assist_2 = assist_1
			//System.out.print(assist_1.size());
			//System.out.print(assist_1.get(0).isDisplayed());
			//System.out.print(assist_1.get(1).isDisplayed());
			System.out.print("there");
			if(assist_1.get(0).isDisplayed()){
				//点击新增
				assist_1.get(2).findElement(By.xpath(".//div")).click();
				System.out.print("ok");
				
			}
			else if(assist_1.get(1).isDisplayed()){
				System.out.print("ok2");
				//选择已存在的辅助核算
				List<WebElement> lis = assist_1.get(1).findElements(By.xpath(".//li"));
				lis.get(0).click();
				svNew.get(1).click();
			}
			//点击新增后未完待续
		}
	//编辑科目
		public void editCourse(String name,String unit,String sign,String assist) throws InterruptedException
		{
			List<WebElement> data = _webDriver.findElements(By.xpath("//input[contains(@class,'greenBorder')]"));
			//科目名称
			data.get(0).clear();
			data.get(0).sendKeys(name);
			//计量单位
			data.get(1).clear();
			data.get(1).sendKeys(unit);
			//外币符号
			data.get(4).sendKeys(sign);
			Thread.sleep(1000);
			svNew.get(0).click();
		}
		
}

