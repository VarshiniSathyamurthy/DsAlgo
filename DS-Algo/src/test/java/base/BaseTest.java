package base;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.time.Duration;
import java.util.Properties;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	public static FileReader fr;
	private static Logger logger=LogManager.getLogger(BaseTest.class);
	
	
	public void setup() throws IOException {
		
		if (driver==null) {
			 try {
				 prop=new Properties();
				FileReader fr= new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfile\\Config.properties");
	            prop.load(fr);	
			 } 
			 
			 catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		}
		String BrowserName=prop.getProperty("browser");
		if(BrowserName.equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
		
	}
		if(BrowserName.equalsIgnoreCase("FireFox")) {
			driver=new FirefoxDriver();
			
		}
	driver.get(prop.getProperty("URL"));
	driver.manage().window().maximize();
	
}
	public static void takeScreenshot(String Filename) throws IOException {
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file, new File("C:\\Users\\varsh\\git\\DsAlgo\\DS-Algo\\src\\test\\resources\\Screenshots" +Filename+".jpg"));
		
		
		
	}

}
