package Utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	public static String flieName = null;
	public static void Write(String content)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/ HH:MM:ss");
		FileWriter writer = null;
		try {

			flieName = Paths.get(new AppConfigure("BaseConfig.Properties")
							.getString("WorkingFolder"),"uitest.log").toString();
			// 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
			writer = new FileWriter(flieName, true);
			writer.write(String.format("%s : %s\r\n", sdf.format(new Date()),
					content));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
