package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class exposures_Page {
	private WebDriver driver;
	public exposures_Page(WebDriver driver) {
		this.driver = driver;
	}
	public String validate_policyID() {
		String id= driver.findElement(By.xpath("//h3[@class=\"MuiTypography-root MuiTypography-h3 MuiTypography-gutterBottom css-18yku5u\"]")).getText();
		//*[@id="app"]/div[2]/main/div/div[2]/div/form/div[2]/p
		return id;
	}
	//h3[@class="MuiTypography-root MuiTypography-h3 MuiTypography-gutterBottom css-18yku5u"]
	public void add_exposures() {
		this.driver.findElement(By.xpath("//a[text()='Exposures']")).click();
		this.driver.findElement(By.xpath("//*[text()='Add Exposure']")).click();
	}
	public void select_exposures(String string) throws InterruptedException {
		WebElement exposure_list = driver.findElement(By.xpath("//*[@id=\"add-exposure-selector\"]/div/div[1]"));
		exposure_list.click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
	}
	public String Validate_addExposures() throws InterruptedException {
		//policy successfully created
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[1]")).getText();
		System.out.println(text);
		return text;	
	}
}
