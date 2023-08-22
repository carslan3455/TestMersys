package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.Locators;
import utilities.gwd;



public class _01_LoginSteps implements Locators {

    public static WebDriver driver = gwd.getDriver();

    @Given("Navigate to basqar")
    public void navigateToBasqar() {
        System.out.println("Halloo");
        driver.get("https://test.mersys.io/");

        driver.manage().window().maximize();
        System.out.println("Naber");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() throws InterruptedException {
        System.out.println("gherkin");

        Thread.sleep(2000);
        driver.findElement(userName).sendKeys("turkeyts");
        driver.findElement(password).sendKeys("TechnoStudy123");
        driver.findElement(loginBtn).click();

    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() throws InterruptedException {
        System.out.println("maven");
        Thread.sleep(2000);
        System.out.println(driver.findElement(dashboard).getText() + "**");
        Assert.assertEquals(driver.findElement(dashboard).getText(),"Dashboard");

    }
}
