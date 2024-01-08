package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	  
	   public LoginPage( WebDriver driver) {
	       this.driver=driver;
	       PageFactory.initElements(driver, this);
	       
	       
	   }
	   
	   @FindBy(id="username")
	   WebElement txtusername;
	   
	   @FindBy(id="password")
	   WebElement txtpassword;
	   
	   @FindBy(id="login")
	   WebElement btnLogin;
	   
	   public void setUsername() {
	       
	       txtusername.sendKeys("srijitha");
	   }
	   
	   public void setPassword() {
	       txtpassword.sendKeys("srijitha@");
	   }
	   
	   public void ClickLoginBtn() {
	       btnLogin.click();
	   }
	}


