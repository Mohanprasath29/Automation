package com.mini_prjct;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Purchase_Order {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php");
	  //driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebElement signin_btn = driver.findElement(By.xpath("//a[@class='login']"));
		signin_btn.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("pqr@mail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='passwd']"));
		pass.sendKeys("Lion@04");
		
		WebElement login_Btn = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		login_Btn.click();
		
		Actions a = new Actions(driver);
		WebElement women = driver.findElement(By.xpath("(//a[@title='Women'])[1]"));
		a.moveToElement(women).build().perform();
		
		WebElement evng_Dress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[1]"));
		evng_Dress.click();
		
		
		WebElement q_view = driver.findElement(By.xpath("//a[@class='quick-view-mobile']"));
		a.moveToElement(q_view).build().perform();
		q_view.click();
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frame1);
		
		WebElement plus = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		plus.click();
		
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s4 = new Select(size);
		s4.selectByValue("2");
		
		WebElement color_Pick = driver.findElement(By.xpath("//a[@name='Pink']"));
		color_Pick.click();
		
		WebElement cart_Btn = driver.findElement(By.xpath("//button[@name='Submit']"));
		cart_Btn.click();
		
		driver.switchTo().defaultContent();
		
		WebElement check_Out1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		check_Out1.click();
		
		WebElement  check_Out2= driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		check_Out2.click();
		
		WebElement check_Out3_Btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		check_Out3_Btn.click();
		
		WebElement terms = driver.findElement(By.xpath("//input[@type='checkbox']"));
		terms.click();
		
		
		WebElement check_Out4_Btn = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		check_Out4_Btn.click();
		
		WebElement payment = driver.findElement(By.xpath("(//li[@class='step_current last'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", payment);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\admin\\eclipse-workspace\\Mini_Project\\screnshot\\purchase.png");
		
		FileUtils.copyFile(src, dest);
		
	//	driver.close();
		
		WebElement cntn_Btn = driver.findElement(By.xpath("//a[@title='Previous']"));
		cntn_Btn.click();
		
		Actions a2 = new Actions(driver);
		WebElement women2 = driver.findElement(By.xpath("//a[@title='Women']"));
		a2.moveToElement(women2).build().perform();
		
		WebElement casual = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
		casual.click();
		
		WebElement quick_View = driver.findElement(By.xpath("//a[@class='quick-view-mobile']"));
		quick_View.click();
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frame2);
		
		WebElement cart2 = driver.findElement(By.xpath("//button[@class='exclusive']"));
		cart2.click();
		
		driver.switchTo().defaultContent();
		
		WebElement proceed1 = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		proceed1.click();
		
		WebElement proceed2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed2.click();
		
		WebElement proceed3 = driver.findElement(By.xpath("(//button[@name='processAddress'])[1]"));
		proceed3.click();
		
		WebElement check2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		check2.click();
		
		WebElement proceed4 = driver.findElement(By.xpath("(//button[@name='processCarrier'])[1]"));
		proceed4.click();
		
		WebElement payment2 = driver.findElement(By.xpath("(//li[@class='step_current last'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();", payment2);
		
		File src2 = ts.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("C:\\Users\\admin\\eclipse-workspace\\Mini_Project\\screnshot\\purchase2.png");
		FileUtils.copyFile(src2, dest2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
