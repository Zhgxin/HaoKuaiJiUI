package TestCase;
import java.io.IOException;

import Page.*;
public class Demo01 {
	public static void dome()throws IOException, InterruptedException{
		//������Ļѡ���ڳ���Ŀ
		/*
		PortalPage portalPage = new PortalPage();
		portalPage.SetUp();
		portalPage.Subjectbg();
		CoursePage coursePage = new CoursePage();
		coursePage.getCourse("1408");
		*/
		//��������
		PortalPage portalPage = new PortalPage();
		portalPage.IntoBook();
		portalPage.IntoBanlance();
		BalancePage balancePage = new BalancePage();
		balancePage.Getcell();
	}
}
