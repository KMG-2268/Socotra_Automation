package com.qa.pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://sandbox.socotra.com/?loginTenantHostname=ravendra_socotra-configeditor.co.sandbox.socotra.com");
		//driver.manage().window().maximize();
		
		// for login 
		Login login = new Login(driver);
		login.username("alice.lee");
		login.password("socotra");
		login.loginbtn();
		
		//  dashboard 
		Dashboard dashboard = new Dashboard(driver);
		Thread.sleep(10000);
		dashboard.select_newpolicyholder();
		
		// new policyholder and new application
		Create_NewPolicyHolder policyholder = new Create_NewPolicyHolder(driver);
		//Thread.sleep(100);
		policyholder.first_name("Anne");
		policyholder.last_name("Frank");
		policyholder.dob("1929/06/12");
		policyholder.enter_gender("Female");
		Thread.sleep(300);
		policyholder.enter_occupation("Medical");
		Thread.sleep(300);
		policyholder.enter_maritial_status("Single");
		Thread.sleep(300);
		policyholder.click_Create();
		Thread.sleep(500);
		policyholder.Validate_NewPolicy();
	
	Create_NewApplication new_Application = new Create_NewApplication(driver);
		new_Application.new_application();
		Thread.sleep(200);
		new_Application.select_product("Commercial Property Location");
		Thread.sleep(300);
		new_Application.click_CreateNewApp();
		
		 //exposures page to add 
		exposures_Page exposures = new exposures_Page(driver);
		Thread.sleep(7000);
		exposures.add_exposures();
		exposures.select_exposures("Commercial Building");
		exposures.Validate_addExposures();
		
		// commercial building page
		commercial_Building_Page cbp = new commercial_Building_Page(driver);
		Thread.sleep(5000);
		cbp.select_cbp();
		cbp.location_no("LOC 001");
		cbp.building_no("BLDG 001");
		cbp.add1("101 Boulder St");
		cbp.add2("Address2");
		cbp.zip_Code("20001");
		cbp.state();
		cbp.town();
		cbp.business_form("Individual");
		cbp.nature("Engineers");
		cbp.sip_code("1000");
		cbp.prop_type("Apartment High Rise");
		cbp.buss_estab_yr("1987");
		cbp.year_cons("1951-2000");
		cbp.cons_type("Joisted Masonry");
		cbp.stories_no("10");
		cbp.basement("Yes");
		cbp.area_prop("2000");
		cbp.security("Yes");
		cbp.dis_fire_hydrant("<100 Feet");
		cbp.fire_stat_dis("6-10");
		cbp.prop_use("Owner");
		cbp.save();
		cbp.Validate_SavePolicy();
		//login.logout("Logout");
		//driver.close();
//		
		
	}

}
