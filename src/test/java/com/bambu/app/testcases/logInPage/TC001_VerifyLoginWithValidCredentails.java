package com.bambu.app.testcases.logInPage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bambu.app.pages.LoginPage;
import com.bambu.app.resources.TestBase;

import io.qameta.allure.Description;


public class TC001_VerifyLoginWithValidCredentails extends TestBase{
	
	public static final Logger log = Logger.getLogger(TC001_VerifyLoginWithValidCredentails.class.getName());	

	LoginPage loginPage;
	
	@BeforeClass
	public void setUp() throws IOException{
     init();

	}
	
	@Test
	@Description("Verifying Login with Valid Credentials")
	public void verifyLoginWithValidCredentails(){
		log.info("=========== Starting verifyLoginWithInvalidCredentails Test=============");
		loginPage = new LoginPage(driver);
		loginPage.loginToApplication("basanti@bambu.co", "6?T9yvkP~?", "tstp");
		
		log.info("=========== Finished verifyLoginWithInvalidCredentails Test=============");
	}
	
//	@AfterClass
//	public void endTest(){
//		driver.close();
//	}

}
