package Page;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.ElementCommonActions;
//������ĿPage
public class CreatCoursePage extends PageBase{
	//���沢�˳�/ȡ��
	List<WebElement> svOut = _webDriver.findElements(By.xpath("//button[contains(@class,'greenWhiteBtn')]"));
	//
	List<WebElement> svNew = _webDriver.findElements(By.xpath("//button[contains(@class,'greenBtn')]"));
		
	public CreatCoursePage() throws IOException{
		PageFactory.initElements(_webDriver, this);
	}
	
	//����¼���Ŀ
		public void newCourse(String name,String unit,String sign,String assist)throws InterruptedException
		{
			List<WebElement> data = _webDriver.findElements(By.xpath("//input[contains(@class,'greenBorder')]"));
			//��Ŀ����
			data.get(0).sendKeys(name);
			//������λ
			data.get(1).clear();
			data.get(1).sendKeys(unit);
			//��ҷ���
			data.get(4).sendKeys(sign);
			Thread.sleep(1000);
			//��������
			List<WebElement> assistData = _webDriver.findElementsByClassName("label-radio");
			for(int i=0;i<assistData.size();i++){
				//System.out.print(assistData.get(i).getText());
				if(assistData.get(i).getText().equals(assist)){
					assistData.get(i).click();
					break;
				}
			}
			//���沢�˳�
			svOut.get(0).click();
			//�ж��Ƿ�����ڳ�����
			//List<WebElement> data_1 = _webDriver.findElements(By.xpath("//div[contains(@class,'ass-tr')]"));
			if(status){
				List<WebElement> data_1 = _webDriver.findElements(By.xpath("//div[contains(@class,'ass-tr')]"));
				for(int i=0;i<data_1.size();i++){
					
					if(data_1.get(i).findElement(By.xpath(".//div[1]")).getText().equals(assist+"��"))
					{
						data_1.get(i).findElement(By.xpath(".//div[2]")).click();
					}
					
				}
			}
			//ѡ��������
			List<WebElement> assist_1 = _webDriver.findElements(By.xpath("//div[contains(@class,'popListBox')]/ul"));
			//List<WebElement> assist_2 = assist_1
			//System.out.print(assist_1.size());
			//System.out.print(assist_1.get(0).isDisplayed());
			//System.out.print(assist_1.get(1).isDisplayed());
			System.out.print("there");
			if(assist_1.get(0).isDisplayed()){
				//�������
				assist_1.get(2).findElement(By.xpath(".//div")).click();
				System.out.print("ok");
				
			}
			else if(assist_1.get(1).isDisplayed()){
				System.out.print("ok2");
				//ѡ���Ѵ��ڵĸ�������
				List<WebElement> lis = assist_1.get(1).findElements(By.xpath(".//li"));
				lis.get(0).click();
				svNew.get(1).click();
			}
			//���������δ�����
		}
	//�༭��Ŀ
		public void editCourse(String name,String unit,String sign,String assist) throws InterruptedException
		{
			List<WebElement> data = _webDriver.findElements(By.xpath("//input[contains(@class,'greenBorder')]"));
			//��Ŀ����
			data.get(0).clear();
			data.get(0).sendKeys(name);
			//������λ
			data.get(1).clear();
			data.get(1).sendKeys(unit);
			//��ҷ���
			data.get(4).sendKeys(sign);
			Thread.sleep(1000);
			svNew.get(0).click();
		}
		
}

