package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RegisterFeatureValidSteps {
    WebDriver driver;

    @Given("user is on register page")
    public void user_is_on_register_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

        System.out.println("user is on register page");
        driver.navigate().to("https://master.demo.sylius.com/en_US/register");
    }
    @When("user enters valid register data")
    public void user_enters_valid_register_data() {
        System.out.println("user enters valid register data");
        driver.findElement(By.xpath("//*[@id=\"sylius_customer_registration_firstName\"]")).sendKeys("dana");
        driver.findElement(By.xpath("//*[@id=\"sylius_customer_registration_lastName\"]")).sendKeys("rohman");
        driver.findElement(By.xpath("//*[@id=\"sylius_customer_registration_email\"]")).sendKeys("dana@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"sylius_customer_registration_phoneNumber\"]")).sendKeys("02121212121");
        driver.findElement(By.xpath("//*[@id=\"sylius_customer_registration_user_plainPassword_first\"]")).sendKeys("11111");
        driver.findElement(By.xpath("//*[@id=\"sylius_customer_registration_user_plainPassword_second\"]")).sendKeys("1111");
    }
    @And("click on register button")
    public void click_on_register_button() {
        System.out.println("click on register button");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/form/button")).click();
    }
    @Then("user is success registration")
    public void user_is_success_registration() {
        System.out.println("user is success registration");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div")).isDisplayed();
    }

}
