package page_Objects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;
import utilities.Access_Excel;

public class Graph extends BaseTest{
	
	String Code= "print('Test')";
	String Code1= "Test";
	By Graph= By.xpath("//div//div[7]//div//div//a[contains(text(),'Get Started')]");
	By Topic= By.xpath("//body/div/ul['+i+']/a[@class='list-group-item']");
	By Tryhere= By.xpath("//a[contains (text(), 'Try here')]");
    By Input= By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
    By Run= By.xpath("//button");

	 
    public void AccessGraph() throws IOException {
    	
    	driver.findElement(Graph).click();	
    	List<WebElement> Topics= driver.findElements(Topic);
    	System.out.println(Topics.size());
    	WebElement T;
    	for( int i=2;i<=Topics.size();i++) {
    		System.out.println("Topic size is: " + Topics.size() + " and I variable is: " + i);
    		By Topic= By.xpath("//body/div/ul[" + i + "]/a[@class='list-group-item']");
    		T=driver.findElement(Topic);
    			T.click();
    		System.out.println("Topic is: "+ Topic);
    	
    
    		String[][] input=Access_Excel.getInput();
           	for(int j=0;j<1;j++) {
            	driver.findElement(Tryhere).click();
               	driver.findElement(Input).sendKeys(input[j][0]);
              	driver.findElement(Run).click();
              	try {
              		driver.switchTo().alert().accept();
              		}
              		catch (Exception e) {
              		
              		}
            	driver.navigate().back();
            	}
            
    	driver.navigate().back();
    	}    }}
    	
	


