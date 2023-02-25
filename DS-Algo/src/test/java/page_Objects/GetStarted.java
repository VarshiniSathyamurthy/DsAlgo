package page_Objects;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import base.BaseTest;

public class GetStarted extends BaseTest{
	
	Logger logger= LogManager.getLogger(GetStarted.class);
	By Gsbutton=By.xpath("//button[contains(text(),'Get Started')]");
	By selectdrop =By.xpath("//div[@class='nav-item dropdown']");
	By eachvalue = By.xpath("//div[@class='dropdown-menu show']/a['+i+']");
	By Alertmsg = By.xpath("//div[@class='alert alert-primary']");
	
	public void getstart() {
		
		driver.findElement(Gsbutton).click();

		
		
	}
	public void selectdropdown() {
		
	for(int i=1;i<=6;i++) {
			driver.findElement(selectdrop).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
				driver.findElement(eachvalue).click();
		String Message=driver.findElement(Alertmsg).getText();
		logger.error("The Error message is:"+Message);
		}
		
		}
		
	}


