import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageBase{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    private By Emailaddress = By.id("reg_email");
    private WebElement EmailAddressElement;
    private By Password = By.id("reg_password");
    private WebElement PasswordElement ;
    private By FirstName = By.id("billing_first_name");
    private WebElement FirstNameElement;
    private By LastName = By.id("billing_last_name");
    private WebElement LastNameElement;
    private By RegisterButton = By.name("register");
    private WebElement RegisterButtonElement;

    public void EnterEmailAddress(String emailAddress)
    {
        EmailAddressElement = driver.findElement(Emailaddress);
    SendText(EmailAddressElement , emailAddress);
    }
    public void EnterPassword(String password)
    {
        PasswordElement = driver.findElement(Password);
        SendText(PasswordElement,password);
    }
    public void EnterFirstName(String firstname)
    {
        FirstNameElement = driver.findElement(FirstName);
        SendText(FirstNameElement,firstname);
    }
    public void EnterLastName(String lastname)
    {
        LastNameElement = driver.findElement(LastName);
        SendText(LastNameElement,lastname);
    }
    public void ClickonRegisterButton()
    {
        RegisterButtonElement = driver.findElement(RegisterButton);
        Clicking(RegisterButtonElement);
    }


}
