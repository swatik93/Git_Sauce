package TestLayer;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.Demo1;

public class LoginPage extends Demo1 {
	@BeforeTest   
	public void setUp()
	{
    Demo1.initialization();
	}
    @Test
    public void validate() {
    	driver.findElement(By.name("user-name")).sendKeys("standard_user");
    	driver.findElement(By.name("password")).sendKeys("secret_sauce");
}
}