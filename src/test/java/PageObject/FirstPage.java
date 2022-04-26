package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPage {
    AppData data = new AppData();

    private ChromeDriver driver;
    public FirstPage(ChromeDriver paramDriver) {
        driver = paramDriver;
    }
    private final By inputEmail = By.id("email_create");
    private final By btnRegistration = By.id("SubmitCreate");
    private void enterEmail(String value) {
        driver.findElement(inputEmail).sendKeys(value);
    }
    private void clickRegistration() {
        driver.findElement(btnRegistration).click();
    }
    public void firstRegistration() {
        enterEmail(data.Email);
        clickRegistration();

    }
}
