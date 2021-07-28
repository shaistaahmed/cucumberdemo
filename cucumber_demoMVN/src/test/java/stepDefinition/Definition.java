package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Definition {
WebDriver driver;

        @Given("Login Page")
        public void login_page() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\MShaistaTarannum\\SFDC_TestAutomation_Lightning\\projectFiles\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/");
        }

        @When("Enter valid name {string}")
        public void enter_valid_name(String name) {
            driver.findElement(By.id("txtUsername")).sendKeys(name);
        }
        @When("Enter valid password {string}")
        public void enter_valid_password(String pwd) {
            driver.findElement(By.id("txtPassword")).sendKeys(pwd);
        }
        @When("Click on Submit button")
        public void click_on_submit_button() {
            driver.findElement(By.id("btnLogin")).click();
        }
        @Then("I should see the username as {string}")
        public void i_should_see_the_username_as(String loginName) throws InterruptedException {
            String Actual = driver.findElement(By.id("welcome")).getText();
            String Expected = loginName;
            Assert.assertEquals(Expected, Actual);
            // I will logout
            driver.findElement(By.id("welcome")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]")).click();
            System.out.println("I am sucessfully logged out");
            Thread.sleep(3000);
            
            driver.quit();
        }
        
        @When("Enter Invalid name {string}")
        public void enter_invalid_name(String name) {
            driver.findElement(By.id("txtUsername")).sendKeys(name);
        }


        @When("Enter Invalid password {string}")
        public void enter_invalid_password(String pwd) {
            driver.findElement(By.id("txtPassword")).sendKeys(pwd);
        }
        
        @Then("I should see Invalid Credential as {string}")
        public void i_should_see_invalid_credential_as(String loginName) {
        	String Actual = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
            String Expected = loginName;
            Assert.assertEquals(Expected, Actual);
            System.out.println("Invalid Credentials");
            driver.quit();

        }



 






 

}