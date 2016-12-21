package Utility;
import java.io.*;

import jxl.*;
public class ExcelOperater {
	public jxl.Workbook readwb = null;
	public String ColumnName [];
	public String RowName [];
	//��ȡ��������
	public String GetCellValueByRowNameAndColumnName(int rowNum,int columnNum,String filePath)
	{
		String result = null;
		try {
			// ����Workbook����, ֻ��Workbook����
			// ֱ�Ӵӱ����ļ�����Workbook
			//����������
			InputStream instream = new FileInputStream(filePath);
			readwb = Workbook.getWorkbook(instream);

			// Sheet���±��Ǵ�0��ʼ
			// ��ȡ��һ��Sheet��

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
	
	//��ȡ��������
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
	//��ȡ��������
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
