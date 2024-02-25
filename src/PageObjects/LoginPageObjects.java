package src.PageObjects;



import src.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class LoginPageObjects extends BasePage {
    @FindBy(name="username")
    WebElement memberIDField;

    @FindBy(name="password")
    WebElement passwordField;

    @FindBy(id="login-button")
    WebElement loginButton;

    public WebElement getLoginButton;
    public String Username;
    public String Password;

    public LoginPageObjects(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getLoginButton()
    {
        waitForWebElement(loginButton);
        return loginButton;
    }


    public void FillLoginFields(String username, String Password)
    {
        this.Username = username;
        memberIDField.sendKeys(username);
        this.Password = Password;
        passwordField.sendKeys(Password);
    }
    public void checkIfLoginWasSuccessful()
    {


    }
}
