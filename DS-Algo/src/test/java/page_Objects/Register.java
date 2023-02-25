package page_Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import base.BaseTest;

public class Register extends BaseTest{
	Logger logger= LogManager.getLogger(GetStarted.class);
	By Reg=By.xpath("//a[contains(text(),'Register')]");
	By Un= By.xpath("//input[@name='username']");
	By Pass=By.xpath("//input[@name='password1']");
	By ConPass=By.xpath("//input[@name='password2']");
	By Regbtn= By.xpath("//input[@type='submit']");
	By Alertmsg = By.xpath("//div[@class='alert alert-primary']");
	
	public void invalidregister() {
	driver.findElement(Reg).click();
	driver.findElement(Regbtn).click();
	driver.findElement(Un).sendKeys(prop.getProperty("Un"));
	driver.findElement(Pass).sendKeys(prop.getProperty("Pass"));
	driver.findElement(ConPass).sendKeys(prop.getProperty("Conpass"));
	driver.findElement(Regbtn).click();
	String Message=driver.findElement(Alertmsg).getText();
	logger.error("The Error message is:"+Message);
	}
	
	public void validregister() {
		driver.findElement(Reg).click();
		driver.findElement(Regbtn).click();
		driver.findElement(Un).sendKeys(prop.getProperty("Un1"));
		driver.findElement(Pass).sendKeys(prop.getProperty("Pass1"));
		driver.findElement(ConPass).sendKeys(prop.getProperty("Conpass1"));
		driver.findElement(Regbtn).click();
		String Message=driver.findElement(Alertmsg).getText();
		logger.info("The message is:"+Message);
		logger.info("The page title is:"+ driver.getTitle());




	
	
	
	
	
	}
	
}
