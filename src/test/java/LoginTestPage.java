import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTestPage extends TestBase{
    private HomePage homePage;
    private LoginPage loginPage;

    @Test
    public void ValidSignin()
    {
        homePage = new HomePage(driver);
       homePage.ClickonSignInButton();
       loginPage = homePage.ClickonSignInButton();
       loginPage.EnterUserName("test@test.com");
       loginPage.EnterPassword("AA*aa@12345*678");
       loginPage.ClickonLoginButton();
    }
}
