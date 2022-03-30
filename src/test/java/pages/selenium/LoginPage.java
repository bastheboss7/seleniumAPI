package pages.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import lib.selenium.PreAndPost;

public class LoginPage extends PreAndPost{
	private Properties prop;
	
	public LoginPage(EventFiringWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;
		driver.switchTo().frame(0);
		PageFactory.initElements(driver,this);
		
		prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("./src/test/resources/config.properties")));
		} catch (Exception e) {
			reportStep("Missing the configuration file", "FAIL");
		}
			
	}
	 
	@FindBy(id="qc-cmp2-ui")
	private WebElement privacyFrame;

	@FindBy(xpath="//button[3]")
	private WebElement acceptPrivacy;

	
	@Given("I accept privacy")
	private LoginPage acceptPrivacy() {
		switchToFrame(privacyFrame);
		click(acceptPrivacy);
		return this;
	}

	public LoginPage loginApp() {
		return
		acceptPrivacy();
	}

}
