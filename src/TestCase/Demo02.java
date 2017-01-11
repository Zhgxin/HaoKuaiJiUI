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
		assistPage.AssistStock("啦啦啦", "kg");
		
		portalPage.Reopen();
		portalPage.SetUp();
		portalPage.Subjectbg();
		CoursePage coursePage = new CoursePage();
		CreatCoursePage creatCoursePage = new CreatCoursePage();
		coursePage.getCourse("1101030101");
		coursePage.editCourse();
		creatCoursePage.editCourse("你好", "kg", "", "客户");
		portalPage.Reopen();
		portalPage.NewVoucher();
		VoucherBasePage voucherPage = new VoucherBasePage();
		voucherPage.createVoucher("1", "1001 库存现金","1","1","1012 其他货币资金","1");
		Thread.sleep(250);
		VoucherPage voucher = new VoucherPage();
		voucher.sv();
		portalPage.Reopen();
		Thread.sleep(250);
		portalPage.IntoProperty();
	
		PropertyPage propertyPage = new PropertyPage();
		propertyPage.select_echo();

		ReportBasePage reportBase =new ReportBasePage();
		if(reportBase.GetCellVauleByRowNameAndColumnName("资产总计", "期末余额").equals("10,614.10"))
		{	
			Logger.Write("期末余额正确");
		}else
		{
			Logger.Write("期末余额不正确");
		}
	}
}
