package Actions;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Inspectele.elements;

public class operations {
	public static void actions() throws Exception{
		FileInputStream fileinputstream=new FileInputStream("D:\\mounika_BookStore\\Order_bookstore.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook(fileinputstream);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFCell cell=null;
	elements.clickonlogin().click();
	Thread.sleep(4000);
	elements.mail().click();
	 cell=sheet.getRow(1).getCell(0);
	 Thread.sleep(4000);
	 elements.pasword().click();
	 cell=sheet.getRow(1).getCell(1);
	 elements.enter().click();
	 elements.edit().click();
	 for(int j=2; j<=6; j++) {
		
		 elements.frst().clear();
		 elements.last().clear();
		 elements.gmail().clear();
		 elements.phone().clear();
		elements.faxx().clear();
		  elements.cont().click();		//clicking on continue button
		  
		 cell =sheet.getRow(j).getCell(1);
		 elements.frst().sendKeys(cell.getStringCellValue());
			 cell =sheet.getRow(j).getCell(2);
			 elements.last().sendKeys(cell.getStringCellValue());
				 cell =sheet.getRow(j).getCell(3);
				 elements.gmail().sendKeys(cell.getStringCellValue());
					cell =sheet.getRow(j).getCell(4);
					 if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
				    	long k =(long)cell.getNumericCellValue();
				    		String g=String.valueOf(k);
				    	            System.out.println(g);
				    	            Thread.sleep(5000);
				    	            elements.phone().sendKeys(g);
				   			   }
				       else {
					              elements.phone().sendKeys(cell.getStringCellValue());
				         }
					
		 cell =sheet.getRow(j).getCell(5);
		 if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
		    	long k =(long)cell.getNumericCellValue();
		    		String g=String.valueOf(k);
		    	            System.out.println(g);
		    	            Thread.sleep(5000);
		    	            elements.faxx().sendKeys(g);
		   			   }
		       else {
			                elements.faxx().sendKeys(cell.getStringCellValue());
		         }
	
	
	
	
}
}
}
