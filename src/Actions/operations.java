package Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import Inspectele.elements;

public class operations {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell cell;
	public static void actions() throws Exception{
		FileInputStream fileinputstream=new FileInputStream("D:\\selenium\\WORKSPACE\\excel\\order bookstore.xlsx");
		workbook=new XSSFWorkbook(fileinputstream);
		sheet=workbook.getSheet("Sheet1");
		cell=null;
	elements.clickonlogin().click();
	Thread.sleep(4000);
	elements.mail().click();
	 cell=sheet.getRow(1).getCell(0);
	 Thread.sleep(4000);
	 elements.pasword().click();
	 cell=sheet.getRow(1).getCell(1);
	 elements.enter().click();
	/* elements.edit().click();
	 for(int j=3; j<=3; j++) {
		
		 elements.frst().clear();
		 elements.last().clear();
		 elements.gmail().clear();
		 elements.phone().clear();
		elements.faxx().clear();
		  elements.cont().click();		//clicking on continue button
		  
		 cell =sheet.getRow(j).getCell(0);
		 elements.frst().sendKeys(cell.getStringCellValue());
			 cell =sheet.getRow(j).getCell(1);
			 elements.last().sendKeys(cell.getStringCellValue());
				 cell =sheet.getRow(j).getCell(2);
				 elements.gmail().sendKeys(cell.getStringCellValue());
					cell =sheet.getRow(j).getCell(3);
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
					
		 cell =sheet.getRow(j).getCell(4);
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
		 Inspectele.elements.cont().click();*/
	 Inspectele.elements.home().click();
	 Inspectele.elements.scrolling();
	 Screen s = new Screen();
	 Pattern p = new Pattern("D:\\selenium\\WORKSPACE\\snipping tool\\Capture.PNG");
	 s.click(p);
	 Inspectele.elements.addtocart().click();
	 Thread.sleep(5000);
	 Inspectele.elements.shoppingcart().click();
	 Thread.sleep(5000);
	 Inspectele.elements.viewcart().click();
	 
}
	public static void taskstatus() throws Exception {
		sheet.getRow(3).createCell(6).setCellValue("pass");
		FileOutputStream fos = new FileOutputStream("D:\\selenium\\WORKSPACE\\excel\\order bookstore.xlsx");
		workbook.write(fos);
		fos.close();
	}
}

