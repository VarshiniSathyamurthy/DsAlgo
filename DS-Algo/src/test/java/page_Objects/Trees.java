package page_Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class Trees extends BaseTest{

	String Code= "print('Test')";
	String Code1= "Test";
	By Tree= By.xpath("//div//div[6]//div//div//a[contains(text(),'Get Started')]");
	By Topic1= By.xpath("//body/div/ul[1]/a[@class='list-group-item']");
	By Topic2= By.xpath("//body/div/ul[2]/a[@class='list-group-item']");
	By Topic3= By.xpath("//body/div/ul[3]/a[@class='list-group-item']");
	By Topic4= By.xpath("//body/div/ul[4]/a[@class='list-group-item']");
	By Topic5= By.xpath("//body/div/ul[5]/a[@class='list-group-item']");
	By Topic6= By.xpath("//body/div/ul[6]/a[@class='list-group-item']");
	By Topic7= By.xpath("//body/div/ul[7]/a[@class='list-group-item']");
	By Topic8= By.xpath("//body/div/ul[8]/a[@class='list-group-item']");
	By Topic9= By.xpath("//body/div/ul[9]/a[@class='list-group-item']");
	By Topic10= By.xpath("//body/div/ul[10]/a[@class='list-group-item']");
	By Topic11= By.xpath("//body/div/ul[11]/a[@class='list-group-item']");
	By Topic12= By.xpath("//body/div/ul[12]/a[@class='list-group-item']");
	By Topic13= By.xpath("//body/div/ul[13]/a[@class='list-group-item']");
	By Tryhere= By.xpath("//a[contains (text(), 'Try here')]");
    By Input= By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
    By Run= By.xpath("//button");
    
    public void AccessTree1() {
    	
    	driver.findElement(Tree).click();	
    	driver.findElement(Topic1).click();
    	
    }
 public void AccessTree2() {
    	
    	driver.findElement(Tree).click();	
    	driver.findElement(Topic2).click();
    	
    }
 public void AccessTree3() {
 	
 	driver.findElement(Tree).click();	
 	driver.findElement(Topic3).click();
 	 }
 public void AccessTree4() {
	 	
	 	driver.findElement(Tree).click();	
	 	driver.findElement(Topic4).click();
	 	 }
 public void AccessTree5() {
	 	
	 	driver.findElement(Tree).click();	
	 	driver.findElement(Topic5).click();
	 	 }
 public void AccessTree6() {
	 	
	 	driver.findElement(Tree).click();	
	 	driver.findElement(Topic6).click();
	 	
	 }
 public void AccessTree7() {
	 	driver.findElement(Tree).click();	
	 	driver.findElement(Topic7).click();
	 	 }
 public void AccessTree8() {
	 	
	 	driver.findElement(Tree).click();	
	 	driver.findElement(Topic8).click();
		 }
 public void AccessTree9() {
	 	
	 	driver.findElement(Tree).click();	
	 	driver.findElement(Topic9).click();
	 	
	 }
 public void AccessTree10() {
	 	 	driver.findElement(Tree).click();	
	 	driver.findElement(Topic10).click();
	 	 }
 public void AccessTree11() {
	 	
	 	driver.findElement(Tree).click();	
	 	driver.findElement(Topic11).click();
	 	
	 }
 public void AccessTree12() {
	 	
	 	driver.findElement(Tree).click();	
	 	driver.findElement(Topic12).click();
	 	
	 }
 public void AccessTree13() {
	 	
	 	driver.findElement(Tree).click();	
	 	driver.findElement(Topic13).click();
	 	
	 }
    	public  void inputs() {
           	for(int j=1;j<=2;j++) {
            	driver.findElement(Tryhere).click();
            	if(j==1) {
            	driver.findElement(Input).sendKeys(Code);
            	}else
            	{
            		driver.findElement(Input).sendKeys(Code1);
            		}
           	driver.findElement(Run).click();
            	if(j!=1) {
            		driver.switchTo().alert().accept();
            	}
            	driver.navigate().back();
            	}
           	driver.navigate().back();

        } 
   
}
	
	
	
	

