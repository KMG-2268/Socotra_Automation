package com.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login {
	public static WebDriver driver;
	public Login(WebDriver driver) {
		this.driver= driver;
	}
		public String Login_title() {
			return driver.getTitle();
		}
		public void username(String uname) {
		
			WebElement username = driver.findElement(By.xpath("//*[@id=\"LoginForm__UsernameField--Standard\"]"));
			username.sendKeys(uname);
		}
		public void password(String pass) {
			WebElement password = driver.findElement(By.xpath("//*[@id=\"LoginForm__PasswordField--Standard\"]"));
			password.sendKeys(pass);
		}
		public void loginbtn() {
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"LoginForm__Button--StandardLogin\"]"));
		loginbtn.click();
		}
		
		//*[@id="LoginForm__Hostname--Standard"]/div/div
		public void logout(String string) {
			// TODO Auto-generated method stub
			
		 driver.findElement(By.xpath("//*[@id=\"AppBar__Button--UserActionsDropdown\"]")).click();
			
		 driver.findElement(By.xpath("//span[contains(text(), '"+string+"')]")).click();
		 driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
		
		}
//		public String validate_dashboard() {
//			String text = driver.findElement(By.xpath("//a[text()=\"Home\"]")).getText();
//			//a[text()="Home"]
//			return text;
//			
//		}
		
		
}
