import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class PageBase {
    protected WebDriver driver;

    public PageBase(WebDriver driver)
    {
        this.driver = driver;
    }
    public static void SendText (WebElement element , String text)
    {
        element.sendKeys(text);
    }
    public static void Clicking(WebElement element)
    {
       element.click();
        
    }

}
