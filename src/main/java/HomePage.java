import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    By SignupButton = By.linkText("Signup");
    WebElement SignupButtonElement;
    By SigninButton = By.xpath("//*[@id=\"menu-item-6853\"]/a");
    WebElement SigninButtonElement;

    public RegisterPage ClickonSignupButton()
    {
        SignupButtonElement = driver.findElement(SignupButton);
        Clicking(SignupButtonElement);
        return new RegisterPage(driver);
    }


   public  LoginPage ClickonSignInButton()
    {
        SigninButtonElement = driver.findElement(SigninButton);
        Clicking(SigninButtonElement);
        return new LoginPage(driver);
    }


}
