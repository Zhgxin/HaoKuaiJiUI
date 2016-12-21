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
		//��������
		BrowserFactory.Browser().manage().window().maximize();
		//����ȫ�����εȴ�
		BrowserFactory.Browser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BrowserFactory.Browser().navigate().to(url);
		//��½
		LoginPage loginPage = new LoginPage();
		loginPage.DoLogin();
		//ȡ����ʾ 
		PortalPage portalPage = new PortalPage();
		portalPage.ClosePoint();
		portalPage.CloseTop();
		//�����ʲ���ծ��
		/*portalPage.IntoProperty();
		//ѡ���ط���
		PropertyPage propertyPage = new PropertyPage();
		propertyPage.select_echo();
		//ȡ��
		ReportBasePage reportBase =new ReportBasePage();
		if(reportBase.GetCellVauleByRawNameAndColumnName("�ʲ��ܼ�", "��ĩ���").equals("103,425.00"))
		{	
			Logger.Write("��ĩ�����ȷ");
		}else
		{
			Logger.Write("��ĩ����ȷ");
		}*/
		//System.out.print(reportBase.GetCellVauleByRawNameAndColumnName("�ʲ��ܼ�", "��ĩ���").getClass().getName());
		//����java.lang.String
		//����ƾ֤
		portalPage.NewVoucher();
		VoucherBasePage voucherPage = new VoucherBasePage();
		voucherPage.createVoucher("1", "1001 ����ֽ�","1","1","1002 ���д��","1");
		
	}
}
