package Page;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.remote.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.*;

public class PageBase {
	protected RemoteWebDriver _webDriver = BrowserFactory.Browser();
	protected static boolean status = false;
	public PageBase() throws IOException
	{
		
	}
	

}
