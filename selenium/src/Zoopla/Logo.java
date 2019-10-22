package Zoopla;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Logo {
	string uname;
	public void title() {
		FileInputStream fs=new FileInputStream("textdata/workbook1.xls");
		HSSFWorkbook wb=new HSSFworkbook(fs);
		HSSFSheet=wb.getSheet("login");
		
		HSSFROW row=Sheet.getRow(1);
		HSSFCell cell=row.getCell(0);
		uname=cell.getStringCellValue();
		System.out.println("username is:"+uname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Logo oo=new Logo();
oo.title();

	}

}
