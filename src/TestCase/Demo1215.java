package TestCase;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import Page.*;
import Utility.AppConfigure;
import Utility.BrowserFactory;
import Utility.ElementCommonActions;
import Utility.Logger;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1215 {
	public static void main(String args[]) throws FileNotFoundException, IOException, InterruptedException
	{
		AppConfigure config = new AppConfigure("BaseConfig.Properties");
		String url = config.getString("webURL");
		//最大化浏览器
		BrowserFactory.Browser().manage().window().maximize();
		//设置全局隐形等待
		BrowserFactory.Browser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BrowserFactory.Browser().navigate().to(url);
		//登陆
		LoginPage loginPage = new LoginPage();
		loginPage.DoLogin();
		//取消提示 
		PortalPage portalPage = new PortalPage();
		portalPage.ClosePoint();
		portalPage.CloseTop();
		//进入资产负债表
		/*portalPage.IntoProperty();
		//选择重分类
		PropertyPage propertyPage = new PropertyPage();
		propertyPage.select_echo();
		//取数
		ReportBasePage reportBase =new ReportBasePage();
		if(reportBase.GetCellVauleByRawNameAndColumnName("资产总计", "期末余额").equals("103,425.00"))
		{	
			Logger.Write("期末余额正确");
		}else
		{
			Logger.Write("期末余额不正确");
		}*/
		//System.out.print(reportBase.GetCellVauleByRawNameAndColumnName("资产总计", "期末余额").getClass().getName());
		//返回java.lang.String
		//新增凭证
		portalPage.NewVoucher();
		VoucherBasePage voucherPage = new VoucherBasePage();
		voucherPage.createVoucher("1", "1001 库存现金","1","1","1002 银行存款","1");
		
	}
}
