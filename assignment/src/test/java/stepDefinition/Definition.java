package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Definition {
	WebDriver driver;

		@Given("You need to be on Website")
		public void you_need_to_be_on_website() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\MShaistaTarannum\\SFDC_TestAutomation_Lightning\\projectFiles\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://elearningm1.upskills.in/");
		}


		@When("Click on Signup link")
		public void click_on_signup_link() {
            driver.findElement(By.xpath("//a[text()=' Sign up! ']")).click();
		}
		

		@When("Enter First Name {string}")
		public void enter_first_name(String fname) {
              driver.findElement(By.id("registration_firstname")).sendKeys(fname);
		}


		@When("Enter Last Name {string}")
		public void enter_last_name(String lname) {
	       driver.findElement(By.id("registration_lastname")).sendKeys(lname);
		}
			
		@When("Enter Email Id {string}")
		public void enter_email_id(String mailID) {
            driver.findElement(By.id("registration_email")).sendKeys(mailID);
		}
			
		@When("Enter User Name {string}")
		public void enter_user_name(String username) {
            driver.findElement(By.id("username")).sendKeys(username);
		}
		
		@When("Enter Password {string}")
		public void enter_password(String pwd) {
	        driver.findElement(By.id("pass1")).sendKeys(pwd);
	           
		}
		
		@When("Enter Confirm Password {string}")
		public void enter_confirm_password(String pwd) {
            driver.findElement(By.id("pass2")).sendKeys(pwd);		
		}
	
		@When("Click on Register button")
		public void click_on_register_button() {
            driver.findElement(By.id("registration_submit")).click();
        }
		
		@When("Successfully Registered message")
		public void successfully_registered_message() throws InterruptedException {
			String msg = "Dear Fassignment Lassignment,\n\n"+
					"Your personal settings have been registered.";
			String Expect = String.format(msg);
			System.out.println(Expect);
	        String Actual = driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-12']/p")).getText();
	        System.out.println(Actual);
	        Assert.assertEquals(Expect, Actual);
	        System.out.println("Successfully Registered");
	        Thread.sleep(3000);
		}
		
		@When("Click on right corner dropdown")
		public void click_on_right_corner_dropdown() {
            driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		}
		
		@When("Validate the email Id {string}")
		public void validate_the_email_id(String mail) {
		   String Actual = driver.findElement(By.xpath("//p[contains(text(),'.com')]")).getText();
		   String Expected = mail;
	       Assert.assertEquals(Expected, Actual);
           System.out.println("Verified mail ID");
		}
		
		@When("Click on Homepage tab")
		public void click_on_homepage_tab() {
            driver.findElement(By.xpath("//a[@title='Homepage']")).click();			
		}
		
		@When("Click on Compose")
		public void click_on_compose() {
            driver.findElement(By.xpath("//a[text()='Compose']")).click();			
        }
		
		@When("Enter Send to address {string}")
		public void enter_send_to_address(String address) throws InterruptedException {
            driver.findElement(By.xpath("//input[@type='search']")).sendKeys(address);		
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span/ul/li[text()='naveen naveen (naveen)']")).click();
        }
		
		@When("Enter the Subject {string}")
		public void enter_the_subject(String subject) {
            driver.findElement(By.id("compose_message_title")).sendKeys(subject);			
        }
		
		@When("Enter the Message")
		public void enter_the_message() throws InterruptedException {
            Thread.sleep(5000);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, content']")));
            driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']"))
            .sendKeys("Hello,\n"
            		+ "This is For Testing\n\n\n"
            		+ "From,\n"
            		+ "Naveen");		
            driver.switchTo().defaultContent();
        }
		
		@When("Click on Send Message button")
		public void click_on_send_message_button() throws InterruptedException {
			Thread.sleep(5000);
            driver.findElement(By.id("compose_message_compose")).click();			
		}
		
		
		@Then("the acknowledgement is shown")
		public void the_acknowledgement_is_shown() {
           String Actual = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
           System.out.print(Actual);
           String Expected = "The message has been sent to naveen naveen (naveen)";
 	       Assert.assertEquals(Expected, Actual);
 	       System.out.println("Email sent");
 	       }




}
