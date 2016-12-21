/*package TestCase;

import Page.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
	public static void main(String[] args) throws InterruptedException, IOException{
		//声明一个chrome浏览器Driver对象
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//最大化浏览器
	    driver.manage().window().maximize();
	    //设置全局的隐形等待
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