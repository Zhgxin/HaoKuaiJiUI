/*package TestCase;

import Page.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
	public static void main(String[] args) throws InterruptedException, IOException{
		//����һ��chrome�����Driver����
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//��������
	    driver.manage().window().maximize();
	    //����ȫ�ֵ����εȴ�
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("http://h.chanjet.com/");
	    PortalPage activityPage = new PortalPage(driver);
	    LoginPage loginPage = new LoginPage();
	    activityPage.CloseActivity();
	    loginPage.DoLogin();
	    Thread.sleep(15000);
	    //activityPage.CloseThered();
	    activityPage.ClosePoint();
	    Thread.sleep(2000);
	}
}
*/