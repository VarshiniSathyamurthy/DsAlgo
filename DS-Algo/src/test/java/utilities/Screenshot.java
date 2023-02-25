package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;

public class Screenshot extends BaseTest {
	

public static void takeScreenshot(String Filename) throws IOException {
		
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file, new File("C:\\Users\\varsh\\eclipse-workspace\\Framework\\DS-Algo\\src\\test\\resources\\Screenshots" +Filename+".jpg"));
	
	
	
}
	
	
	

}
