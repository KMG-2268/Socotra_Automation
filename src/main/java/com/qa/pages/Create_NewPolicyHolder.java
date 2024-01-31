package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class Create_NewPolicyHolder {

	private WebDriver driver;
	
	public Create_NewPolicyHolder(WebDriver driver) {
		this.driver= driver;
	}
	
	public String validate_policyTitle() {
		String title= driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/h3")).getText();
		return title;
	}

	public void first_name(String string) {
		driver.findElement(By.xpath("//label[contains(text(),'First Name')]/parent::div/div//input")).sendKeys(string);
		//label[contains(text(),'First Name')]/parent::div//input
	}

	public void last_name(String string) {
		
		driver.findElement(By.xpath("//input[@id=\"policyholder.tenant_15dbc5893fa2457db5533bc037e3704c_last_name\"]")).sendKeys(string);
	}

	public void dob(String string) {
		
		driver.findElement(By.xpath("//input[@placeholder=\"yyyy/mm/dd\"]")).sendKeys(string);
	}

	public void enter_gender(String string) {
		WebElement genders = driver.findElement(By.xpath("//input[@id=\"policyholder.tenant_15dbc5893fa2457db5533bc037e3704c_gender\"]"));
		//driver.findElement(By.xpath("//input[@id=\"policyholder.tenant_15dbc5893fa2457db5533bc037e3704c_gender\"]")).sendKeys(string);
		genders.sendKeys(string);
		genders.sendKeys(Keys.ENTER);
	}

	public void enter_occupation(String string) {
		
		WebElement occupation = driver.findElement(By.xpath("//*[@id=\"policyholder.tenant_15dbc5893fa2457db5533bc037e3704c_occupation\"]"));
		occupation.sendKeys(string);
		occupation.sendKeys(Keys.ENTER);
	}

	public void enter_maritial_status(String string) throws InterruptedException {
		 driver.findElement(By.xpath("//input[@id=\"policyholder.tenant_15dbc5893fa2457db5533bc037e3704c_marital_status\"]")).sendKeys(string + Keys.ENTER);	
	}
	
	public void click_Create() throws InterruptedException {
		this.driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();	
		//Thread.sleep(5000);
		//String text = driver.findElement(By.xpath("//div[@class=\"Toastify__toast-container Toastify__toast-container--top-center\"]")).getText();
	}
	public String Validate_NewPolicy() {
		//policy successfully created
		//*[@id="app"]/div[1]/div/div/div[1]
		String text = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[1]")).getText();

		//String text = driver.findElement(By.xpath("//div[@class=\"Toastify__toast-container Toastify__toast-container--top-center\"]")).getText();
		System.out.println(text);
		return text;
		
	}
	
}
