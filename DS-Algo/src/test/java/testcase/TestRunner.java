package testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import page_Objects.GetStarted;
import page_Objects.Graph;
import page_Objects.Register;
import page_Objects.SignIn;
import page_Objects.Tree;
import page_Objects.Trees;
import utilities.Access_Excel;

public class TestRunner extends BaseTest{
	
	GetStarted gs= new GetStarted();
	Register Nu= new Register();
	SignIn Sn= new SignIn();
    Tree Tr= new Tree();
	
	Graph Gr= new Graph();
@BeforeMethod
	public void launch() throws IOException {
		
		setup();
		gs.getstart();
		//Sn.validSignIn();
	}
@Test 
public void homepage()  {
	

	//gs.selectdropdown();
	
}
/*@Test
public void newuserregister() {
	Nu.invalidregister();
	Nu.validregister();
	}

*/
@Test 
public void LogIn() throws IOException, InterruptedException {
	
	Sn.InputFromExcel();
	
}	
 
@Test 
	public void AccessTreeTopics() throws IOException, InterruptedException  {
	Sn.InputFromExcel();;
	Tr.AccessTree();
		}
@Test
public void AccessGraph1() throws IOException  {
	Sn.validSignIn();
	Gr.AccessGraph();
	
	}

@AfterMethod
public void Accesssignout() throws IOException  {
	driver.quit();
	
	
	}	

}
