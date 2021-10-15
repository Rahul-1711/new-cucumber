//package steps;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageobjectrepo.Loginpage;
//
//public class Stepdefenation 
//{
//	public WebDriver driver = null;
//	
//	//@Given("user luanch chrome browser")
//	public void user_luanch_chrome_browser() 
//	{
//		
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//	
//	}
//
////	@When("user opens URL {string}")
//	public void user_opens_URL(String url) 
//	{
//		//Loginpage lp=new Loginpage(driver);
//	   driver.get(url);
//	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	   driver.manage().window().maximize();
//	}
//
//	@When("user enters Email as {string} and Password as {string}")
//	public void user_enters_Email_as_and_Password_as(String user, String password) 
//	{
//		Loginpage lp=new Loginpage(driver);
//		lp.userlp(user);
//		lp.passlp(password);
//		
//	   
//	}
//
//	@When("click on login")
//	public void click_on_login() 
//	{
//		Loginpage lp=new Loginpage(driver);
//	   lp.log(); 
//	}
//
//	@Then("Page title should be {string}")
//	public void page_title_should_be(String title) 
//	{
//		
//		Loginpage lp=new Loginpage(driver);
//		if(driver.getPageSource().contains("Login was unsuccessful"))
//		{
//			driver.close();
//			Assert.assertTrue(false);
//		}
//		else 
//		{
//			Assert.assertEquals(title, driver.getTitle());
//		}
//
//	}
//
//	@When("user click on logout link")
//	public void user_click_on_logout_link() throws InterruptedException 
//	{
//		Loginpage lp=new Loginpage(driver);
//	    lp.loout();
//	    String s1 = driver.getTitle();
//		System.out.println(s1);
//	}
//
//	@Then("close the browser")
//	public void close_the_browser() 
//	{
//		driver.close();
//	    
//	}
//
//}
