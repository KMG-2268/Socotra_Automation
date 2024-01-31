package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Create_NewApplication {
	private WebDriver driver;
	public Create_NewApplication(WebDriver driver) {
		this.driver = driver;
	}
	public String validate_policyTitle() {
		String title= driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/main/div/div[2]/div/form/div[2]/p")).getText();
		//*[@id="app"]/div[2]/main/div/div[2]/div/form/div[2]/p
		return title;
	}
	public void new_application() throws InterruptedException {
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(), 'Start New Application')]")).click();
	}

	public void select_product(String product_name) throws InterruptedException {
		//Thread.sleep(1000);
		WebElement select_dropdown= this.driver.findElement(By.xpath("//*[@id=\"product-select\"]"));
		select_dropdown.click();
		Thread.sleep(2000);
		WebElement products = this.driver.findElement(By.xpath("//li[contains(text(), '"+product_name+"')]"));
		products.click();	
	}

	public void click_CreateNewApp() throws InterruptedException {
		this.driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1dx2rwh\"]")).click();
		Thread.sleep(2000);
	}
}
