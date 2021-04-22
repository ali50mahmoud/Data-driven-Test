package php_reg;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameters;

public class register_testcase {
	WebDriver sdriver;
	@Test
	public void register_first_testcase (String first_name,String last_name,String phone,String email, 
			String password, String confirm) {
		
		WebDriverWait wait=new WebDriverWait(sdriver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("MY ACCOUNT")));

		sdriver.findElement(By.linkText("MY ACCOUNT")).click();
		sdriver.findElement(By.linkText("Sign Up")).click();
		sdriver.findElement(By.name("firstname")).sendKeys ("first_name");
		sdriver.findElement(By.name ("lastname")). sendKeys ("last_name");
		sdriver.findElement(By.name ("phone")). sendKeys ("phone");
		sdriver.findElement(By.name ("email")). sendKeys ("email");
		sdriver.findElement(By.name ("password")). sendKeys("password");
		sdriver.findElement(By.name("confirmpassword")). sendKeys("confirm");
		WebElement submit_btn = sdriver.findElement(By.xpath("//*(@id=\"headersignupform \"]/div[8]/button"));
		JavascriptExecutor java=(JavascriptExecutor)sdriver;
		java.executeScript("scroll(0,250)");
		submit_btn.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[2]/div[11/div[1]/div/div/div[1]/div/div[2]/h3")));
		String welcome_message=sdriver.findElement(By.xpath("/html/body/div[2]/div[11/div[1]/div/div/div[1]/div/div[2]/h3")).getText();
		Assert.assertEquals(welcome_message, "Hi, amrhassan1 amrhassan1");







	}
	@BeforeClass
	//@Parameters({"browser"})
	public void open_browser()
	{

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		sdriver=new ChromeDriver();
		sdriver.get("https://www.phptravels.net/register");
	}

	@AfterClass
	public void close_browser() {
		//sdriver.close();
	}


	@DataProvider
	public String[][] test_data() throws InvalidFormatException, IOException
	{
		read_excel_data obj=new read_excel_data();
		return obj.read_sheet();
	}


}

