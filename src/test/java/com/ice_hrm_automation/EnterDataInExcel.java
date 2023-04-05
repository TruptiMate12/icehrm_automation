package com.ice_hrm_automation;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class EnterDataInExcel 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String filePath="C:\\Users\\Lenovo\\Downloads\\TestData.xlsx";
				String extension=filePath.substring(filePath.indexOf(".")+1);
				System.out.println(filePath);
				Workbook workbook= null;
				try
				{
					FileInputStream inputstream= new FileInputStream(filePath);
					
					if(extension.equals("xlsx"))
					{
						 workbook=new XSSFWorkbook(inputstream);
					}
					else 
						
						if(extension.equals("xlx")) 
						{
							 workbook=new HSSFWorkbook(inputstream);
						}
					Sheet sheet =  workbook.getSheet("TestData");
					if(sheet==null)
					{
						sheet=workbook.createSheet("TestData");
						
	}
					Cell cell=sheet.createRow(0).createCell(0);
					cell.setCellValue("Cyber Success");
					FileOutputStream outputstream=new FileOutputStream(filePath);
					workbook.write(outputstream);
					workbook.close();
				}
				catch(FileNotFoundException e)
				{
					throw new RuntimeException(e);
				}
				catch(IOException e)
				{
					throw new RuntimeException(e);
				}
	}
}