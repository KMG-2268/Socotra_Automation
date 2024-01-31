package tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.Create_NewPolicyHolder;

public class Create_NewPolicyHolderTest extends dashboardTest {
	private Create_NewPolicyHolder objCreate_NewPolicyHolder;

	public Create_NewPolicyHolderTest() {
		super();
	}

	@BeforeTest
	public void before_NewPolicy() {
		this.objCreate_NewPolicyHolder = new Create_NewPolicyHolder(driver);
	}

	@Test(dependsOnMethods = "dashboard")
	@Parameters ({"fname", "lname", "dateOfBirth", "gender", "occupation", "maritialStatus"})
	public void create_newPolicy(String fname, String lname, String dateOfBirth, String gender, String occupation, String maritialStatus) throws Exception {
		// new policy holder
		String toast_alert = "";
		String create_policy_Title="";
		create_policy_Title =objCreate_NewPolicyHolder.validate_policyTitle();
		assertEquals(create_policy_Title,"Create Policyholder" );
		
		try {
			
			takeScreenshot(driver,"Policy_creation","pass");
			objCreate_NewPolicyHolder.first_name(fname);
			objCreate_NewPolicyHolder.last_name(lname);
			objCreate_NewPolicyHolder.dob(dateOfBirth);
			objCreate_NewPolicyHolder.enter_gender(gender);
			objCreate_NewPolicyHolder.enter_occupation(occupation);
			objCreate_NewPolicyHolder.enter_maritial_status(maritialStatus);
			objCreate_NewPolicyHolder.click_Create();

			int count = 0;
			while (toast_alert.length() == 0) {
				toast_alert = objCreate_NewPolicyHolder.Validate_NewPolicy();
				Thread.sleep(500);
				count++;
				//System.out.println(toast_alert);
				if (count == 20)
					break;
			}
//			assertEquals("Successfully created policyholder",toast_alert);
//			takeScreenshot(driver,"PolicyHolder_Created_Validation_asserttrail_pass", "pass");
//			assertNotEquals("Successfully created policyholder",toast_alert);
//			takeScreenshot(driver,"PolicyHolder_Created_Validation_asserttrail_fail", "fail");
//System.out.println(toast_alert);
			if (!toast_alert.equals("Successfully created policyholder")) takeScreenshot(driver,"PolicyHolder_Created_Validation", "fail");
			if (toast_alert.equals("Successfully created policyholder")) takeScreenshot(driver,"PolicyHolder_Created_Validation", "pass");
			assertEquals("Successfully created policyholder",toast_alert);
			
			//assertAll();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}
}
