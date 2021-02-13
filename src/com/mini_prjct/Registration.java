package com.mini_prjct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("http://automationpractice.com/index.php");
		  //  driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    WebElement signin_btn = driver.findElement(By.xpath("//a[@class='login']"));
			signin_btn.click();
			
			WebElement mail_clmn = driver.findElement(By.xpath("//input[@name='email_create']"));
			mail_clmn.sendKeys("pqr@mail.com");
			
			WebElement create_btn = driver.findElement(By.id("SubmitCreate"));
			create_btn.click();
			
			WebElement mr_radio = driver.findElement(By.xpath("(//input[@name='id_gender'])[1]"));
			mr_radio.click();
			
			WebElement frst_name = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
			frst_name.sendKeys("jhon");
			
			
			WebElement last_name = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
			last_name.sendKeys("snow");
			
			WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
			password.sendKeys("Lion@04");
			
			WebElement days = driver.findElement(By.id("days"));
			Select s = new Select(days);
			s.selectByValue("3");
			
			WebElement months = driver.findElement(By.id("months"));
			Select s1 = new Select(months); 
			s1.selectByValue("5");
			
			WebElement year = driver.findElement(By.id("years"));
			Select s2 = new Select(year);
			s2.selectByValue("2010");
			
			WebElement rad2 = driver.findElement(By.xpath("//input[@name='newsletter']"));
			rad2.click();
			
			WebElement ad_line3 = driver.findElement(By.xpath("//input[@name='company']"));
			ad_line3.sendKeys("abc pvt,ltd.");
			
			WebElement ad_line4 = driver.findElement(By.xpath("//input[@name='address1']"));
			ad_line4.sendKeys("pqr street");
			
			WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
			city.sendKeys("Mexico");
			
			WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
			Select s3 = new Select(state);
			s3.selectByValue("43");
			
			WebElement pin_code = driver.findElement(By.xpath("//input[@name='postcode']"));
			pin_code.sendKeys("75001");
			
			WebElement info = driver.findElement(By.xpath("//textarea[@name='other']"));
			info.sendKeys("hi to all");
			
			WebElement home_Phn = driver.findElement(By.xpath("//input[@name='phone']"));
			home_Phn.sendKeys("+1210-470-7178");
			
			WebElement mob_phn = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
			mob_phn.sendKeys("972-930-8619");
			
			WebElement alter_add = driver.findElement(By.xpath("//input[@name='alias']"));
			alter_add.sendKeys("  is permanent");
			
			WebElement reg_btn = driver.findElement(By.xpath("//button[@name='submitAccount']"));
			reg_btn.click();
			
	}

}
