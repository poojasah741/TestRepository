package com.pages.MavenIRCTC;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.generics.MavenIRCTC.AutoConstant;
import com.generics.MavenIRCTC.BasePage;
import com.generics.MavenIRCTC.ExcelLibrary;


public class POMFramework extends BasePage implements AutoConstant
{
	public WebDriver driver;
	@FindBy(xpath = "(//button[.='Ok'])[1]")
	private WebElement okButton;
	
	@FindBy(xpath = "//input[@name='userName']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='usrPwd']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@name='cnfUsrPwd']")
	private WebElement cnfPassword;
	
	@FindBy(xpath = "//label[contains(text(),'Select Security Question')]")
	private WebElement selectSecurity;
	
	@FindBy(xpath = "//span[.='What is your pet name?']")
	private WebElement petname;
	
	@FindBy(xpath = "//input[@placeholder='Security Answer']")
	private WebElement securityAnswer;
	
	@FindBy(xpath = "//label[.='Select Preferred Language']")
	private WebElement selectLanguage;
	
	@FindBy(xpath = "//span[.='English']")
	private WebElement languageEnglish;
	
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@id='M']")
	private WebElement radioButtonMale;
	
	@FindBy(xpath = "//input[@id='F']")
	private WebElement radioButtonFemale;
	
	@FindBy(xpath = "//input[@id='T']")
	private WebElement radioButtontransgender;
	
	@FindBy(xpath = "(//input[@autocomplete='off'])[1]")
	private WebElement dob;
	
	@FindBy(xpath = "//label[.='Select Occupation']")
	private WebElement occupation;
	
	@FindBy(xpath = "//span[.='SELF EMPLOYED']")
	private WebElement occupationSelf;
	
	@FindBy(xpath = "(//input[@value='M'])[2]")
	private WebElement married;
	
	@FindBy(xpath = "//input[@value='U']")
	private WebElement unmarried;
	
	@FindBy(xpath = "//select[@formcontrolname='resCountry']")
	private WebElement selectCountry;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailID;
	
	@FindBy(xpath = "//input[@id='mobile']")
    private WebElement mobileNo;
	
	@FindBy(xpath = "//select[@formcontrolname='nationality']")
	private WebElement nationality;
	
	@FindBy(xpath = "//textarea[@id='resAddress1']")
	private WebElement FlatNo;
	
	@FindBy(xpath = "(//input[@name='resPinCode'])[1]")
	private WebElement pincode;
	
	@FindBy(xpath = "//input[@name='resState']")
	private WebElement state;
	
	@FindBy(xpath = "//select[@formcontrolname='resCity']")
	private WebElement selectCity;
	
	@FindBy(xpath = "//select[@formcontrolname='resPostOff']")
	private WebElement selectPostOffice;
	
	@FindBy(xpath = "//input[@formcontrolname='resPhone']")
	private WebElement phoneno;
	
	@FindBy(xpath = "(//input[@value='Y'])[2]")
	private WebElement copyResidential;
	
	@FindBy(xpath = "//div[@role='presentation']")
	private WebElement notRobot;
	
	@FindBy(xpath = "//input[@formcontrolname='termCondition']")
	private WebElement tNc;
	
	@FindBy(xpath = "//button[.='REGISTER']")
	private WebElement registerButton;
	
	@FindBy(xpath = "//button[.='Back']")
	private WebElement backButton;
	
	
	
	
	public POMFramework(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void irctcMethod() throws InterruptedException, IOException
	{
		  Thread.sleep(20000);
		  okButton.click();
		/*
		 * username.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 0));
		 * password.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 1));
		 * cnfPassword.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 2));
		 * Thread.sleep(10000); selectSecurity.click(); Thread.sleep(5000);
		 * petname.click();
		 * securityAnswer.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname,
		 * 1,3)); Thread.sleep(5000); selectLanguage.click(); Thread.sleep(4000);
		 * languageEnglish.click(); Thread.sleep(8000);
		 * firstname.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 4));
		 * Thread.sleep(5000); radioButtonFemale.click(); Thread.sleep(5000);
		 * dob.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 5));
		 * occupation.click(); occupationSelf.click(); Thread.sleep(5000);
		 * unmarried.click(); Thread.sleep(4000);
		 * selectbyvisibletext(selectCountry,"India");
		 * emailID.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname,1, 6));
		 */
		  mobileNo.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1,7));
		  Thread.sleep(5000);
		/*
		 * selectbyvisibletext(nationality, "India");
		 * FlatNo.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 8));
		 * pincode.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 9));
		 * state.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 10));
		 * Thread.sleep(5000); selectbyindex(selectCity, 1); Thread.sleep(5000);
		 * selectbyindex(selectPostOffice, 1);
		 * phoneno.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 11));
		 * Thread.sleep(5000);
		 */
		/*
		 * copyResidential.click(); notRobot.click(); tNc.click();
		 */
		
		
		
	}
	
}	