package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="LoginData")
	public String[][] getLoginData() throws IOException{
		String path = ".\\testData\\Orange+TestData.xlsx";
		
		ExcelUtilities xlutil = new ExcelUtilities(path);
		
		int rowCount = xlutil.getRowCount("Sheet1");
		int cellCount = xlutil.getCellCount("Sheet1", 1);
		
		String loginData[][] = new String[rowCount][cellCount];
		
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}
		}
		
		return loginData;
	}

}
