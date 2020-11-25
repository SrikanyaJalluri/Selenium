package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    @FindBy(xpath="//a[@href='/login']")
    public WebElement searchName;
    @FindBy (id ="username")
    public WebElement userName;
    @FindBy(id="password")
    public WebElement passWord;
    @FindBy(xpath="//i[@class='fa fa-2x fa-sign-in']")
    public WebElement loginButton;
    @FindBy(xpath="//div[@id='flash']")
    public WebElement errorMessage;








    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setSearchName(){
        searchName.click();
    }

    public void setUserName(String username){
     userName.sendKeys(username);
    }
    public void setPassWord(String password){
        passWord.sendKeys(password);
    }
    public void setLoginButton(){
        loginButton.click();
    }



}
