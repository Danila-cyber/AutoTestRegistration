package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage extends BasePage {
    private ChromeDriver driver;
    public MainPage(ChromeDriver paramDriver) {
        super(paramDriver);
        driver = paramDriver;
    }
    private final By btnSignIn = By.linkText("Sign in");
    public void clickSignIn() {
        driver.findElement(btnSignIn).click();
    }
}
