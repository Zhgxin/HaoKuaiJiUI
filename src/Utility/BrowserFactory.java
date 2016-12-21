package Utility;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.remote.*;
public class BrowserFactory {
	private static RemoteWebDriver _webDriver;
	//配置浏览器驱动
	public static RemoteWebDriver Browser() throws FileNotFoundException, IOException
    {
            if (_webDriver == null)
                _webDriver = Create();
            return _webDriver;
    }
	//这个函数是做什么的
	public static void ReleaseBrowser()
    {
        if (_webDriver == null) return;
        _webDriver.close();
        _webDriver = null;
    }
	
	private static RemoteWebDriver Create() throws FileNotFoundException, IOException
	{
		RemoteWebDriver webDriver = null;
		BrowserTypes browserType = BrowserTypes.Default;
		AppConfigure appConfig = new AppConfigure("BaseConfig.properties");
		//获取浏览器类型
		String configBrowserType = appConfig.getString("BrowserType");
		if (configBrowserType != "" && configBrowserType != null)
		{
			for (BrowserTypes type : BrowserTypes.values())
			{
				if (type.toString().equalsIgnoreCase(configBrowserType) )
                {
                    browserType = BrowserTypes.valueOf(configBrowserType);
                    break;
                }
			}
		}
		ChromeOptions chromeOptions = null;
        ChromeDriverService chromeDriverService = null;
        switch (browserType)
        {
            case IE:
            	System.setProperty("webdriver.ie.driver", appConfig.getString("WorkingFolder")+"\\IEDriverServer.exe");
                webDriver = new InternetExplorerDriver();
                break;
            case Chrome:
                {
                	System.setProperty("webdriver.chrome.driver", appConfig.getString("WorkingFolder")+"\\chromedriver.exe");
                    webDriver = new ChromeDriver();
                }
                break;
            case Firefox:
            	webDriver = new FirefoxDriver();
                break;
            default:
                webDriver = new FirefoxDriver();
                break;
        }
        return webDriver;
	}
	
}
