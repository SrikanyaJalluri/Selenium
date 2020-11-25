package stepdefs;

import Pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import Pages.LoginPage;

public class FormAuthenticationTest  {
    WebDriver driver;
    final String URL = "https://the-internet.herokuapp.com/";
    LoginPage Pages;

    @Before
    public void openBrowser(){

        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(URL);
        Pages = new LoginPage(driver);

    }

      @After
    public void closeBrowser(){
    driver.quit();
     driver = null;
    }

    @Given("^I click on Form Authentication$")
    public void iClickOnFormAuthentication() {
        Pages.setSearchName();
    }


    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username) throws Throwable {
        Pages.setUserName(username);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws Throwable {
        Pages.setPassWord(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        Pages.setLoginButton();
    }


    @Then("^I should not logged in successfully and error message should display\"([^\"]*)\"$")
    public void iShouldNotLoggedInSuccessfullyAndErrorMessageShouldDisplay(String message) throws Throwable {
           Pages.setErrorMessage(message);
    }
}
