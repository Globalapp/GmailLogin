package TestJava;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRun {
private WebDriver driver;
private WebDriverWait wait;

@BeforeMethod
public void setUp()
{
	 driver = new FirefoxDriver();
     wait = new WebDriverWait(driver, 20);
     driver.manage().window().maximize();
     driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
}


@Test
public void Login() throws IOException, InterruptedException{
	
	driver.findElement(By.name("Email")).sendKeys("testsids2@gmail.com");
	driver.findElement(By.id("next")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("Passwd")).clear();
	driver.findElement(By.id("Passwd")).sendKeys("sachin2727");
	Thread.sleep(2000);
	driver.findElement(By.id("signIn")).click();
	Thread.sleep(5000);
	
}

@AfterMethod
public void teardown() throws IOException
{
	driver.quit();
}

}
