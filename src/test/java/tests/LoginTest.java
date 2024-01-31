package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.Login;
import utility.Util_Test;

public class LoginTest extends Util_Test {
	public static WebDriver driver;
	 Login obj_login;
	
//	public LoginTest() {
//		super();
//	}
	@BeforeTest
	public void before_login() throws Exception {
		
		driver = new ChromeDriver();
		obj_login= new Login(driver);
		driver.get("https://sandbox.socotra.com/?loginTenantHostname=ravendra_socotra-configeditor.co.sandbox.socotra.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test  
	@Parameters ({"username", "password"})
 public void login_details(String username, String password) throws InterruptedException, IOException {
		// for login 
		
		String actual_Title= obj_login.Login_title();
		String expected_Title="Socotra - Tenant v2";
		assertEquals(expected_Title,actual_Title );
		takeScreenshot(driver,"Login","pass");
		try{	
		obj_login.username(username);
		obj_login.password(password);
		obj_login.loginbtn();
		
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenshot(driver,"Login","fail");
		}
		//Thread.sleep(10000);
	}
	
	
//	@AfterTest
//	public void logout_details() {
//		obj_login.logout("Logout");
//	}
	
}
