package com.ice_hrm_automation;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.IOException;
import java.io.FileNotFoundException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelHandelling {

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
			Sheet sheet =  workbook.getSheet("credentials");
			int totalRows=sheet.getPhysicalNumberOfRows();
			int totalColums= sheet.getRow(0).getPhysicalNumberOfCells();
			
			for(int i=1; i<totalRows; i++)
				{
					for(int j=0; j<totalColums; j++) 
					{
						
					//String value=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(i).getCell(j).getStringCellValue();
					//System.out.println(value+" ");
						Cell cell=sheet.getRow(i).getCell(j);
					CellType cellType=cell.getCellType();
						if(cellType.equals(CellType.NUMERIC))
						{
							System.out.println(cell.getNumericCellValue()+" ");
							
						}
						else
							if( cellType.equals(CellType.STRING))
							{
								
								System.out.println(cell.getStringCellValue()+" ");
								
							}
							else
								if(cellType.equals(CellType._NONE) || cellType.equals(CellType.BLANK))
								{
									System.out.println();
									
								}
								else
									if(cellType.equals(CellType.ERROR))
									{
										System.out.println("cell.getErrorCellValue");
										
									}
										}
					System.out.println();						
					}
			workbook.close();
		} 
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
		
      }	
}