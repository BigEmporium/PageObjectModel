package keyword;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import wrappers.LeafTapsWrappers;

public class CallWrappersWithoutReflection extends LeafTapsWrappers{

	@Parameters({"testCaseName","testDescription","browser","category","authors"})
	@BeforeClass
	public void setup(String testName, String testDesc, String browser, String group, String authorName){

		browserName 	= browser;
		testCaseName 	= testName;
		testDescription = testDesc;	
		category 		= group;
		authors 		= authorName;
	}

	@Parameters({"testCaseName"})
	@Test
	public void getAndCallKeyword(String fileName) throws Exception{
		FileInputStream file = new FileInputStream(new File("./keywords/"+fileName+".xlsx" ));

		// Create Workbook instance holding reference to .xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// Get first/desired sheet from the workbook
		XSSFSheet sh = workbook.getSheetAt(0);
		for (int i = 1; i <= sh.getLastRowNum(); i++) {

			String keyword = "" ;
			String locator = "" ;
			String data = "" ;
			try {
				keyword = sh.getRow(i).getCell(0).getStringCellValue();
				locator = sh.getRow(i).getCell(1).getStringCellValue();
				data = sh.getRow(i).getCell(2).getStringCellValue();
			} catch (NullPointerException e) {
				// ignore
			}


			switch (keyword) {
			case "enterById":
				enterById(locator, data);
				break;
			case "clickByClassName":
				clickByClassName(locator);
				break;
			case "verifyTitle":
				verifyTitle(data);
				break;
			default:
				break;
			}

			workbook.close();
		}

	}
}
