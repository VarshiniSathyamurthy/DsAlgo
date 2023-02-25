package page_Objects;



import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;
import utilities.Access_Excel;

public class SignIn extends BaseTest {	
	private static Logger logger=LogManager.getLogger(SignIn.class);
	
	By Gsbutton=By.xpath("//button[contains(text(),'Get Started')]");
	By SignIn= By.xpath("//a[contains(text(),'Sign in')]");
	By Un= By.xpath("//input[@name='username']");
	By Pass=By.xpath("//input[@name='password']");
	By LogIn= By.xpath("//input[@type='submit']");
	By Alertmsg = By.xpath("//div[@class='alert alert-primary']");
	By SignOut= By.xpath("//a[contains (text(),'Sign out')]");
	
	public void invalidSignIn() throws IOException {

		//driver.findElement(Gsbutton).click();
		driver.findElement(SignIn).click();
		driver.findElement(Un).sendKeys(prop.getProperty("code"));
		driver.findElement(Pass).sendKeys(prop.getProperty("code"));
		driver.findElement(LogIn).click();
		String Message=driver.findElement(Alertmsg).getText();
		logger.error("The Error message is:"+Message);
		
		}
	
public void validSignIn() throws IOException {

	driver.findElement(SignIn).click();
		driver.findElement(Un).sendKeys(prop.getProperty("Un1"));
		driver.findElement(Pass).sendKeys(prop.getProperty("Pass1"));
		driver.findElement(LogIn).click();
		String Message=driver.findElement(Alertmsg).getText();
		logger.info("The message is:"+Message);
		takeScreenshot("SignIn_page");
		
		
		}

public void InputFromExcel() throws IOException, InterruptedException
{
	driver.findElement(SignIn).click();
String[][] input= Access_Excel.getData();

for(int i=0;i<=1;i++)
{
driver.findElement(Un).sendKeys(input[i][0]);
driver.findElement(Pass).sendKeys(input[i][1]);
driver.findElement(LogIn).click();
takeScreenshot("Login page");
 }
String Message=driver.findElement(Alertmsg).getText();
logger.error("The Error message is:"+Message);
}



public void SignOut() {
	driver.findElement(SignOut).click();
}
	
	
	
	
	
	

}
