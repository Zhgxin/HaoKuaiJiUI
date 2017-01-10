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
		/*
		//�����ʲ���ծ��
		portalPage.IntoProperty();
		//ѡ���ط���
		PropertyPage propertyPage = new PropertyPage();
		propertyPage.select_echo();
		//ȡ��
		ReportBasePage reportBase =new ReportBasePage();
		if(reportBase.GetCellVauleByRowNameAndColumnName("�ʲ��ܼ�", "��ĩ���").equals("103,425.00"))
		{	
			Logger.Write("��ĩ�����ȷ");
		}else
		{
			Logger.Write("��ĩ����ȷ");
		}
		//System.out.print(reportBase.GetCellVauleByRawNameAndColumnName("�ʲ��ܼ�", "��ĩ���").getClass().getName());
		//����java.lang.String
		//����ƾ֤
		/*
		portalPage.NewVoucher();
		VoucherBasePage voucherPage = new VoucherBasePage();
		voucherPage.createVoucher("1", "1001 �ֽ�","1","1","1002 ���д��","1");
		
		//ѡ������
		//portalPage.ChooseBooks(1);
		//�½�����
		portalPage.NewBooks("�Һ���");
		//ѡ���·�
		portalPage.ChooseMouth(5);
		//ѡ���ƶ�
		portalPage.ChooseInstitution();
		portalPage.ChooseMF();
		portalPage.Cancel();
		
		//����
		portalPage.SetUp();
		portalPage.Assist();
		AssistPage assistPage = new AssistPage();
		assistPage.IntoStock();
		//assistPage.AssistStock("������", "kg");
		//assistPage.deleteStock(2);
		//assistPage.disableAssistStock(1);
		 
		 */
		/*
		//����Ŀ�ڳ�����¼���Ŀ
		portalPage.SetUp();
		portalPage.Subjectbg();
		CoursePage coursePage = new CoursePage();
		//coursePage.a();
		coursePage.getCourse("100101");
		//coursePage.newCourse();
		coursePage.editCourse();
		CreatCoursePage creatCoursePage = new CreatCoursePage();
		creatCoursePage.editCourse("���", "kg", "", "�ͻ�");
		//coursePage.stopCourse();
		//System.out.print(coursePage.GetCellVauleByRowNameAndColumnName("����ֽ�", "�ڳ����"));
		*/
		//�˲���������
		portalPage.IntoBook();
		portalPage.IntoAllbook();
		LedgerPage ledgerPage =new LedgerPage();
		//ledgerPage.Clickcourse();
		//ledgerPage.Choosecourse("���");
		ledgerPage.Detaildata("2016-01");
		//System.out.print(ledgerPage.getcell("2016-02", "���ºϼ�",3));
		LedgerSonPage ledgerSonPage = new LedgerSonPage();
		ledgerSonPage.getcell("2016-01-01","ƾ֤��");
		ledgerSonPage.getvouher();
		
	}
}
