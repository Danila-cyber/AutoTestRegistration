package PageObject;

import AppInfo.UserInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPage extends BasePage {

    private ChromeDriver driver;
    public FirstPage(ChromeDriver paramDriver) {
        super(paramDriver);
        driver = paramDriver;
    }
    private final By inputEmail = By.id("email_create");
    private final By btnRegistration = By.id("SubmitCreate");

    public void firstRegistration() {
        driver.findElement(inputEmail).sendKeys(data.email);
        driver.findElement(btnRegistration).click();
    }
}
