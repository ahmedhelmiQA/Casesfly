import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {
    protected WebDriver driver;
    HomePage homePage;

    @BeforeTest
    public void Setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://casesfly.ai/");
    }
    /*
    @Test
    public void HomePageTest()
    {
        homePage = new HomePage(driver);
        homePage.ClickonSignupButton()

    }

     */

}
