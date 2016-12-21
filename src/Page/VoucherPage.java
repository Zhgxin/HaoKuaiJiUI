package Page;

import java.io.IOException;
import org.openqa.selenium.support.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VoucherPage extends VoucherBasePage{
	//����
	@FindBy(xpath="//*[@id=\"nav_pingzheng\"]/div[2]/div[4]/ul/li[2]")
	public WebElement serveVoucher;
	
	//���沢����
	@FindBy(xpath="//*[@id=\"nav_pingzheng\"]/div[2]/div[4]/ul/li[3]")
	public WebElement newserveVoucher;
	
	public VoucherPage() throws IOException
	{
		PageFactory.initElements(_webDriver, this);
	}

}
