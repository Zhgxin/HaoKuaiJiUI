package Utility;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;

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
	}

