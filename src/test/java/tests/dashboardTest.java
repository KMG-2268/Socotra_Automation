package tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.pages.Dashboard;


public class dashboardTest extends LoginTest {
	private Dashboard objdashboardTest;
	public dashboardTest() {
		super();
	}
	@BeforeTest
	public void before_dashboard() {
		try {
		this.objdashboardTest= new Dashboard(driver);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test(dependsOnMethods= "login_details") 
	public void dashboard() throws Exception{
		String dashboard_home_title= "";
		dashboard_home_title= objdashboardTest.validate_dashboard();
		assertEquals(dashboard_home_title,"Home" );
		try {
			Thread.sleep(1000);
		
		takeScreenshot(driver,"Dashboard","pass");
		objdashboardTest.select_newpolicyholder();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
