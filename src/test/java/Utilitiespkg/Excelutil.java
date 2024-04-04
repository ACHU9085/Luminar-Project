package Utilitiespkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {
	public static String getcellvalue(String xl,String sheet,int r,int c)
	{
		
		try 
		{
			
		FileInputStream fi = new FileInputStream(xl);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFCell cell= wb.getSheet(sheet).getRow(r).getCell(c);
		if(cell.getCellType()==CellType.STRING)
		{
			return cell.getStringCellValue();
		}
		else
		{
			return cell.getRawValue();
		}
		}
		catch (IOException e) 
		{
			return "";
		}
		
	}
	
	public static int getrowcount(String xl,String sheet)
	{
		try 
		{
			FileInputStream fi=new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			
			return wb.getSheet(sheet).getLastRowNum();
			
					
		} 
		catch (IOException e) 
		{
			return 0;
		
	    }
	}

}
