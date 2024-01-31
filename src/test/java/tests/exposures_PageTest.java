package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.exposures_Page;

public class exposures_PageTest extends Create_NewApplicationTest {
	
	private exposures_Page obj_exposures_PageTest;
	public exposures_PageTest() {
		super();
	}
	
	@BeforeTest
	public void before_exposure() {
		try {
		this.obj_exposures_PageTest= new exposures_Page(driver);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test(dependsOnMethods = "newApplication")
	@Parameters ({"exposure"})
	public void exposure(String exposure) throws InterruptedException {
	// exposures page to add 
		String toast_alert="";
		String exposure_Policy_Number;
		
		try {
			exposure_Policy_Number =obj_exposures_PageTest.validate_policyID();
//			assertEquals(exposure_Policy_Number,"" );
			takeScreenshot(driver,"exposure_Page","pass");
		obj_exposures_PageTest.add_exposures();
		Thread.sleep(300);
		takeScreenshot(driver,"select_exposure","pass");
		obj_exposures_PageTest.select_exposures(exposure);
		
		int count =0;
		while(toast_alert.length()==0) {
			toast_alert=obj_exposures_PageTest.Validate_addExposures();
			Thread.sleep(500);
			if(count == 20 )
				break;
		}
		if(!toast_alert.equals("Successfully added exposure")){
			takeScreenshot(driver,"exposure_alert","fail");
		}
		if(toast_alert.equals("Successfully added exposure")){
			takeScreenshot(driver,"exposure_alert","pass");
		}
		assertEquals("Successfully added exposure",toast_alert);
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
