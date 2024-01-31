package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.Create_NewApplication;


public class Create_NewApplicationTest extends Create_NewPolicyHolderTest {
	private Create_NewApplication obj_Create_NewApplication;

	public Create_NewApplicationTest() {
		super();
		
	}
	
	@BeforeTest
	public void before_newApplication(){
		this.obj_Create_NewApplication= new Create_NewApplication(driver);
	}
	
	@Test(dependsOnMethods= "create_newPolicy") 
	@Parameters ({"product"})
	public void newApplication(String product) throws InterruptedException{
		String policyHolder_Title;
		try {
			policyHolder_Title =obj_Create_NewApplication.validate_policyTitle();
			//Thread.sleep(1000);
			takeScreenshot(driver,"new_Application","pass");
			
		obj_Create_NewApplication.new_application();
		Thread.sleep(1000);
		takeScreenshot(driver,"product_selection","pass");
		obj_Create_NewApplication.select_product(product);
		
		//Thread.sleep(500);
		obj_Create_NewApplication.click_CreateNewApp();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
