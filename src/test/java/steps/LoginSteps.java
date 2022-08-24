package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {


    WebDriver driver;
    @Given("user is navigated to the specified url")
    public void user_is_navigated_to_the_specified_url() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
            Thread.sleep(2000);

    }
    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        WebElement usernameTextField=driver.findElement(By.id("txtUsername"));
        usernameTextField.sendKeys("admin");


    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
         WebElement loginButton=driver.findElement(By.id("txtUsername"));

    }
    @Then("user is able to see the message Welcome Admin")
    public void user_is_able_to_see_the_message_welcome_admin() {

    }

    @When("user enters different {string} and {string} and verify the {string}")
    public void user_enters_different_and_and_verify_the(String username, String password, String error) {

    }




}
