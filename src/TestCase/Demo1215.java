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
		/*
		//进入资产负债表
		portalPage.IntoProperty();
		//选择重分类
		PropertyPage propertyPage = new PropertyPage();
		propertyPage.select_echo();
		//取数
		ReportBasePage reportBase =new ReportBasePage();
		if(reportBase.GetCellVauleByRowNameAndColumnName("资产总计", "期末余额").equals("103,425.00"))
		{	
			Logger.Write("期末余额正确");
		}else
		{
			Logger.Write("期末余额不正确");
		}
		//System.out.print(reportBase.GetCellVauleByRawNameAndColumnName("资产总计", "期末余额").getClass().getName());
		//返回java.lang.String
		//新增凭证
		/*
		portalPage.NewVoucher();
		VoucherBasePage voucherPage = new VoucherBasePage();
		voucherPage.createVoucher("1", "1001 现金","1","1","1002 银行存款","1");
		
		//选择账套
		//portalPage.ChooseBooks(1);
		//新建账套
		portalPage.NewBooks("我好困");
		//选择月份
		portalPage.ChooseMouth(5);
		//选择制度
		portalPage.ChooseInstitution();
		portalPage.ChooseMF();
		portalPage.Cancel();
		
		//设置
		portalPage.SetUp();
		portalPage.Assist();
		AssistPage assistPage = new AssistPage();
		assistPage.IntoStock();
		//assistPage.AssistStock("不开心", "kg");
		//assistPage.deleteStock(2);
		//assistPage.disableAssistStock(1);
		 
		 */
		/*
		//给科目期初添加下级科目
		portalPage.SetUp();
		portalPage.Subjectbg();
		CoursePage coursePage = new CoursePage();
		//coursePage.a();
		coursePage.getCourse("100101");
		//coursePage.newCourse();
		coursePage.editCourse();
		CreatCoursePage creatCoursePage = new CreatCoursePage();
		creatCoursePage.editCourse("你好", "kg", "", "客户");
		//coursePage.stopCourse();
		//System.out.print(coursePage.GetCellVauleByRowNameAndColumnName("库存现金", "期初余额"));
		*/
		//账簿——总账
		portalPage.IntoBook();
		portalPage.IntoAllbook();
		LedgerPage ledgerPage =new LedgerPage();
		//ledgerPage.Clickcourse();
		//ledgerPage.Choosecourse("外币");
		ledgerPage.Detaildata("2016-01");
		//System.out.print(ledgerPage.getcell("2016-02", "本月合计",3));
		LedgerSonPage ledgerSonPage = new LedgerSonPage();
		ledgerSonPage.getcell("2016-01-01","凭证号");
		ledgerSonPage.getvouher();
		
	}
}
