package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	 public static WebDriver driver;
	
	@BeforeClass
	    public void openapplication() {
		driver=new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https:/adactinhotelapp.com/");
	       
	       driver.manage().window().maximize();
	   }
	   
	   @AfterClass
	   public void closeApplication() {
	       driver.close();
	   }
	   
	}
