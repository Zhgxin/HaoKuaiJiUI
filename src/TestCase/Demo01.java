package TestCase;
import java.io.IOException;

import Page.*;
public class Demo01 {
	public static void dome()throws IOException, InterruptedException{
		//滚动屏幕选择期初科目
		/*
		PortalPage portalPage = new PortalPage();
		portalPage.SetUp();
		portalPage.Subjectbg();
		CoursePage coursePage = new CoursePage();
		coursePage.getCourse("1408");
		*/
		//进入余额表
		PortalPage portalPage = new PortalPage();
		portalPage.IntoBook();
		portalPage.IntoBanlance();
		BalancePage balancePage = new BalancePage();
		balancePage.Getcell();
	}
}
