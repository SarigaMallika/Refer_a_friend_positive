package Refer_a_friend_positive_scenarios;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import Reusable_Functions.Generic_function;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Refer_a_friend_positive_scenarios extends Generic_function{
	public static boolean value;

	@Given("Browser is open")
	/*Browser launch*/
	public static void browser_launching() throws IOException  {
		try {
			browser_launch();
			browser_wait(12);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*TC 001 - Validate that user must be able to view Refer a Friend under Home page*/
	@Then("Tell your friends about Mpowered Health text should be present on the page and also logo should be present")
	public static void refer_a_frnd_positive_tc_001() throws Exception   {
		try {
			click("welcome_login");
			browser_wait(12);
			driver.findElement(By.xpath(OR_reader("Object_locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",6));
			driver.findElement(By.xpath(OR_reader("Object_locator", "login_password"))).sendKeys(td_reader("login_password",7));
			click("login");
			browser_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "refer_a_frnd_home_logo"))).isDisplayed();
			Assert.assertEquals(true,value);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "refer_a_frnd_home_text"))).isDisplayed();
			Assert.assertEquals(true,value);
			System.out.println("1");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_001");
		}
	}

	/*TC 002 - Validate that user must be able to click on Refer a Friend button displayed in the home page*/
	@Given("Click on Refer a Friend Verify that the user should navigated to Refer a Friend landing page and Page title should be Refer a friend")
	public static void refer_a_frnd_positive_tc_002() throws Exception   {
		try {
			click("refer_a_frnd_home_button");
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "refer_a_frnd_page_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			browser_refresh();
			System.out.println("2");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_002");
		}
	}

	/*TC 003 - Validate that user must be able to view the referral code text*/
	@Given("Referal code text is visible near Your referal code")
	public static void refer_a_frnd_positive_tc_003() throws Exception   {
		try {
			browser_wait(10);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "refer_a_frnd_referral_code"))).isDisplayed();
			Assert.assertEquals(true,value);
			System.out.println("3");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_003");
		}
	}

	/*TC 004 - Validate that the user should able to see a Pop Up box when clicking on Share a link */
	@Given("User can able to click on Share Link button and can able to see a pop up box is displaying")
	public static void refer_a_frnd_positive_tc_004() throws Exception{
		try {
			System.out.println("inside 004");
			click("refer_a_frnd_share_link_button");	
			browser_wait(20);
			System.out.println("4");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_004");
		}
	}

	/*TC 005 - Validate that the user should able to copy the link */
	@When("Click on copy the link")
	public static void refer_a_frnd_positive_tc_005() throws Exception   {
		try {
			Thread.sleep(1000);
			Robot robot = new Robot();
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);	
			System.out.println("5");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_005");
		}
	}

	/*TC 006 - Validate that user can view How its works*/
	@Given("How it work text should be visible")
	public static void refer_a_frnd_positive_tc_006() throws Exception   {
		try {
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "refer_a_frnd_howits_work"))).isDisplayed();
			Assert.assertEquals(true,value);
			System.out.println("6");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_006");
		}
	}

	/*TC 007 -Validate that user can view the text Invite your friends to Mpowered Health by sharing your unique invitation code*/
	@When("First grid contains the text Invite your friends to Mpowered Health by sharing your unique invitation code")
	public static void refer_a_frnd_positive_tc_007() throws Exception   {
		try {
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "refer_a_frnd_first_grid_text"))).isDisplayed();
			Assert.assertEquals(true,value);
			System.out.println("7");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_007");
		}
	}

	/*TC 008 -  Validate that user can able to click on the link More information & FAQ and it will navigated to Frequently asked questions page*/
	@Given("Click on the link More information & FAQ and it will redirected to Frequently asked questions page")
	public static void refer_a_frnd_positive_tc_008() throws Exception   {
		try {
			click("refer_a_frnd_faq_link");
			System.out.println("8");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_008");
		}
	}

	/*TC 009 - Validate that the user should able to view list of frequently asked questions inside Frequently asked questions page*/
	@Given("User should able to view list of Frequently asked questions")
	public static void refer_a_frnd_positive_tc_009() throws Exception   {
		try {
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "faq_page_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			System.out.println("9");
			browser_close();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_009");
		}
	}
}
