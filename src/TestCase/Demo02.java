package TestCase;
import java.io.IOException;

import Page.*;
import Utility.Logger;
public class Demo02 {
	
	public static void dome()throws IOException, InterruptedException{
		Thread.sleep(2000);
		PortalPage portalPage = new PortalPage();
		portalPage.ChooseBooks(2);
		Thread.sleep(1000);
		portalPage.SetUp();
		portalPage.Assist();
		AssistPage assistPage = new AssistPage();
		assistPage.IntoStock();
		assistPage.AssistStock("������", "kg");
		
		portalPage.Reopen();
		portalPage.SetUp();
		portalPage.Subjectbg();
		CoursePage coursePage = new CoursePage();
		CreatCoursePage creatCoursePage = new CreatCoursePage();
		coursePage.getCourse("1101030101");
		coursePage.editCourse();
		creatCoursePage.editCourse("���", "kg", "", "�ͻ�");
		portalPage.Reopen();
		portalPage.NewVoucher();
		VoucherBasePage voucherPage = new VoucherBasePage();
		voucherPage.createVoucher("1", "1001 ����ֽ�","1","1","1012 ���������ʽ�","1");
		Thread.sleep(250);
		VoucherPage voucher = new VoucherPage();
		voucher.sv();
		portalPage.Reopen();
		Thread.sleep(250);
		portalPage.IntoProperty();
	
		PropertyPage propertyPage = new PropertyPage();
		propertyPage.select_echo();

		ReportBasePage reportBase =new ReportBasePage();
		if(reportBase.GetCellVauleByRowNameAndColumnName("�ʲ��ܼ�", "��ĩ���").equals("10,614.10"))
		{	
			Logger.Write("��ĩ�����ȷ");
		}else
		{
			Logger.Write("��ĩ����ȷ");
		}
	}
}
