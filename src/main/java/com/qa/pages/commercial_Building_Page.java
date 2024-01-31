package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class commercial_Building_Page {
	private WebDriver driver;
	public commercial_Building_Page(WebDriver driver) {
		this.driver = driver;
	}
	//a[@class= "StyledLink--1klfmmp khUGmZ styled-link selected"]
	public void select_cbp() {
		//this.driver.findElement(By.xpath("//a[text()='Exposures']")).click();
		this.driver.findElement(By.xpath("//a[contains(text(),'Commercial Building')]")).click();
		
	}
	public String validate_policyID() {
		String id= driver.findElement(By.xpath("//h3[@class=\"MuiTypography-root MuiTypography-h3 MuiTypography-gutterBottom css-18yku5u\"]")).getText();
		//*[@id="app"]/div[2]/main/div/div[2]/div/form/div[2]/p
		return id;
	}
	public void location_no(String string) throws InterruptedException {
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Location Number')]/parent::div//input")).sendKeys(string);
		
	}
	public void building_no(String string) {
		driver.findElement(By.xpath("//label[contains(text(),'Building Number')]/parent::div//input")).sendKeys(string);
	}
	public void add1(String string) {
		driver.findElement(By.xpath("//label[contains(text(),'Address1')]/parent::div//textarea")).sendKeys(string);
	}
	public void add2(String string) {
		driver.findElement(By.xpath("//label[contains(text(),'Address2')]/parent::div//input")).sendKeys(string);
	}
	public void zip_Code(String string) {
		driver.findElement(By.xpath("//label[contains(text(),'ZIP Code')]/parent::div//input")).sendKeys(string);
	}
	public void state() {
		driver.findElement(By.xpath("//label[contains(text(),'State')]/parent::div//input"));
	}
	public void town() {
		driver.findElement(By.xpath("//label[contains(text(),'City/Town')]/parent::div//input"));
	}
	public void business_form(String string) {
		 driver.findElement(By.xpath("//label[contains(text(),'Form of Business')]/parent::div//input")).sendKeys(string + Keys.ENTER);	
	}
	public void nature(String string) {
		 driver.findElement(By.xpath("//label[contains(text(),'Nature of Business')]/parent::div//input")).sendKeys(string + Keys.ENTER);	
	}
	public void sip_code(String string) {
		 driver.findElement(By.xpath("//label[contains(text(),'SIC Code')]/parent::div//input")).sendKeys(string + Keys.ENTER);	
	}
	public void prop_type(String string) {
		 driver.findElement(By.xpath("//label[contains(text(),'Property Type')]/parent::div//input")).sendKeys(string + Keys.ENTER);	
	}
	public void buss_estab_yr(String string) {
		 driver.findElement(By.xpath("//label[contains(text(),'Business Established Year')]/parent::div//input")).sendKeys(string);	
	}
	public void year_cons(String string) {
		 driver.findElement(By.xpath("//label[contains(text(),'Year of the Construction')]/parent::div//input")).sendKeys(string + Keys.ENTER);	
	}
	public void cons_type(String string) {
		 driver.findElement(By.xpath("//label[contains(text(),'Type of Construction')]/parent::div//input")).sendKeys(string + Keys.ENTER);	
	}
	public void stories_no(String string) {
		 driver.findElement(By.xpath("//label[contains(text(),'Number of Stories')]/parent::div//input")).sendKeys(string + Keys.ENTER);	
	}
	public void basement(String string) {
		 driver.findElement(By.xpath("//label[contains(text(),'Does Property have Basement?')]/parent::div//input")).sendKeys(string + Keys.ENTER);	
	}
	public void area_prop(String string) {
		driver.findElement(By.xpath("//label[contains(text(),'Area of the Property (Sq. Ft.)')]/parent::div//input")).sendKeys(string);
	}
	public void security(String string) {
		 driver.findElement(By.xpath("//label[contains(text(),'Security System')]/parent::div//input")).sendKeys(string + Keys.ENTER);	
	}
	public void dis_fire_hydrant(String string) {
		
		 driver.findElement(By.xpath("//label[contains(text(),'Distance to Fire Hydrant (Feet)')]/parent::div//input")).sendKeys(string + Keys.ENTER);	

	}
	public void fire_stat_dis(String string) {
		
		 driver.findElement(By.xpath("//label[contains(text(),'Distance from Fire Station in Miles')]/parent::div//input")).sendKeys(string + Keys.ENTER);	

	}
	public void prop_use(String string) {
		
		 driver.findElement(By.xpath("//label[contains(text(),'Property Used By')]/parent::div//input")).sendKeys(string + Keys.ENTER);	

	}
	public void save() throws InterruptedException {
		this.driver.findElement(By.xpath("//button[contains(text(),\"Save\")]")).click();
		//sucesssfully saved
		//Thread.sleep(5000);
	}
	public String Validate_SavePolicy() throws InterruptedException {
		//policy successfully saved
		//Thread.sleep(6000);
		String text = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[1]")).getText();
		System.out.println(text);
		return text;	
	}
	
}
