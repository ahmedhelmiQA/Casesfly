import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private By UserName = By.xpath("//form/input[@name=\"username\"]");
    private WebElement UserNameElement;
    private By Password = By.xpath("//form/input[@name=\"password\"]");
    private WebElement PasswordElement;
    private By RememberMe = By.xpath("//form/input[@name=\"remember_me\"]");
    private WebElement RemeberMeElement;
    private By LoginButton = By.xpath("//form/input[@name=\"login_submit\"]");
    private WebElement LoginButtonElement;

    public void EnterUserName(String username)
    {
        UserNameElement = driver.findElement(UserName);
        SendText(UserNameElement,username);
    }
    public void EnterPassword(String password)
    {
        PasswordElement = driver.findElement(Password);
        SendText(PasswordElement,password);
    }
    public void RememberMe()
    {
        RemeberMeElement = driver.findElement(RememberMe);

    }
    public  void ClickonLoginButton()
    {
        LoginButtonElement = driver.findElement(LoginButton);
        Clicking(LoginButtonElement);
            }

}
