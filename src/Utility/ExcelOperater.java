package Utility;
import java.io.*;

import jxl.*;
public class ExcelOperater {
	public jxl.Workbook readwb = null;
	public String ColumnName [];
	public String RowName [];
	//获取单个数据
	public String GetCellValueByRowNameAndColumnName(int rowNum,int columnNum,String filePath)
	{
		String result = null;
		try {
			// 构建Workbook对象, 只读Workbook对象
			// 直接从本地文件创建Workbook
			//创建输入流
			InputStream instream = new FileInputStream(filePath);
			readwb = Workbook.getWorkbook(instream);

			// Sheet的下标是从0开始
			// 获取第一张Sheet表

			Sheet readsheet = readwb.getSheet(0);

			Cell cell = readsheet.getCell(rowNum,columnNum);
			result = cell.getContents();

		}
	   catch(Exception e)
		{
		   e.printStackTrace();
		}
		return result;
			
	}
	
	//获取整列数据
	public String [] GetCellValueColumnName(int num,String filePath)
	{
		try
		{
			InputStream instream = new FileInputStream(filePath);
			readwb = Workbook.getWorkbook(instream);
			Sheet readsheet = readwb.getSheet(0);
			Cell [] cell = readsheet.getColumn(num);
			ColumnName = new String [cell.length];
			for(int i=0;i<cell.length;i++){
				ColumnName[i] = readsheet.getCell(num, i).getContents();
			}
		}
		catch(Exception e)
		{
		   e.printStackTrace();
		}
		return ColumnName;
	}
	//获取整行数据
	public String [] GetCellValueRowName(int num,String filePath)
	{
		try
		{
			InputStream instream = new FileInputStream(filePath);
			readwb = Workbook.getWorkbook(instream);
			Sheet readsheet = readwb.getSheet(0);
			Cell [] cell = readsheet.getColumn(num);
			RowName = new String [cell.length];
			for(int i=0;i<cell.length;i++){
				RowName[i] = readsheet.getCell(i, num).getContents();
			}
		}
		catch(Exception e)
		{
		   e.printStackTrace();
		}
		return RowName;
	}
	
}
