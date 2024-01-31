package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Util_Test {
	
//	public static void takeScreenshot( WebDriver driver, String Socotra_Screenshot, String name) throws IOException{
//		
//		
//		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		System.out.println("Inside screenshot");
//		FileUtils.copyFile(file, new File("/Users/Pooja/eclipse-workspace/Socotra_Automation/Socotra_Screenshot/"+Socotra_Screenshot+".png"));
//
//	}
public static void takeScreenshot( WebDriver driver, String funtionName, String folderName) throws IOException{
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	Calendar calendar = Calendar.getInstance();
	SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String destinationFolder= "/Users/Pooja/eclipse-workspace/Socotra_Automation/Socotra_Screenshot/"+folderName+"/";
		//new File(destinationFolder + functionName+ ".png";
		String destinationFilepath = destinationFolder + funtionName+" "+ formater.format(calendar.getTime()) +".png";
		FileUtils.copyFile(file, new File(destinationFilepath));

	}

}
