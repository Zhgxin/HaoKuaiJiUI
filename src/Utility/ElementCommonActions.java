package Utility;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementCommonActions {
	public static boolean WaitForElementPresent(WebElement element){
		for(int i=0;i<4;i++)
		{
	      try{
	          if(element.isDisplayed()&&element.isEnabled());
	            return true;
	      }catch(Exception e){
	    	  Logger.Write("发现一次等待异常,继续等待");
	          try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			}
	      }
		}
		return false;
	  }
	//click
	public static void click_(WebElement element)
    {
        // active js click
        try {
			BrowserFactory.Browser().executeScript("arguments[0].click();", element);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	//鼠标移动
//	public static void moveTo(WebElement element) throws FileNotFoundException, IOException
//	{
//		WebElement el = element;
//		Actions action = new Actions(BrowserFactory.Browser());
//		try{
//			action.moveToElement(element).build().perform();
//		}
//		catch(IllegalArgumentException e){
//			JavascriptExecutor j = (JavascriptExecutor)BrowserFactory.Browser();
//			j.executeScript("document.getElementsByClassName('grid-pane')[0].scrollTop=1000");
//			moveTo(el);
//		}
//	}
	public static void moveTo(WebElement ele,String name) throws FileNotFoundException, IOException{
		Actions action = new Actions(BrowserFactory.Browser());
		for(int i=0;i<4;i++){
			try{
				
				ele.click();
			}catch(Exception e){
				try{
					int top =+ 300;
					JavascriptExecutor j = (JavascriptExecutor)BrowserFactory.Browser();
					j.executeScript("document.getElementsByClassName('grid-pane')[0].scrollTop="+ top);
				}catch(IllegalArgumentException ee){
					Logger.Write("发现等待异常");
				}
			}
		}
	}
	}


