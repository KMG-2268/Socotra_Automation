package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Dashboard {
	private WebDriver driver;

	public Dashboard(WebDriver driver) {
		this.driver= driver;
	}
	public String validate_dashboard() {
	String text = driver.findElement(By.xpath("//a[text()=\"Home\"]")).getText();
	//a[text()="Home"]
	return text;
	}
//	public void select_report() {
//		//driver.get("https://sandbox.socotra.com/?loginTenantHostname=ravendra_socotra-configeditor.co.sandbox.socotra.com");
//		this.driver.findElement(By.xpath("//*[@id=\"AppBar__Buttons--Reports\"]")).click();
//	}
	public void select_newpolicyholder() throws InterruptedException {
		Thread.sleep(1000);
		WebElement App= driver.findElement(By.xpath("//*[@id=\"AppBar__Buttons--CreateDropdown\"]"));
		App.click();
		this.driver.findElement(By.xpath("//*[@id=\"CreateDropdown__ListItem--NewPolicyHolder\"]/button")).click();
	}

}
