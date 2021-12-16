package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginFeatureValidSteps {
    WebDriver driver;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

        System.out.println("user is on google search page");
        driver.navigate().to("https://master.demo.sylius.com/en_US/login");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("user enters valid username and password");
        driver.findElement(By.xpath("//*[@id=\"_username\"]")).sendKeys("shop@example.com");
        driver.findElement(By.xpath("//*[@id=\"_password\"]")).sendKeys("sylius");
    }

    @And("click on login button")
    public void click_on_login_button() {
        System.out.println("click on login button");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/form/button")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("user is navigated to the home page");
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div/a[2]")).isDisplayed();
        driver.close();
        driver.quit();
    }
}
