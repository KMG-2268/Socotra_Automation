package tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.commercial_Building_Page;

public class commercial_Builcing_PageTest extends exposures_PageTest {
	private commercial_Building_Page obj_commercial_Building_Page;
	
	public commercial_Builcing_PageTest() {
		super();
	}
	
	@BeforeTest
	public void before_Commercial_building(){
		this.obj_commercial_Building_Page= new commercial_Building_Page(driver);
	}
	
	@Test(dependsOnMethods = "exposure")
	@Parameters ({"location_no", "building_no", "Address1", "Address2", "zip", "business_form", "nature", "sic", "property_type", 
		"business_Established", "construction_year", "construction_type", "stories_no", "basement", "area", "security", "dis_fireHydrant", "dis_fireStation","property_used"})
	public void commercial_Building(String location_no, String building_no, String Address1, String Address2, String zip, String business_form, 
			String nature, String sic, String property_type, String business_Established, String construction_year, String construction_type,
			String stories_no, String basement, String area, String security, String dis_fireHydrant, String dis_fireStation, 
			String property_used) throws InterruptedException {
		// commercial building page
		String toast_alert="";
		String CommercialBuilding_Policy_Number;
		CommercialBuilding_Policy_Number = obj_commercial_Building_Page.validate_policyID();
		try {
		
		takeScreenshot(driver,"commercial_bilding_Page","pass");
		obj_commercial_Building_Page.location_no(location_no);
		obj_commercial_Building_Page.building_no(building_no);
		obj_commercial_Building_Page.add1(Address1);
		obj_commercial_Building_Page.add2(Address2);
		obj_commercial_Building_Page.zip_Code(zip);
		obj_commercial_Building_Page.state();
		obj_commercial_Building_Page.town();
		obj_commercial_Building_Page.business_form(business_form);
		obj_commercial_Building_Page.nature(nature);
		obj_commercial_Building_Page.sip_code(sic);
		obj_commercial_Building_Page.prop_type(property_type);
		obj_commercial_Building_Page.buss_estab_yr(business_Established);
		obj_commercial_Building_Page.year_cons(construction_year);
		obj_commercial_Building_Page.cons_type(construction_type);
		obj_commercial_Building_Page.stories_no(stories_no);
		obj_commercial_Building_Page.basement(basement);
		obj_commercial_Building_Page.area_prop(area);
		obj_commercial_Building_Page.security(security);
		obj_commercial_Building_Page.dis_fire_hydrant(dis_fireHydrant);
		obj_commercial_Building_Page.fire_stat_dis(dis_fireStation);
		obj_commercial_Building_Page.prop_use(property_used);
		obj_commercial_Building_Page.save();
		int count =0;
		while(toast_alert.length()==0) {
			toast_alert= obj_commercial_Building_Page.Validate_SavePolicy();
			Thread.sleep(500);
			count++;
			if(count == 20 )
				break;
		}
		if(toast_alert.equals("Successfully saved")){
			takeScreenshot(driver,"commercial_building_alert","pass");
		}
		if(!toast_alert.equals("Successfully saved")){
			takeScreenshot(driver,"commercial_building_alert","fail");
		}
		assertEquals("Successfully saved",toast_alert);
		//Successfully saved
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
