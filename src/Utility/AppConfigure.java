package Utility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
public class AppConfigure {
	private String flie = null;
	private Properties config = null;
	//获取配置文件
	public AppConfigure(String flie) throws FileNotFoundException, IOException
	{
		this.flie = flie;
		config = new Properties();
		FileInputStream fileStream = null;
		try{
			fileStream = new FileInputStream(flie);
			config.load(fileStream);
			}
			catch(Exception ex){
				
			}
			finally{
				if(fileStream!=null)
					fileStream.close();
			}
	}
	//对name进行遍历,返回name
	public Enumeration getConfigs(){
		Enumeration e = config.propertyNames();
		if(e.hasMoreElements()){
			return e;
		}else{
			return null;
		}
	}
	
	public String getString(String key){
		return config.getProperty(key);
	}
	
	public int getInt(String key){
		return Integer.parseInt(config.getProperty(key));
	}
}
