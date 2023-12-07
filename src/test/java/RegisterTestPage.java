import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RegisterTestPage extends TestBase{

  private HomePage homePage ;
  private RegisterPage registerPage;

  @Test (priority = 2)
    public void validregisterTC() throws InterruptedException {
      Thread.sleep(3000);
      homePage = new HomePage(driver);
      homePage.ClickonSignupButton();
      registerPage= homePage.ClickonSignupButton();
      registerPage.EnterEmailAddress("\"test1@test.com\"");
      registerPage.EnterPassword("AA*aa@12345*678");
      registerPage.EnterFirstName("ahmed");
      registerPage.EnterLastName("helmi");
      registerPage.ClickonRegisterButton();
  }

  @Test (priority = 1)
  public void invalidemailTC() throws InterruptedException {
    Thread.sleep(3000);
    homePage = new HomePage(driver);
    homePage.ClickonSignupButton();
    registerPage = homePage.ClickonSignupButton();
    registerPage.EnterEmailAddress("");
    registerPage.EnterPassword("\"AA*aa@12345*678\"");
    registerPage.EnterFirstName("ahmed");
    registerPage.EnterLastName("helmi");
    registerPage.ClickonRegisterButton();
  }




}
