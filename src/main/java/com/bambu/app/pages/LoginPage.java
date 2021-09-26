package com.bambu.app.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class LoginPage extends PageObject {
	public static HashMap<String, String> TEST_DATA = new HashMap<String, String>();
	String xpathTxt_username = "//input[@name='email']";
	String xpathTxt_password = "//input[@name='password']";
	String xpathTxt_workspace = "//input[@id='workspace']";
	String xpathTxt_bambuHomePage = "//*[text()='Product']";
	String xpathTxt_emailValidationMessage = "//*[text()='Email']/ancestor::div[2]//span";
	String xpathTxt_passwordValidationMessage = "//*[text()='Password']/ancestor::div[2]//span";
	String xpathTxt_workspaceValidationMessage = "//*[text()='Workspace']/ancestor::div[2]//span";
	String xpathBtn_login = "//button[@data-testid='login-user-submit-button']";
	String xpathTxt_wrongemailpwdworkspace = "//*[text()='Welcome back! Login to Easy Advisor']/ancestor::div[2]/div[2]//p";
	String xpathTxt_registerCompanyName = "//*[text()='Company Name']/ancestor::div[2]//input";
	String xpathTxt_registerEmail = "//*[text()='Email']/ancestor::div[2]//input";
	String xpathTxt_registerPassword = "//*[text()='Password']/ancestor::div[2]//input";
	String xpathTxt_registerRepeatPassword = "//*[text()='Repeat Password']/ancestor::div[2]//input";
	String xpathBtn_TermsOfServices = "//*[contains(text(),\"By registering an account, I agree to Easy Advisor's\")]";
	String xpathBtn_Register = "//button[@data-testid='register-prospect-submit-button']";
	String xpathtxt_RegCompanynameValidation = "//*[text()='Company Name']/ancestor::div[2]//span";
	String xpathtxt_RegEmailValidation = "//*[text()='Email']/ancestor::div[2]//span";
	String xpathtxt_RegPwdValidation = "//*[text()='Password']/ancestor::div[2]//span";
	String xpathtxt_RegRepeatPwdValidation = "//*[text()='Repeat Password']/ancestor::div[2]//span";
	String xpathtxt_termsOfServices = "//label[@for='hasAgreed']/ancestor::div[2]/div[3]/span";
	String xpathtxt_existinguser = "//*[text()='User already exists']";
	String xpathtxt_forgotpwdEmail = "//*[text()='Email']/ancestor::div[2]/div//input";
	String xpathtxt_forgotpwdWorkspace = "//*[text()='Workspace']/ancestor::div[2]/div//input";
	String xpathbtn_forgotpwdSendEmail = "//button[@data-testid='password-forgot-submit-button']";
	String xpathtxt_forgotpwdWorkspaceValidationMsg = "//*[text()='Workspace']/ancestor::div[2]//span";
	String xpathtxt_forgotpwdSendEmailValidationMsg = "//*[text()='Email']/ancestor::div[2]//span";
	String xpathtxt_TenantNotFoundValidationMsg = "//*[text()='Forgot your password?']/ancestor::div[2]/div[2]//p";
	String xpathtxt_resetPwdCode = "//*[text()='Code']/ancestor::div[2]/div//input";
	String xpathtxt_resetPwdNewPwd = "//*[text()='New Password']/ancestor::div[2]/div//input";
	String xpathtxt_resetPwdRepeatNewPwd = "//*[text()='Repeat New Password']/ancestor::div[2]/div//input";
	String xpathbtn_resetPassword = "//button[@data-testid='password-reset-submit-button']";
	
	String xpathtxt_resetpwdCodeValidationMsg = "//*[text()='Code']/ancestor::div[2]//span";
	String xpathtxt_resetpwdPasswordValidationMsg = "//*[text()='New Password']/ancestor::div[2]//span";
	String xpathtxt_resetpwdRepeatPwdValidationMsg = "//*[text()='Repeat New Password']/ancestor::div[2]//span";
	String xpathtxt_resetpwdWrongcodeValidationMsg = "//*[text()='We have sent you a code']/ancestor::div[2]/div[2]/form/div[1]//p";
	String xpathtxt_verificationCode = "//input[@data-testid='register-code-input']";
	String xpathtxt_resendCode = "//*[text()='Resend code']";
	String xpath_clickProfile = "//img[@class='css-1i4zz36']";
	String xpath_logout = "//*[text()='Logout']";
	
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passWord;
	
	@FindBy(xpath="//input[@id='workspace']")
	WebElement workSpace;
	
	@FindBy(xpath="//button[@data-testid='LOGIN_BUTTON_TEST_ID']")
	WebElement logIn;
	
	@FindBy(xpath="//button[@data-testid='password-forgot-link']")
	WebElement forgotPassWord;
	
		
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String uname) {
		userName.click();
		userName.clear();
		userName.sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		passWord.click();
		passWord.clear();
		passWord.sendKeys(pwd);
	}
	
	public void enterWorkspace(String workspace) {
		workSpace.click();
		workSpace.clear();
		workSpace.sendKeys(workspace);
	}
	
	public void clickOnLogInButton() {
		logIn.click();
	}
	
	public void clickOnForgotPassWord() {
		forgotPassWord.click();
	}
	
	public void loginToApplication(String emailAddress, String passWord, String workSpace) {
		
		enterUserName(emailAddress);
		enterPassword(passWord);
		enterWorkspace(workSpace);
		clickOnLogInButton();
	}
}
